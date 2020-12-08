package servlets;

import db.JDBC;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "login", urlPatterns = {"/login"})
public class login extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        if("".equals(email) || "".equals(password)){
            request.setAttribute("login_status", "yes");
            request.setAttribute("login_email", email);
            request.setAttribute("login_pass", password);
        }
        else{
            JDBC jdbc = new JDBC();
            String username = jdbc.check(email, password);
            if("".equals(username)){
                request.setAttribute("login_status", "yes");
                request.setAttribute("login_email", email);
                request.setAttribute("login_msg", "Invalid Email or password");
            }
            else{
                HttpSession session = request.getSession(true);
                session.setAttribute("username", username);
                session.setAttribute("email", email);
                session.setMaxInactiveInterval(60*60); // 60 minutes
            }
        }
        
        RequestDispatcher rd = request.getRequestDispatcher("Home.jsp");
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
