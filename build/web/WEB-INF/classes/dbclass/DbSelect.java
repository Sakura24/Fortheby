/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbclass;

import static java.lang.System.out;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Bishnu
 */
public class DbSelect {
    DbInt dbFunction = new DbInt();
    ResultSet result;
    Connection con = dbFunction.makeConnection();
    PreparedStatement pstm;
    int chk = 0;
    
    public int ItemByCatCount(String cat_id) {
        int count = 0;
        try {
            pstm = con.prepareStatement("SELECT * FROM items WHERE cat_id = ?");
            pstm.setString(1, cat_id);
            result = pstm.executeQuery();
            result.last();
            count = Integer.valueOf(result.getRow());
            out.print(count);
        } catch (Exception e) {
            System.out.println("Error:" + e);

        }
        return count;
    }
    
    public int InterestFormCount() {
        int count = 0;
        try {
            pstm = con.prepareStatement("SELECT * FROM interest_forms WHERE status = 0");
            result = pstm.executeQuery();
            result.last();
            count = Integer.valueOf(result.getRow());
            out.print(count);
        } catch (Exception e) {
            System.out.println("Error:" + e);

        }
        return count;
    }
    
    public int ItemCount() {
        int count = 0;
        try {
            pstm = con.prepareStatement("SELECT * FROM items");
            result = pstm.executeQuery();
            result.last();
            count = Integer.valueOf(result.getRow());
            out.print(count);
        } catch (Exception e) {
            System.out.println("Error:" + e);

        }
        return count;
    }
    
    public ResultSet DisplayCategory() {
        try {
            pstm = con.prepareStatement("SELECT * FROM categories");
            result = pstm.executeQuery();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return result;
    }
    
    public ResultSet DisplayCategoryById(int cat_id) {
        try {
            pstm = con.prepareStatement("SELECT * FROM categories WHERE cat_id =?");
            pstm.setInt(1, cat_id);
            result = pstm.executeQuery();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return result;
    }
    
    public String CategoryNameById(String cat_id) {
        String foodName = "";
        try {
            pstm = con.prepareStatement("SELECT cat_name FROM categories WHERE cat_id=?");
            pstm.setString(1, cat_id);
            result = pstm.executeQuery();
            if (result.next()) {
                result.first();
                foodName = result.getString(1);
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
        }

        return foodName;
    }
    
    public String UserTypeById(String user_type_id) {
        String type_name = "";
        try {
            pstm = con.prepareStatement("SELECT user_type FROM user_types WHERE user_type_id=?");
            pstm.setString(1, user_type_id);
            result = pstm.executeQuery();
            if (result.next()) {
                result.first();
                type_name = result.getString(1);
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
        }

        return type_name;
    }
    
     public ResultSet DisplayItem() {
        try {
            pstm = con.prepareStatement("SELECT * FROM items");
            result = pstm.executeQuery();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return result;
    }
     
     public ResultSet DisplayItemByName(String item_name) {
        try {
            pstm = con.prepareStatement("SELECT * FROM items WHERE item_name = ?");
            pstm.setString(1, item_name);
            result = pstm.executeQuery();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return result;
    }
    
    public ResultSet DisplayItemById( String item_lot) {
        try {
            pstm = con.prepareStatement("SELECT * FROM items WHERE item_lot = ?");
            pstm.setString(1, item_lot);
            result = pstm.executeQuery();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return result;
    }
    
    public ResultSet DisplayItemByCatId(String cat_id) {
        try {
            pstm = con.prepareStatement("SELECT * FROM items WHERE cat_id = ?");
            pstm.setString(1, cat_id);
            result = pstm.executeQuery();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return result;
    }
    
    public ResultSet DisplayUserType() {
        try {
            pstm = con.prepareStatement("SELECT * FROM user_types");
            result = pstm.executeQuery();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return result;
    }
    
    public ResultSet filterUserType() {
        try {
            pstm = con.prepareStatement("SELECT * FROM user_types WHERE status = 1");
            result = pstm.executeQuery();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return result;
    }
    
    public ResultSet DisplayUsers() {
        try {
            pstm = con.prepareStatement("SELECT interest_forms.first_name, interest_forms.last_name,interest_forms.age,interest_forms.contact_no,users.contact_no,users.address, interest_forms.acc_no,interest_forms.sort_no,users.user_type_id,users.email,users.password FROM interest_forms INNER JOIN users ON interest_forms.form_id = users.form_id WHERE users.form_id >0");
            result = pstm.executeQuery();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return result;
    }
    
    public String GetUserNameFromEmail(String usrEmail) {
        String userName = "";
        try {
            pstm = con.prepareStatement("SELECT username FROM users WHERE email=? ");
            pstm.setString(1, usrEmail);
            result = pstm.executeQuery();
            if (result.next()) {
                result.first();
                userName = result.getString(1);
            }
        } catch (Exception ex) {
            ex.getMessage();
        }
        return userName;
    }
    
    public ResultSet DisplayItems() {
        try {
            pstm = con.prepareStatement("SELECT * From items");
            result = pstm.executeQuery();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return result;
    }
    
    public ResultSet InterestForm() {
        try {
            pstm = con.prepareStatement("SELECT * FROM interest_forms WHERE status = 0");
            result = pstm.executeQuery();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return result;
    }
    
    public ResultSet FilterInterestForm() {
        try {
            pstm = con.prepareStatement("SELECT interest_forms.first_name, interest_forms.last_name, interest_forms.age, interest_forms.contact_no, interest_forms.profession, user_types.user_type, interest_forms.acc_no, interest_forms.sort_no, interest_forms.interest, interest_forms.email FROM interest_forms INNER JOIN user_types ON interest_forms.user_type_id = user_types.user_type_id WHERE interest_forms.status = 0");
            result = pstm.executeQuery();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return result;
    }
}
