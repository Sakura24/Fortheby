/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbclass;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Bishnu
 */
public class DbUpdate {
    DbInt dbFunction = new DbInt();
    Connection con = dbFunction.makeConnection();
    PreparedStatement pstm;
    int execute = 0;
    
    public int UpdateCategory(String cat_name, int cat_id) {
        try {
            pstm = con.prepareStatement("UPDATE categories SET cat_name=? WHERE cat_id=?");
            pstm.setString(1, cat_name);
            pstm.setInt(2, cat_id);
            execute = pstm.executeUpdate();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return execute;
    }
    
    public Integer UpdateInterestStatus(String form_id) {
        try {
            pstm = con.prepareStatement("UPDATE interest_forms SET status = ? WHERE form_id=?");
            pstm.setInt(1, 1);
            pstm.setString(2, form_id);
            execute = pstm.executeUpdate();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return execute;
    }
}
