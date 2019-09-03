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

    public int User(String first_name, String last_name, String age, String gender, String address, String contact_no, String user_type_id, String email, String password) { // it inserts the user details + the encrypt password
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
    
    public int User1(String username, String contact_no, String address, String user_type_id, String email, String password, String form_id) {// this function adds the form details n the database
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
    
    public int InterestForm(String first_name, String last_name, String gender, String contact_no, String profession, String user_type_id, String acc_no, String sort_no, String interest, String email) {
        out.print("firstname" + first_name); // this function saves the data of interest form
        out.print("lastname" + last_name);
        out.print("age" + gender);
        out.print("contact_no" + contact_no);
        out.print("profession" + profession);
        out.print("user_type" + user_type_id);
        out.print("acc_no" + acc_no);
        out.print("sort_no" + sort_no);
        out.print("interest" + interest);
        out.print("email" + email);
        try {
            pstm = con.prepareStatement("INSERT INTO interest_forms (first_name, last_name, gender, contact_no, profession, user_type_id, acc_no, sort_no, interest, email) VALUES (?,?,?,?,?,?,?,?,?,?)");
            pstm.setString(1, first_name);
            pstm.setString(2, last_name);
            pstm.setString(3, gender);
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
    
    public int Contact(String user_id, String title, String description) {// this ofrms inserts the contat details
        try {
            pstm = con.prepareStatement("INSERT INTO contacts (user_id, title, description) VALUES (?,?,?)");
            pstm.setString(1, user_id);
            pstm.setString(2, title);
            pstm.setString(3, description);
            var = pstm.executeUpdate();

        } catch (Exception ex) {
            ex.getMessage();
        }

        return var;
    }
    
    public int ReplyContact(String contact_id, String description) {// this function stores the reply of the contact
        try {
            pstm = con.prepareStatement("INSERT INTO replies (contact_id, description) VALUES (?,?)");
            pstm.setString(1, contact_id);
            pstm.setString(2, description);
            var = pstm.executeUpdate();

        } catch (Exception ex) {
            ex.getMessage();
        }

        return var;
    }
    
    public int AddAuction(String title, String location, String date, String auction_lot, String period) {// it is used to store the aucion details
        try {
            pstm = con.prepareStatement("INSERT INTO auctions (title, location, date, auction_lot, period) VALUES (?,?,?,?,?)");
            pstm.setString(1, title);
            pstm.setString(2, location);
            pstm.setString(3, date);
            pstm.setString(4, auction_lot);
            pstm.setString(5, period);
            var = pstm.executeUpdate();

        } catch (Exception ex) {
            ex.getMessage();
        }

        return var;
    }
    
    public int AddBid(String user_id, String item_lot, String bid_amount) { // it is used to store the bid
        try {
            pstm = con.prepareStatement("INSERT INTO biddings (user_id, item_lot, bid_amount) VALUES (?,?,?)");
            pstm.setString(1, user_id);
            pstm.setString(2, item_lot);
            pstm.setString(3, bid_amount);
            var = pstm.executeUpdate();
        } catch (Exception ex) {
            ex.getMessage();
        }

        return var;
    }
}
