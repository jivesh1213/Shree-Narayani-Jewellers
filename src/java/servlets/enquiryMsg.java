package servlets;

import java.io.IOException;
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

@WebServlet(name = "enquiryMsg", urlPatterns = {"/enquiryMsg"})
public class enquiryMsg extends HttpServlet {
    
    private String host;
    private String port;
    private String user;
    private String pass;
    
    public void init(){
        ServletContext context = getServletContext();
        host = context.getInitParameter("host");
        port = context.getInitParameter("port");
        user = context.getInitParameter("user");
        pass = context.getInitParameter("pass");
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(true);
        String email = request.getParameter("email");
        String msg = request.getParameter("msg");
        String page = request.getParameter("page");
        
        try{
    
                EmailUtility.sendEmail(host, port, user, pass, "jiveshfav.gohan@gmail.com", "An Enquiry!!","Enquiry : " + msg + "\n From " + email);
                EmailUtility.sendEmail(host, port, user, pass, email, "Enquiry received - Shree Narayani Jewellers ", "Your Enquiry has been received. \n We will get back to you as soon as possible.");
                request.setAttribute("enquiry_status", "yes");
            }
            catch (MessagingException ex) {
                ex.printStackTrace();
            }
            
            RequestDispatcher rd = request.getRequestDispatcher(page);
            rd.forward(request, response);
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
