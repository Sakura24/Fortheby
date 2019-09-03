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
public class DbDelete {
    DbInt dbFunction = new DbInt();
    ResultSet result;
    Connection con = dbFunction.makeConnection();
    PreparedStatement pstm; 
    int execute = 0;
    
    public int DeleteCategory(String cat_id) {
        try {
            pstm = con.prepareStatement("DELETE FROM categories WHERE cat_id=?"); // this function is used to delete the categories
            pstm.setString(1, cat_id);
            execute = pstm.executeUpdate();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return execute;
    }
    
    public int DeleteItem(String item_lot) {// this function is used to delete the items
        try {
            pstm = con.prepareStatement("DELETE FROM items WHERE item_lot=?");
            pstm.setString(1, item_lot);
            execute = pstm.executeUpdate();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return execute;
    }
    
    public int DeleteAuction(String auction_id) {// this fucntion delete the auctions
        try {
            pstm = con.prepareStatement("DELETE FROM auctions WHERE auction_id=?");
            pstm.setString(1, auction_id);
            execute = pstm.executeUpdate();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return execute;
    }
    
}
