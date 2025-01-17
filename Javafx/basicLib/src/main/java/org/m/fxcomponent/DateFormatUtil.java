package org.m.fxcomponent;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author malaka senanayake @ Creative IT
 */
public class DateFormatUtil {

    //------------------------------------------------------------------------------------------------------------------

    public static String toDateFormat(Date d) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date = sdf.format(d);
        return date;
    }
    //------------------------------------------------------------------------------------------------------------------

    public static String getCurrentDate() {
        java.util.Date d1 = new java.util.Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date = sdf.format(d1);
        return date;
    }
    //------------------------------------------------------------------------------------------------------------------

    public static String toDateFormat(String otherFormatDate) {
        String dateFormat = otherFormatDate.replace("\"", "");
        String date = "";
        try {
            //------------------------------------------------------------------
            //use their format("yyyy-MM-dd" ,"yyyy/MM/dd" ,"MM/dd/yyyy" ,"MM-dd-yyyy" ,"dd/MM/yyyy" ,"dd-MM-yyyy")
            SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MMMMM-yyyy");
            Date fristFromat = sdf1.parse(dateFormat);

            //------------------------------------------------------------------
            SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
            date = sdf2.format(fristFromat);
            //------------------------------------------------------------------
        } catch (ParseException ex) {
            System.out.println(ex);
        }
        return date;
    }
    //------------------------------------------------------------------------------------------------------------------
}
