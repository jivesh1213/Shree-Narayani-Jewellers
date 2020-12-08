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

@WebServlet(urlPatterns = {"/registration"})
public class registration extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String name = request.getParameter("name");
        String city = request.getParameter("city");
        String area = request.getParameter("area");
        String pincode = request.getParameter("pincode");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String password = request.getParameter("pass");
        String c_pass = request.getParameter("c_pass");
        JDBC jdbc = new JDBC();
        
        validations vd = new validations();
        if("".equals(name) || "".equals(city) || "".equals(area) || "".equals(pincode) || "".equals(phone) || "".equals(email)){
            request.setAttribute("reg_status", "yes");
            request.setAttribute("reg_name", name);
            request.setAttribute("reg_city", city);
            request.setAttribute("reg_area", area);
            request.setAttribute("reg_code", pincode);
            request.setAttribute("reg_phone", phone);
            request.setAttribute("reg_email", email);
            request.setAttribute("reg_pass", password);
            request.setAttribute("empty_msg", "Please fill all the Credentials");
        }
        else if(!vd.pinValid(pincode)){
            request.setAttribute("reg_status", "yes");
            request.setAttribute("reg_name", name);
            request.setAttribute("reg_city", city);
            request.setAttribute("reg_area", area);
            request.setAttribute("reg_code", pincode);
            request.setAttribute("reg_phone", phone);
            request.setAttribute("reg_email", email);
            request.setAttribute("reg_pass", password);
            request.setAttribute("code_msg", "Invalid Pincode");
        }
        else if(!vd.numValid(phone)){
            request.setAttribute("reg_status", "yes");
            request.setAttribute("reg_name", name);
            request.setAttribute("reg_city", city);
            request.setAttribute("reg_area", area);
            request.setAttribute("reg_code", pincode);
            request.setAttribute("reg_phone", phone);
            request.setAttribute("reg_email", email);
            request.setAttribute("reg_pass", password);
            request.setAttribute("phn_msg", "Invalid Phone Number");
        }
        else if(!vd.isValid(email)){
            request.setAttribute("reg_status", "yes");
            request.setAttribute("reg_name", name);
            request.setAttribute("reg_city", city);
            request.setAttribute("reg_area", area);
            request.setAttribute("reg_code", pincode);
            request.setAttribute("reg_phone", phone);
            request.setAttribute("reg_email", email);
            request.setAttribute("reg_pass", password);
            request.setAttribute("email_msg", "Invalid Email Address");
        }
        else if(password.length() < 6){
            request.setAttribute("reg_status", "yes");
            request.setAttribute("reg_name", name);
            request.setAttribute("reg_city", city);
            request.setAttribute("reg_area", area);
            request.setAttribute("reg_code", pincode);
            request.setAttribute("reg_phone", phone);
            request.setAttribute("reg_email", email);
            request.setAttribute("reg_pass", password);
            request.setAttribute("size_msg", "Password should contain at least 6 characters");
        }
        else if(!password.equals(c_pass)){
            request.setAttribute("reg_status", "yes");
            request.setAttribute("reg_name", name);
            request.setAttribute("reg_city", city);
            request.setAttribute("reg_area", area);
            request.setAttribute("reg_code", pincode);
            request.setAttribute("reg_phone", phone);
            request.setAttribute("reg_email", email);
            request.setAttribute("reg_pass", password);
            request.setAttribute("pass_msg", "Password Not Match");
        }
        else if(!"".equals(jdbc.checkEmail(email))){
            request.setAttribute("reg_status", "yes");
            request.setAttribute("reg_name", name);
            request.setAttribute("reg_city", city);
            request.setAttribute("reg_area", area);
            request.setAttribute("reg_code", pincode);
            request.setAttribute("reg_phone", phone);
            request.setAttribute("reg_email", email);
            request.setAttribute("reg_pass", password);
            request.setAttribute("exist_msg", "Email ID already exists");
        }
        else {
            HttpSession session = request.getSession(true);
            jdbc.enterDetails(name, city, area, pincode, phone, email, password);
            session.setAttribute("email", email);
            session.setAttribute("username", name);
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
