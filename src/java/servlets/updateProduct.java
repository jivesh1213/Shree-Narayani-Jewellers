package servlets;

import db.JDBC;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;


@MultipartConfig(fileSizeThreshold=1024*1024*2, 
maxFileSize=1024*1024*10, 
maxRequestSize=1024*1024*50)

@WebServlet(name = "updateProduct", urlPatterns = {"/updateProduct"})
public class updateProduct extends HttpServlet {

    private String getFileName(final Part part) {
    final String partHeader = part.getHeader("content-disposition");
    
    for (String content : part.getHeader("content-disposition").split(";")) {
        if (content.trim().startsWith("filename")) {
            return content.substring(
                    content.indexOf('=') + 1).trim().replace("\"", "");
        }
    }
    return null;
}
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

            HttpSession session = request.getSession(false);
            String itemName = request.getParameter("item_name");
            String category = request.getParameter("category");
            String weight = request.getParameter("weight");
            String polish = request.getParameter("polish");
            String purity = request.getParameter("purity");
            String description = request.getParameter("description");
            Part filePart = request.getPart("img");
            String p_img = request.getParameter("p_img"); // previous Name
            String fileName = getFileName(filePart); // new Name
            if(!"".equals(fileName)){
        
        String ext = fileName.substring(fileName.length() - 4);
        String photo="";
        String path="/opt/tomcat/webapps/ShreeNJ/images";
          
            File f=new File("/opt/tomcat/webapps/ShreeNJ/images/" + p_img);
            f.delete();

            JDBC jdbc = new JDBC();
            int num = jdbc.returnIndex(); // number which is to be used and then increment
            String newName = String.valueOf(num) + ext;
            
            File file=new File(path);
            file.mkdir();
          
            OutputStream out = null;
          
            InputStream filecontent = null;
            
            PrintWriter writer = response.getWriter();
            try {
        out = new FileOutputStream(new File(path + File.separator
                + newName));
        
        filecontent = filePart.getInputStream();
     
 
        int read = 0;
        final byte[] bytes = new byte[1024];
 
        while ((read = filecontent.read(bytes)) != -1) {
            out.write(bytes, 0, read);
            photo=path+"/"+newName;
        }
        
        jdbc.updateProd(itemName, weight, polish, category, description, purity, newName, p_img);
        jdbc.updateIndex(num);
        RequestDispatcher rd = request.getRequestDispatcher("Home.jsp");
        rd.forward(request, response);
    }
     catch(IOException | ServletException e)
     {
            System.out.println(e);
            RequestDispatcher rd = request.getRequestDispatcher("Home.jsp");
            rd.forward(request, response);
     }
        }
        else{
            JDBC jdbc = new JDBC();
            jdbc.updateProd(itemName, weight, polish, category, description, purity, p_img, p_img);
            
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
