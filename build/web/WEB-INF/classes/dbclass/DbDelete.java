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
            pstm = con.prepareStatement("DELETE FROM categories WHERE cat_id=?");
            pstm.setString(1, cat_id);
            execute = pstm.executeUpdate();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return execute;
    }
}
