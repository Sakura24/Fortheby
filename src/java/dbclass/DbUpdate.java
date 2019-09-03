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

//all the functions of this class are used for updating the table of specific fields
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
    
    public Integer UpdateItem(String cat_id, String item_name, String artist_name, String created_year, String classify, String description, String auction_date, String price, String medium, String framed, String dimension, String image_type, String material, String weight,String item_lot) {
        System.out.print("cat_id="+ cat_id);
        System.out.print("item_name="+ item_name);
        System.out.print("artist_name="+ artist_name);
        System.out.print("created_year="+ created_year);
        System.out.print("classify="+ classify);
        System.out.print("description="+ description);
        System.out.print("auction_date="+ auction_date);
        System.out.print("price="+ price);
        System.out.print("medium="+ medium);
        System.out.print("framed="+ framed);
        System.out.print("dimension="+ dimension);
        System.out.print("image_type="+ image_type);
        System.out.print("material="+ material);
        System.out.print("weight="+ weight);
        System.out.print("item_lot="+ item_lot);
        
        
        try {
            pstm = con.prepareStatement("UPDATE items SET cat_id=?, item_name=?, artist_name=?, created_year=?, classify=?, description=?, auction_date=?, price=?, medium=?, framed=?, dimension=?, image_type=?, material=?, weight=? WHERE item_lot = ?");
            pstm.setString(1, cat_id);
            pstm.setString(2, item_name);
            pstm.setString(3, artist_name);
            pstm.setString(4, created_year);
            pstm.setString(5, classify);
            pstm.setString(6, description);
            pstm.setString(7, auction_date);
            pstm.setString(8, price);
            pstm.setString(9, medium);
            pstm.setString(10, framed);
            pstm.setString(11, dimension);
            pstm.setString(12, image_type);
            pstm.setString(13, material);
            pstm.setString(14, weight);
            pstm.setString(15, item_lot);
            execute = pstm.executeUpdate();
        } catch (Exception ex) {
            System.out.print("error");
        }
        return execute;
    }
    
    public Integer UpdateStatus(String item_lot) {
        try {
            pstm = con.prepareStatement("UPDATE items SET status = ? WHERE item_lot=?");
            pstm.setInt(1, 1);
            pstm.setString(2, item_lot);
            execute = pstm.executeUpdate();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return execute;
    }
    
    public Integer UpdateStatusAgain(String item_lot) {
        try {
            pstm = con.prepareStatement("UPDATE items SET status = ? WHERE item_lot=?");
            pstm.setInt(1, 0);
            pstm.setString(2, item_lot);
            execute = pstm.executeUpdate();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return execute;
    }
    
    public Integer UpdateSoldStatus(String item_lot) {
        try {
            pstm = con.prepareStatement("UPDATE items SET sold_status = ? WHERE item_lot=?");
            pstm.setInt(1, 1);
            pstm.setString(2, item_lot);
            execute = pstm.executeUpdate();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return execute;
    }
    
    public Integer UpdateSoldInfo(String sold_price, String after_commission, String buyer_id, String item_lot) {
        out.print(sold_price);
        out.print(after_commission);
        out.print(buyer_id);
        out.print(item_lot);
        out.print("Var");
        try {
            pstm = con.prepareStatement("UPDATE items SET sold_price = ?, after_commission = ?, buyer_id = ? WHERE item_lot=?");
            pstm.setString(1, sold_price);
            pstm.setString(2, after_commission);
            pstm.setString(3, buyer_id);
            pstm.setString(4, item_lot);
            execute = pstm.executeUpdate();
            out.print("inserted");
        } catch (Exception ex) {
            ex.getMessage();
        }
        return execute;
    }
    
    public Integer UpdateReplyStatus(String contact_id) {
        try {
            pstm = con.prepareStatement("UPDATE contacts SET reply_status = ? WHERE contact_id=?");
            pstm.setInt(1, 1);
            pstm.setString(2, contact_id);
            execute = pstm.executeUpdate();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return execute;
    }
    
    public Integer UpdateAuction(String title, String location, String date, String auction_lot, String period, String auction_id) {
        try {
            pstm = con.prepareStatement("UPDATE auctions SET title=?, location=?, date=?, auction_lot=?, period=? WHERE auction_id=? ");
            pstm.setString(1, title);
            pstm.setString(2, location);
            pstm.setString(3, date);
            pstm.setString(4, auction_lot);
            pstm.setString(5, period);
            pstm.setString(6, auction_id);
            execute = pstm.executeUpdate();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return execute;
    }
    
    public Integer UpdateAuctionId(String auction_id, String item_lot) {
        try {
            pstm = con.prepareStatement("UPDATE items SET auction_id=?, auction_status = ? WHERE item_lot=? ");
            pstm.setString(1, auction_id);
            pstm.setInt(2, 1);
            pstm.setString(3, item_lot);
            execute = pstm.executeUpdate();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return execute;
    }
    
    public Integer UpdateAuctionStatusId(String auction_id, String item_lot) {
        try {
            pstm = con.prepareStatement("UPDATE items SET auction_id=? WHERE item_lot=? ");
            pstm.setString(1, auction_id);
            pstm.setString(2, item_lot);
            execute = pstm.executeUpdate();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return execute;
    }
    
    public Integer UpdateBidStatus(String bid_id) {
        try {
            pstm = con.prepareStatement("UPDATE biddings SET bid_status = ? WHERE bid_id=?");
            pstm.setInt(1, 1);
            pstm.setString(2, bid_id);
            execute = pstm.executeUpdate();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return execute;
    }
    
    public Integer UpdateBidAmount(String bid_id, String bid_amount) {
        try {
            pstm = con.prepareStatement("UPDATE biddings SET bid_amount = ? WHERE bid_id=?");
            pstm.setString(1, bid_amount);
            pstm.setString(2, bid_id);
            execute = pstm.executeUpdate();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return execute;
    }
    public Integer UpdateNewBidStatus(String bid_id) {
        try {
            pstm = con.prepareStatement("UPDATE biddings SET bid_status = ? WHERE bid_id=?");
            pstm.setInt(1, 0);
            pstm.setString(2, bid_id);
            execute = pstm.executeUpdate();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return execute;
    }
}
