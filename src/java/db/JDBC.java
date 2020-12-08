package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pojo.enquiry;
import pojo.products;

public class JDBC {

    String username = "";
    public String check(String email, String password){
        
        try{
            Connection con = null;
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            PreparedStatement pst = null;
            
            String q = "Select * from snj_register where email = ? AND password = ?";
            pst = con.prepareStatement(q);
            pst.setString(1, email);
            pst.setString(2, password);
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                username = rs.getString("username");
            }
            pst.close();
            con.close();
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return username;
    }
    
    public void enterDetails(String username, String city, String area, String pincode, String contact, String email, String password){
        try{
            Connection con = null;
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            PreparedStatement pst = null;
            
            String q = "insert into snj_register values(?,?,?,?,?,?,?)";
            pst = con.prepareStatement(q);
            pst.setString(1, username);
            pst.setString(2, city);
            pst.setString(3, area);
            pst.setString(4, pincode);
            pst.setString(5, contact);
            pst.setString(6, email);
            pst.setString(7, password);
            pst.executeUpdate();
            
            pst.close();
            con.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updatePass(String email, String password){
        try{
            Connection con = null;
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            PreparedStatement pst = null;
            
            String q = "Update snj_register set password = ? where email = ?";
            pst = con.prepareStatement(q);
            pst.setString(1, password);
            pst.setString(2, email);
            pst.executeUpdate();
            
            pst.close();
            con.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public String checkEmail(String email){
        try{
            Connection con = null;
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            PreparedStatement pst = null;
            
            String q = "Select * from snj_register where email = ?";
            pst = con.prepareStatement(q);
            pst.setString(1, email);
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                username = rs.getString("username");
            }
            
            pst.close();
            con.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return username;
    }
    
    public void newProduct(String itemName, String weight, String polish, String category, String description, String purity, String image){
        try{
            Connection con = null;
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            PreparedStatement pst = null;
            
            String q = "insert into snj_products values(?,?,?,?,?,?,?)";
            pst = con.prepareStatement(q);
            pst.setString(1, itemName);
            pst.setString(2, weight);
            pst.setString(3, polish);
            pst.setString(4, category);
            pst.setString(5, description);
            pst.setString(6, purity);
            pst.setString(7, image);
            pst.executeUpdate();
            
            pst.close();
            con.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<products> getProducts(String category){
        
            List<products> prod = new ArrayList();
            
        try{
            Connection con = null;
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            PreparedStatement pst = null;
            String q = "";
            if("All Products".equals(category) || "Admin".equals(category)){
                q = "Select * from snj_products";
                pst = con.prepareStatement(q);
            }
            else{
                q = "Select * from snj_products where category = ?";
                pst = con.prepareStatement(q);
                pst.setString(1, category);
            }
            
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                prod.add(new products(rs.getString("itemname"),rs.getString("weight"),rs.getString("polish"),rs.getString("category"),rs.getString("description"),rs.getString("purity"),rs.getString("image")));
            }
            
            pst.close();
            con.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return prod;
    }
    public void updateProd(String itemName, String weight, String polish, String category, String description, String purity, String image, String p_image){
        try{
            Connection con = null;
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            PreparedStatement pst = null;
            
            String q = "Update snj_products set itemname = ? , weight = ? , polish = ? , category = ? , description = ? , purity = ? , image = ? where image = ?";
            pst = con.prepareStatement(q);
            pst.setString(1, itemName);
            pst.setString(2, weight);
            pst.setString(3, polish);
            pst.setString(4, category);
            pst.setString(5, description);
            pst.setString(6, purity);
            pst.setString(7, image);
            pst.setString(8, p_image);
            
            pst.executeUpdate();
            
            pst.close();
            con.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deleteProd(String image){
        try{
            Connection con = null;
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            PreparedStatement pst = null;
            
            String q = "Delete from snj_products where image = ?";
            pst = con.prepareStatement(q);
            pst.setString(1, image);
            
            pst.executeUpdate();
            
            pst.close();
            con.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public int returnIndex(){
        int index = 0;
        try{
            Connection con = null;
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            PreparedStatement pst = null;
            
            String q = "Select * from snj_number";
            pst = con.prepareStatement(q);
            
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                index = rs.getInt("index");
            }
            
            pst.close();
            con.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return index;
    }
    public void updateIndex(int index){
        try{
            Connection con = null;
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            PreparedStatement pst = null;
            
            String q = "Update snj_number set index = ? where index = ?";
            pst = con.prepareStatement(q);
            pst.setInt(1, index + 1);
            pst.setInt(2, index);
            pst.executeUpdate();
            
            pst.close();
            con.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void saveEnq(String email, String description, String date, String name, String time, String itemname, String category, String weight){
        try{
            Connection con = null;
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            PreparedStatement pst = null;
            
            String q = "insert into snj_enquiry values(?,?,?,?,?,?,?,?,?)";
            pst = con.prepareStatement(q);
            pst.setString(1, email);
            pst.setString(2, description);
            pst.setString(3, date);
            int index = getIndex();
            System.out.println(index);
            pst.setInt(4, index + 1);
            pst.setString(5, name);
            pst.setString(6, time);
            pst.setString(7, itemname);
            pst.setString(8, category);
            pst.setString(9, weight);
            pst.executeUpdate();
            
            pst.close();
            con.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public List<enquiry> getEnq(){

        List<enquiry> enq = new ArrayList();
            
        try{
            Connection con = null;
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            PreparedStatement pst = null;
            
            String q = "Select * from snj_enquiry";
            pst = con.prepareStatement(q);
            
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                enq.add(new enquiry(rs.getString("email"),rs.getString("description"),rs.getString("date"),rs.getInt("index"),rs.getString("name"),rs.getString("time"),rs.getString("itemname"),rs.getString("category"),rs.getString("weight")));
            }
            
            pst.close();
            con.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }

        return enq;
    }
    public void deleteEnq(int index){
        try{
            Connection con = null;
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            PreparedStatement pst = null;
            
            String q = "Delete from snj_enquiry where index = ?";
            pst = con.prepareStatement(q);
            pst.setInt(1, index);
            
            pst.executeUpdate();
            
            pst.close();
            con.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public int getIndex(){
        int index = 0;
        try{
            Connection con = null;
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            PreparedStatement pst = null;
            
            String q = "Select * from snj_enquiry";
            pst = con.prepareStatement(q);
            
            ResultSet rs = pst.executeQuery();
            
            while(rs.next())
                index = rs.getInt("index");
        
        pst.close();
            con.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return index;
    }
}
