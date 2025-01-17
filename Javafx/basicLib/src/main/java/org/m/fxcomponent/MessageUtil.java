/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.m.fxcomponent;

/**
 * @author Malaka SENANAYAKE
 */
public class MessageUtil {
    //------------------------------------------------------------------------------------------------------------------
    public static String getAccountCreateMsg(String userName, String password) {
//        String msg = "Username - "+userName+" "
//                + "is your OMS user name and "
//                + "Password - "+password+" "
//                + "is One time password to login system";

        String msg = "- OMS Login credentials -"
                + " User Name - " + userName + " "
                + " Pasword - " + password + " (Onetime password)";
        return msg;
    }
    //------------------------------------------------------------------------------------------------------------------
}
