/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbclass;

import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Bishnu
 */
public class DbDate { 
    DbInt dbFunction = new DbInt();
     Connection con = dbFunction.makeConnection();
     SimpleDateFormat format =  new SimpleDateFormat ("yyyy-MM-dd");
     
     public String currentDate(){// this function call the current date of the system
        Date current = new Date( );   
        return format.format(current);
    }  
     
     public String addedDate() { // this fucntion added 30 to the current date
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 30);
        String date = format.format(cal.getTime());
        return date;

    } 
}
