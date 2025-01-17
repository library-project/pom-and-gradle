package org.m.fxcomponent;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author malaka senanayake @ Creative IT
 */
public class TimeFormatUtil {
    //------------------------------------------------------------------------------------------------------------------
    public static String getCurrentTime(){
        SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
        Date d = new Date();
        return (df.format(d));
    }
    //------------------------------------------------------------------------------------------------------------------
    public static String getCurrentTimeStamp() {
        String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH.mm.ss").format(new Timestamp(System.currentTimeMillis()));
        return timeStamp;
    }
    //------------------------------------------------------------------------------------------------------------------
}
