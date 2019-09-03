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

//all the code in this call are used for the selcion of all the fields or certain fields form the database table to diplay the values

public class DbSelect {
    DbInt dbFunction = new DbInt();
    ResultSet result;
    Connection con = dbFunction.makeConnection();
    PreparedStatement pstm;
    int chk = 0;
    
    public int ItemByCatCount(String cat_id) {
        int count = 0;
        try {
            pstm = con.prepareStatement("SELECT * FROM items WHERE cat_id = ? AND sold_status = 0");
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
    
    public int ItemByCatCountCount(String cat_id) {
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
    
    public int CatCount() {
        int count = 0;
        try {
            pstm = con.prepareStatement("SELECT * FROM caegories");
            result = pstm.executeQuery();
            result.last();
            count = Integer.valueOf(result.getRow());
            out.print(count);
        } catch (Exception e) {
            System.out.println("Error:" + e);

        }
        return count;
    }
    
    public int BidCount() {
        int count = 0;
        try {
            pstm = con.prepareStatement("SELECT * FROM biddings WHERE bid_status = 0");
            result = pstm.executeQuery();
            result.last();
            count = Integer.valueOf(result.getRow());
            out.print(count);
        } catch (Exception e) {
            System.out.println("Error:" + e);

        }
        return count;
    }
    
    public int BidOldCount() {
        int count = 0;
        try {
            pstm = con.prepareStatement("SELECT * FROM biddings WHERE bid_status = 1");
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
    
    public int ItemCountStatus() {
        int count = 0;
        try {
            pstm = con.prepareStatement("SELECT * FROM items WHERE status= 0");
            result = pstm.executeQuery();
            result.last();
            count = Integer.valueOf(result.getRow());
            out.print(count);
        } catch (Exception e) {
            System.out.println("Error:" + e);

        }
        return count;
    }
    
    public int ItemCountSoldArchieveStatus() {
        int count = 0;
        try {
            pstm = con.prepareStatement("SELECT * FROM items WHERE status= 0 AND sold_status = 0");
            result = pstm.executeQuery();
            result.last();
            count = Integer.valueOf(result.getRow());
            out.print(count);
        } catch (Exception e) {
            System.out.println("Error:" + e);

        }
        return count;
    }
    
    public int ItemStatusCount() {
        int count = 0;
        try {
            pstm = con.prepareStatement("SELECT * FROM items where status = 1");
            result = pstm.executeQuery();
            result.last();
            count = Integer.valueOf(result.getRow());
            out.print(count);
        } catch (Exception e) {
            System.out.println("Error:" + e);

        }
        return count;
    }
    
    public int ItemPendingArchieveCount() {
        int count = 0;
        try {
            pstm = con.prepareStatement("SELECT * FROM items where status = 1 AND sold_status = 0");
            result = pstm.executeQuery();
            result.last();
            count = Integer.valueOf(result.getRow());
            out.print(count);
        } catch (Exception e) {
            System.out.println("Error:" + e);

        }
        return count;
    }
    
    public int ItemSoldStatusCount() {
        int count = 0;
        try {
            pstm = con.prepareStatement("SELECT * FROM items where status = 1 AND sold_status = 1");
            result = pstm.executeQuery();
            result.last();
            count = Integer.valueOf(result.getRow());
            out.print(count);
        } catch (Exception e) {
            System.out.println("Error:" + e);

        }
        return count;
    }
    
    public int AuctionCountById(String item_lot) {
        int count = 0;
        try {
            pstm = con.prepareStatement("SELECT auction_id FROM items WHERE item_lot = ?");
            pstm.setString(1, item_lot);
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
            e.getMessage();
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
            pstm = con.prepareStatement("SELECT * FROM items where status = 0");
            result = pstm.executeQuery();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return result;
    }
    
    public ResultSet DisplayItemBySoldArchieve() {
        try {
            pstm = con.prepareStatement("SELECT * FROM items where status = 0 AND sold_status = 0");
            result = pstm.executeQuery();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return result;
    }
    
    public ResultSet DisplayItemByStatus() {
        try {
            pstm = con.prepareStatement("SELECT * FROM items where status = 1");
            result = pstm.executeQuery();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return result;
    }
     
     public String DisplayMaxId() {
        String type_name = "";
        try {
            pstm = con.prepareStatement("SELECT MAX(item_lot) FROM items");
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
     
     public String GetItemNameById(String item_lot) {
        String item_name = "";
        try {
            pstm = con.prepareStatement("SELECT item_name FROM items WHERE item_lot = ? ");
            pstm.setString(1, item_lot);
            result = pstm.executeQuery();
            if (result.next()) {
                result.first();
                item_name = result.getString(1);
            }
        } catch (Exception ex) {
            ex.getMessage();
        }
        return item_name;
    }
    
    public ResultSet DisplayItemById(String item_lot) {
        try {
            pstm = con.prepareStatement("SELECT * FROM items WHERE item_lot = ?");
            pstm.setString(1, item_lot);
            result = pstm.executeQuery();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return result;
    }
    
    public ResultSet DisplayItemStatusbyId(String item_lot) {
        try {
            pstm = con.prepareStatement("SELECT * FROM items WHERE item_lot = ? AND sold_status = 0 AND status = 0");
            pstm.setString(1, item_lot);
            result = pstm.executeQuery();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return result;
    }
    
    public ResultSet DisplayItemSoldStatusbyId(String item_lot) {
        try {
            pstm = con.prepareStatement("SELECT * FROM items WHERE item_lot = ? AND sold_status = 1 AND status = 0");
            pstm.setString(1, item_lot);
            result = pstm.executeQuery();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return result;
    }
    
    public ResultSet DisplayItemByCatId(String cat_id) {
        try {
            pstm = con.prepareStatement("SELECT * FROM items WHERE cat_id = ? AND sold_status = 0");
            pstm.setString(1, cat_id);
            result = pstm.executeQuery();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return result;
    }
    
    public ResultSet DisplayItemByStatusCatId(String cat_id) {
        try {
            pstm = con.prepareStatement("SELECT * FROM items WHERE cat_id = ? AND sold_status = 0");
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
            pstm = con.prepareStatement("SELECT interest_forms.first_name, interest_forms.last_name, interest_forms.gender, interest_forms.contact_no, interest_forms.profession, user_types.user_type, interest_forms.acc_no, interest_forms.sort_no, interest_forms.interest, interest_forms.email FROM interest_forms INNER JOIN user_types ON interest_forms.user_type_id = user_types.user_type_id WHERE interest_forms.status = 0");
            result = pstm.executeQuery();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return result;
    }
    
    public ResultSet Users() {
        try {
            pstm = con.prepareStatement("SELECT * FROM users WHERE form_id > 0");
            result = pstm.executeQuery();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return result;
    }
    
    public ResultSet Buyer() {
        try {
            pstm = con.prepareStatement("SELECT * FROM users WHERE form_id > 0 AND user_type_id = 2");
            result = pstm.executeQuery();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return result;
    }
    
    public String GetUserNameFromId(String user_id) {
        String userName = "";
        try {
            pstm = con.prepareStatement("SELECT username FROM users WHERE user_id=? ");
            pstm.setString(1, user_id);
            result = pstm.executeQuery();
            if (result.next()) {
                result.first();
                userName = result.getString(1).trim();
            }
        } catch (Exception ex) {
            ex.getMessage();
        }
        return userName;
    }
    
    public ResultSet DisplaySoldItem() {
        try {
            pstm = con.prepareStatement("SELECT * FROM items WHERE sold_status = 1 AND status = 0 ");
            result = pstm.executeQuery();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return result;
    }
    
    public ResultSet DisplaySoldArchieveItem() {
        try {
            pstm = con.prepareStatement("SELECT * FROM items WHERE sold_status = 1 AND status = 1 ");
            result = pstm.executeQuery();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return result;
    }
    
    public ResultSet DisplayPendingItem() {
        try {
            pstm = con.prepareStatement("SELECT * FROM items WHERE sold_status = 0 AND status = 0");
            result = pstm.executeQuery();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return result;
    }
    
    public ResultSet UserProfile(String email) {
        try {
            pstm = con.prepareStatement("SELECT interest_forms.gender, interest_forms.first_name, interest_forms.last_name, users.address, interest_forms.contact_no, users.contact_no, users.email, users.user_type_id, interest_forms.acc_no, interest_forms.sort_no  FROM interest_forms INNER JOIN users ON interest_forms.form_id = users.form_id WHERE users.email = ?");
            pstm.setString(1, email);
            result = pstm.executeQuery();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return result;
    }
    
    public ResultSet SellerPendingItem(String email) {
        try {
            pstm = con.prepareStatement("SELECT * FROM items INNER JOIN users ON users.user_id = items.seller_id WHERE items.sold_status = 0 AND status = 0 AND users.email = ?");
            pstm.setString(1, email);
            result = pstm.executeQuery();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return result;
    }
    
    public int CountSellerPendingItem(String email) {
        int count = 0;
        try {
            pstm = con.prepareStatement("SELECT * FROM items INNER JOIN users ON users.user_id = items.seller_id WHERE items.sold_status = 0 AND status = 0 AND users.email = ?");
            pstm.setString(1, email);
            result = pstm.executeQuery();
            result.last();
            count = Integer.valueOf(result.getRow());
            out.print(count);
        } catch (Exception e) {
            System.out.println("Error:" + e);

        }
        return count;
    }
    
    public ResultSet SellerSoldItem(String email) {
        try {
            pstm = con.prepareStatement("SELECT * FROM items INNER JOIN users ON users.user_id = items.seller_id WHERE sold_status = 1 AND status = 0 AND users.email = ?");
            pstm.setString(1, email);
            result = pstm.executeQuery();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return result;
    }
    
    public int CountSellerSoldItem(String email) {
        int count = 0;
        try {
            pstm = con.prepareStatement("SELECT * FROM items INNER JOIN users ON users.user_id = items.seller_id WHERE sold_status = 1 AND status = 0 AND users.email = ?");
            pstm.setString(1, email);
            result = pstm.executeQuery();
            result.last();
            count = Integer.valueOf(result.getRow());
            out.print(count);
        } catch (Exception e) {
            System.out.println("Error:" + e);

        }
        return count;
    }    
    
    public ResultSet BoughtItem(String email) {
        try {
            pstm = con.prepareStatement("SELECT * FROM items INNER JOIN users ON users.user_id = items.buyer_id WHERE sold_status = 1  AND status = 0 AND users.email = ?");
            pstm.setString(1, email);
            result = pstm.executeQuery();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return result;
    }
    
    public int CountBoughtItem(String email) {
        int count = 0;
        try {
            pstm = con.prepareStatement("SELECT * FROM items INNER JOIN users ON users.user_id = items.buyer_id WHERE sold_status = 1 AND status = 0 AND users.email = ?");
            pstm.setString(1, email);
            result = pstm.executeQuery();
            result.last();
            count = Integer.valueOf(result.getRow());
            out.print(count);
        } catch (Exception e) {
            System.out.println("Error:" + e);

        }
        return count;
    } 
    
    public ResultSet GetSellerIdFromEmail(String userEmail) {
        try {
            pstm = con.prepareStatement("SELECT user_id FROM users WHERE email=?");
            pstm.setString(1, userEmail);
            result = pstm.executeQuery();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return result;
    }
    
    public ResultSet DisplayContact(String userEmail) {
        try {
            pstm = con.prepareStatement("SELECT * FROM contacts  INNER JOIN users ON contacts.user_id = users.user_id WHERE users.email=?");
            pstm.setString(1, userEmail);
            result = pstm.executeQuery();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return result;
    }
    
    public ResultSet DisplayAdminContact() {
        try {
            pstm = con.prepareStatement("SELECT * FROM contacts  INNER JOIN users ON contacts.user_id = users.user_id WHERE contacts.reply_status = 0");
            result = pstm.executeQuery();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return result;
    }
    
    public int CountDisplayAdminContact() {
        int count = 0;
        try {
            pstm = con.prepareStatement("SELECT * FROM contacts  INNER JOIN users ON contacts.user_id = users.user_id WHERE contacts.reply_status = 0");
            result = pstm.executeQuery();
            result.last();
            count = Integer.valueOf(result.getRow());
            out.print(count);
        } catch (Exception e) {
            System.out.println("Error:" + e);

        }
        return count;
    }
    
    public String GetFullNameFromEmail(String user_id) {
        String userName = "";
        try {
            pstm = con.prepareStatement("SELECT first_name, last_name FROM interest_forms INNER JOIN users ON interest_forms.form_id = users.form_id WHERE users.user_id=? ");
            pstm.setString(1, user_id);
            result = pstm.executeQuery();
            if (result.next()) {
                result.first();
                userName = result.getString(1).trim() + " " + result.getString(2).trim();
            }
        } catch (Exception ex) {
            ex.getMessage();
        }
        return userName;
    }
    
    public ResultSet DisplayContactForReply(String contact_id) {
        try {
            pstm = con.prepareStatement("SELECT * FROM contacts  INNER JOIN users ON contacts.user_id = users.user_id WHERE contacts.contact_id = ?");
            pstm.setString(1, contact_id);
            result = pstm.executeQuery();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return result;
    }
    
     public ResultSet ReplyDetail(int contact_id) {
        try {
            pstm = con.prepareStatement("select contacts. user_id, contacts.title, contacts.description, contacts.post_date, replies.description, replies.reply_date FROM (replies INNER JOIN contacts ON replies.contact_id = contacts.contact_id) WHERE contacts.contact_id = ?");
            pstm.setInt(1, contact_id);
            result = pstm.executeQuery();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return result;
    }
     
     public ResultSet SellerReplyDetail(String contact_id) {
        try {
            pstm = con.prepareStatement("select contacts. user_id, contacts.title, contacts.description, contacts.post_date, replies.description, replies.reply_date FROM (replies INNER JOIN contacts ON replies.contact_id = contacts.contact_id) WHERE contacts.contact_id = ?");
            pstm.setString(1, contact_id);
            result = pstm.executeQuery();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return result;
    }
     
     public ResultSet ItemName(String item_lot) {
        try {
            pstm = con.prepareStatement("SELECt item_name FROM items WHERE item_lot = ? ");
            pstm.setString(1, item_lot);
            result = pstm.executeQuery();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return result;
    }
     
     public ResultSet AuctionDetail() {
        try {
            pstm = con.prepareStatement("SELECT * FROM auctions");
            result = pstm.executeQuery();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return result;
    }
     
     public ResultSet AuctionDetailById(String auction_id) {
        try {
            pstm = con.prepareStatement("SELECT * FROM auctions WHERE auction_id = ?");
            pstm.setString(1, auction_id);
            result = pstm.executeQuery();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return result;
    }
     
     public ResultSet DisplayCatalogue(String item_lot) {
        try {
            pstm = con.prepareStatement("SELECT items.item_lot,items.cat_id, items.item_name, items.artist_name, items.created_year, items.classify, items.description, items.auction_date, items.price, items.medium, items.framed, items.dimension, items.image_type, items.material, items.weight, items.seller_id, items.image , auctions.title, auctions.location, auctions.date, auctions.auction_lot, auctions.period FROM items INNER JOIN auctions on items.auction_id = auctions.auction_id WHERE items.item_lot = ? AND sold_status = 0 AND status = 0");
            pstm.setString(1, item_lot);
            result = pstm.executeQuery();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return result;
    }
     
    public ResultSet DisplaySoldCatalogue(String item_lot) {
        try {
            pstm = con.prepareStatement("SELECT items.item_lot, items.cat_id, items.item_name, items.artist_name, items.created_year, items.classify, items.description, items.auction_date, items.price, items.medium, items.framed, items.dimension, items.image_type, items.material, items.weight, items.seller_id, items.buyer_id, items.image , auctions.title, auctions.location, auctions.date, auctions.auction_lot, auctions.period FROM items INNER JOIN auctions on items.auction_id = auctions.auction_id WHERE items.item_lot = ? AND sold_status = 1 AND status = 0 ");
            pstm.setString(1, item_lot);
            result = pstm.executeQuery();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return result;
    }
     
     public String AuctionStatusById(String item_lot) {
        String userName = "";
        try {
            pstm = con.prepareStatement("SELECT auction_status FROM items WHERE item_lot=? ");
            pstm.setString(1, item_lot);
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
     
    
    public String DisplayCommission(String item_lot, String email) {
        String userName = "";
        try {
            pstm = con.prepareStatement("SELECT items.after_commission FROM items INNER JOIN users ON users.user_id = items.seller_id WHERE items.item_lot = ? AND users.email = ?");
            pstm.setString(1, item_lot);
            pstm.setString(2, email);
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
    
    public String DisplaySoldPrice(String item_lot, String email) {
        String userName = "";
        try {
            pstm = con.prepareStatement("SELECT items.sold_price FROM items INNER JOIN users ON users.user_id = items.seller_id WHERE items.item_lot = ? AND users.email = ?");
            pstm.setString(1, item_lot);
            pstm.setString(2, email);
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
    
    public String SellingPrice(String item_lot, String email) {
        String userName = "";
        try {
            pstm = con.prepareStatement("SELECT items.sold_price FROM items INNER JOIN users ON users.user_id = items.buyer_id WHERE items.item_lot = ? AND users.email = ?");
            pstm.setString(1, item_lot);
            pstm.setString(2, email);
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
    
    public String AdminSellingPrice(String item_lot) {
        String userName = "";
        try {
            pstm = con.prepareStatement("SELECT items.sold_price FROM items INNER JOIN users ON users.user_id = items.buyer_id WHERE items.item_lot = ?");
            pstm.setString(1, item_lot);
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
    
    public String DisplayCommission(String item_lot) {
        String userName = "";
        try {
            pstm = con.prepareStatement("SELECT items.after_commission FROM items INNER JOIN users ON users.user_id = items.seller_id WHERE items.item_lot = ?");
            pstm.setString(1, item_lot);
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
    
   public ResultSet DisplayImageByDate(String currentDate, String monthDate) {
        try {
            pstm = con.prepareStatement("SELECT * FROM items INNER JOIN auctions ON auctions.auction_id = items.auction_id WHERE auctions.date BETWEEN ? AND ? AND sold_status = 0 AND status = 0 ");
            pstm.setString(1, currentDate);
            pstm.setString(2, monthDate);
            result = pstm.executeQuery();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return result;
    } 
   
   public String GetUserIdFromEmail(String email) {
        String foodName = "";
        try {
            pstm = con.prepareStatement("SELECT user_id FROM users WHERE email=?");
            pstm.setString(1, email);
            result = pstm.executeQuery();
            if (result.next()) {
                result.first();
                foodName = result.getString(1);
            }
        } catch (Exception e) {
            e.getMessage();
        }

        return foodName;
    }
   
   public ResultSet DisplayOldBid() {
        try {
            pstm = con.prepareStatement("SELECT items.image, items.item_name, items.artist_name, biddings.user_id, biddings.bid_amount, biddings.bid_id, bid_status FROM items INNER JOIN biddings ON items.item_lot = biddings.item_lot WHERE bid_status = 1 AND items.sold_status = 0 AND items.status = 0 ");
//            pstm = con.prepareStatement("SELECT items.image, items.item_name, items.artist_name, biddings.user_id, biddings.bid_amount, biddings.bid_id, bid_status FROM items INNER JOIN biddings ON items.item_lot = biddings.item_lot WHERE bid_status = 1");
            result = pstm.executeQuery();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return result;
    }
   
   public ResultSet DisplayOldBidById(String bid_id) {
        try {
            pstm = con.prepareStatement("SELECT items.image, items.item_name, items.artist_name, biddings.user_id, biddings.bid_amount, biddings.bid_id, bid_status FROM items INNER JOIN biddings ON items.item_lot = biddings.item_lot WHERE biddings.bid_id = ?");
            pstm.setString(1, bid_id);
            result = pstm.executeQuery();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return result;
    }
   
   public ResultSet DisplayNewBid() {
        try {
            pstm = con.prepareStatement("SELECT items.image, items.item_name, items.artist_name, biddings.user_id, biddings.bid_amount, biddings.bid_id, bid_status FROM items INNER JOIN biddings ON items.item_lot = biddings.item_lot WHERE bid_status = 0");
            result = pstm.executeQuery();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return result;
    }
   
   public String GetBidStatus( String bid_id) {
        String userName = "";
        try {
            pstm = con.prepareStatement("SELECT bid_status FROM biddings WHERE bid_id = ?");
            pstm.setString(1, bid_id);
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
   
   public ResultSet DisplayUserBid(String user_id) {
        try {
            pstm = con.prepareStatement("SELECT items.image, items.item_name, items.artist_name, biddings.user_id, biddings.bid_amount, biddings.bid_id, bid_status FROM items INNER JOIN biddings ON items.item_lot = biddings.item_lot WHERE biddings.user_id = ? AND items.sold_status = 0 AND items.status = 0");
            pstm.setString(1, user_id);
            result = pstm.executeQuery();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return result;
    }
}
