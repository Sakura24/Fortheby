/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbclass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Bishnu
 */
public class DbSearch {
    DbInt dbFunction = new DbInt();
    ResultSet result;
    Connection con = dbFunction.makeConnection();
    PreparedStatement pstm;
    int chk = 0;
    
    public ResultSet DisplayItemById(String item_lot) {// used for the search criteria
        try {
            pstm = con.prepareStatement("SELECT * FROM items WHERE item_lot = ?");
            pstm.setString(1, item_lot);
            result = pstm.executeQuery();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return result;
    }
    
    public ResultSet SearchWithCatItem(String cat_id, String item_lot) {// used for search criteria
        try {
            pstm = con.prepareStatement("SELECT * FROM items WHERE cat_id = ? AND item_lot = ?");
            pstm.setString(1, cat_id);
            pstm.setString(2, item_lot);
            result = pstm.executeQuery();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return result;
    }
    
    public ResultSet SearchWithDates(String current_date, String month_date) {// searchign with the date values 
        try {
            pstm = con.prepareStatement("SELECT * FROM items WHERE (auction_date) BETWEEN ? AND ? AND sold_status = 0 AND status = 0");
            pstm.setString(1, current_date);
            pstm.setString(2, month_date);
            result = pstm.executeQuery();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return result;
    }
    
    public ResultSet searchWithTwoDatesAndCat(String current_date, String month_date, int cat_id) {// searching with the date and the category
        try {
            pstm = con.prepareStatement("SELECT * FROM items WHERE auction_date BETWEEN ? AND ?  AND cat_id = ?  AND sold_status = 0 AND status = 0");
            pstm.setString(1, current_date);
            pstm.setString(2, month_date);
            pstm.setInt(3, cat_id);
            result = pstm.executeQuery();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return result;
    }
    
    public ResultSet searchWithTwoDatesAndItem(String current_date, String month_date, int item_lot) {
        try {
            pstm = con.prepareStatement("SELECT * FROM items WHERE auction_date BETWEEN ? AND ?  AND item_lot = ? AND sold_status = 0 AND status = 0");
            pstm.setString(1, current_date);
            pstm.setString(2, month_date);
            pstm.setInt(3, item_lot);
            result = pstm.executeQuery();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return result;
    }
    
    public ResultSet searchWithCatAndItem(String current_date, String month_date, int cat_id, int item_lot) {
        try {
            pstm = con.prepareStatement("SELECT * FROM items WHERE auction_date BETWEEN ? AND ?  AND cat_id = ? AND item_lot = ? AND sold_status = 0 AND status = 0");
            pstm.setString(1, current_date);
            pstm.setString(2, month_date);
             pstm.setInt(3, cat_id);
            pstm.setInt(4, item_lot);
            result = pstm.executeQuery();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return result;
    }
    
    public ResultSet searchWithoutDate(int cat_id, int item_lot) { //searching without date
        try {
            pstm = con.prepareStatement("SELECT * FROM items WHERE cat_id = ? AND item_lot = ? AND sold_status = 0 AND status = 0");
            pstm.setInt(1, cat_id);
            pstm.setInt(2, item_lot);
            result = pstm.executeQuery();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return result;
    }

}
