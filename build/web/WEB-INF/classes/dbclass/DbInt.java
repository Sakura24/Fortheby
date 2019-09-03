/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbclass;

import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Bishnu
 */
public class DbInt {
    Connection con;
    PreparedStatement pstm;
    ResultSet rs;
    int checkUser=0;
    int checkPassword=0;

    public DbInt() {
        this.DefaultConnection();
    }

    public java.sql.Connection makeConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fortheby", "root", "");
        } catch (Exception e) {
            System.out.println("Error:" + e);

        }
        return con;
    }

    public void DefaultConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fortheby", "root", "");
        } catch (Exception e) {
            System.out.println("Error:" + e);
        }
    }
    
    public int ValidateUser(String email){
     try{
         pstm=con.prepareStatement("SELECT email FROM users WHERE email=?");
         pstm.setString(1,email);
         rs=pstm.executeQuery();
         if(rs.next()){
             checkUser=1;
         }
     } catch (Exception e) {
            System.out.println("Error:" + e);

        }
        
        return checkUser;
    }
    
    public int ValidatePassword(String email,String password){
     try{
         pstm=con.prepareStatement("SELECT AES_DECRYPT(password,'secret') AS password FROM users WHERE email=?");
         pstm.setString(1,email.toLowerCase());
         rs=pstm.executeQuery();
         rs.next();
         if(password.equalsIgnoreCase(rs.getString(1))){
            checkPassword=1;
         }
     } catch (Exception e) {
            System.out.println("Error:" + e);

        }
        
        return checkPassword;
    }
    
    public String ValidateUserForRole(String email){
        String user_type_id = "ddd";
     try{
         pstm=con.prepareStatement("SELECT user_type_id FROM users WHERE email=?");
         pstm.setString(1,email);
         rs=pstm.executeQuery();
         if (rs.next()){
            user_type_id= rs.getString(1);
         }
     } catch (Exception e) {
            System.out.println("Error:" + e);

        }
        return user_type_id;
    }
}


