package servlets;

import java.io.IOException;
import java.util.Random;
import javax.mail.MessagingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import pojo.EmailUtility;

@WebServlet(name = "emailSending", urlPatterns = {"/emailSending"})
public class emailSending extends HttpServlet {
    private String host;
    private String port;
    private String user;
    private String pass;
    
    @Override
    public void init(){
        ServletContext context = getServletContext();
        host = context.getInitParameter("host");
        port = context.getInitParameter("port");
        user = context.getInitParameter("user");
        pass = context.getInitParameter("pass");
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
        HttpSession session = request.getSession(false);
        String email = (String) session.getAttribute("email");
        
        try{
                int s_otp = 100000 + new Random().nextInt(900000);
                String otp = "";
                otp += s_otp;
                EmailUtility.sendEmail(host, port, user, pass, email, "OTP to verify your account", "Your OTP is : " + otp);
                session.setAttribute("send_otp", otp);
                request.setAttribute("otp_status", "yes");   
                RequestDispatcher rd = request.getRequestDispatcher("Home.jsp");
                rd.forward(request, response);
            }
            catch (MessagingException ex) {
                System.out.println(ex);
                RequestDispatcher rd = request.getRequestDispatcher("Home.jsp");
                rd.forward(request, response);
            }
            
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
