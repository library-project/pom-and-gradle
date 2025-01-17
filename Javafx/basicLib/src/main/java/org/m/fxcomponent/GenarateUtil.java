/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.m.fxcomponent;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.UUID;

/**
 * @author Malaka SENANAYAKE
 */
public class GenarateUtil {
    //------------------------------------------------------------------------------------------------------------------

    public static String getRowPointer() {
        String uniqueID = UUID.randomUUID().toString();
        String timeStamp = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(Calendar.getInstance().getTime());
        timeStamp = timeStamp + "" + System.nanoTime();
        return (timeStamp + "" + uniqueID).replace("-", "");
    }
    //------------------------------------------------------------------------------------------------------------------

    public static String getRandomPassword() {
        Random r = new Random();
        int low = 1000;
        int high = 9999;
        int randomValue = r.nextInt(high - low) + low;
        return randomValue + "";
    }

    //------------------------------------------------------------------------------------------------------------------
    public static String getRandomKey() {
        Random r = new Random();
        int low = 1000;
        int high = 9999;
        int randomValue = r.nextInt(high - low) + low;
        return randomValue + "";
    }
    //------------------------------------------------------------------------------------------------------------------
}
