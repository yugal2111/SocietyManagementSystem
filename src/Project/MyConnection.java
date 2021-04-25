package Project;



import java.sql.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yugal
 */
public class MyConnection {
       public static Connection getConnection(){
        Connection con = null;
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3307/signup","root","");
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return con;
    }

    Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
