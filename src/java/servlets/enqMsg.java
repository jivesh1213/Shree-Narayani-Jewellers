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
import pojo.validations;

@WebServlet(name = "enqMsg", urlPatterns = {"/enqMsg"})
public class enqMsg extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        String page = request.getParameter("page");
        String email = request.getParameter("email");
        String description = request.getParameter("msg");
        String name = (String) session.getAttribute("username");
        String itemname = request.getParameter("itemname");
        String category = request.getParameter("category");
        String weight = request.getParameter("weight");
        
        validations vd = new validations();
        String date = vd.Date();
        String time = vd.Time();
        
        JDBC jdbc = new JDBC();
        jdbc.saveEnq(email, description, date, name, time, itemname, category, weight);
        
        request.setAttribute("enquiry_status", "yes");
        
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
