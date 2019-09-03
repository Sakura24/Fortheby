/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbclass;

import static java.lang.System.out;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Bishnu
 */
public class DbInsert {
    DbInt dbFunction = new DbInt();
    Connection con = dbFunction.makeConnection();
    PreparedStatement pstm;
    int var = 0;

    public int User(String first_name, String last_name, String age, String gender, String address, String contact_no, String user_type_id, String email, String password) {
        try {
            pstm = con.prepareStatement("INSERT INTO users (first_name, last_name, age, gender, address, contact_no,user_type_id,email,password) VALUES (?,?,?,?,?,?,?,?,AES_ENCRYPT(?, 'secret'))");
            pstm.setString(1, first_name);
            pstm.setString(2, last_name);
            pstm.setString(3, age);
            pstm.setString(4, gender);
            pstm.setString(5, address);
            pstm.setString(6, contact_no);
            pstm.setString(7, user_type_id);
            pstm.setString(8, email.toLowerCase());
            pstm.setString(9, password);
            var = pstm.executeUpdate();

        } catch (Exception ex) {
            ex.getMessage();
        }

        return var;
    }
    
    public int User1(String username, String contact_no, String address, String user_type_id, String email, String password, String form_id) {
        try {
            pstm = con.prepareStatement("INSERT INTO users (username, contact_no, address, user_type_id, email, password, form_id) VALUES (?,?,?,?,?,AES_ENCRYPT(?, 'secret'), ?)");
            pstm.setString(1, username);
            pstm.setString(2, contact_no);
            pstm.setString(3, address);
            pstm.setString(4, user_type_id);
            pstm.setString(5, email);
            pstm.setString(6, password);
            pstm.setString(7, form_id);
            var = pstm.executeUpdate();

        } catch (Exception ex) {
            ex.getMessage();
        }

        return var;
    }
    
    public int InterestForm(String first_name, String last_name, String age, String contact_no, String profession, String user_type_id, String acc_no, String sort_no, String interest, String email) {
        out.print("firstname" + first_name);
        out.print("lastname" + last_name);
        out.print("age" + age);
        out.print("contact_no" + contact_no);
        out.print("profession" + profession);
        out.print("user_type" + user_type_id);
        out.print("acc_no" + acc_no);
        out.print("sort_no" + sort_no);
        out.print("interest" + interest);
        out.print("email" + email);
        try {
            pstm = con.prepareStatement("INSERT INTO interest_forms (first_name, last_name, age, contact_no, profession, user_type_id, acc_no, sort_no, interest, email) VALUES (?,?,?,?,?,?,?,?,?,?)");
            pstm.setString(1, first_name);
            pstm.setString(2, last_name);
            pstm.setString(3, age);
            pstm.setString(4, contact_no);
            pstm.setString(5, profession);
            pstm.setString(6, user_type_id);
            pstm.setString(7, acc_no);
            pstm.setString(8, sort_no);
            pstm.setString(9, interest);
            pstm.setString(10, email);
            var = pstm.executeUpdate();
            out.print("inserted");
        } catch (Exception ex) {
            out.print("Not Inserted");
        }

        return var;
    }
}
