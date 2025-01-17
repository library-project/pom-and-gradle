/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.m.fxcomponent;


/**
 * @author Malaka SENANAYAKE
 */


public class ValidateUtil {
    //------------------------------------------------------------------------------------------------------------------
    public static boolean checkPositiveValue(int value) {
        if (value > 0) {
            return true;
        } else {
            return false;
        }
    }

    //------------------------------------------------------------------------------------------------------------------
    public static boolean checkEmptyStringArray(String ar[]) {
        boolean b = true;
        for (int i = 0; i < ar.length; i++) {
            if ((ar[i].isEmpty()) | (ar[i].length() == 0)) {
                b = false;
                i = ar.length;
            }
        }
        return b;
    }
    //------------------------------------------------------------------------------------------------------------------

    public static boolean isPhoneNumber(String phoneNumber) {
        boolean b = false;
        if ((phoneNumber.matches("^[0-9]{10}$"))) {
            b = true;
        }
        return b;
    }
    //------------------------------------------------------------------------------------------------------------------

    public static boolean isEmail(String email) {
        String valiedEmail = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        boolean b = true;
        b = email.matches(valiedEmail);
        return b;
    }
    //------------------------------------------------------------------------------------------------------------------

    public static boolean isPositiveDouble(String number) {
        boolean b = false;
        if ((number.matches("-?\\d+(\\.\\d+)?"))) {
            double value = Double.parseDouble(number);
            if (value > 0) {
                b = true;
            }
        }
        return b;
    }
    //------------------------------------------------------------------------------------------------------------------

    public static boolean isPositiveInteger(String number) {
        boolean b = false;
        if ((number.matches("-?\\d+(\\d+)?"))) {
            int value = Integer.parseInt(number.replace(".", ""));
            if (!number.startsWith("0")) {
                if (value > 0) {
                    b = true;
                }
            }
        }
        return b;
    }
    //------------------------------------------------------------------------------------------------------------------

    public static boolean isZeroOrDouble(String number) {
        boolean b = false;
        if ((number.matches("-?\\d+(\\.\\d+)?"))) {
            double value = Double.parseDouble(number);
            if (value >= 0) {
                b = true;
            }
        }
        return b;
    }
    //------------------------------------------------------------------------------------------------------------------

    public static boolean isZeroOrInteger(String number) {
        boolean b = false;
        if ((number.matches("-?\\d+(\\d+)?"))) {
            int value = Integer.parseInt(number.replace(".", ""));
            if (value >= 0) {
                b = true;
            }
        }
        return b;
    }
    //------------------------------------------------------------------------------------------------------------------

    public static boolean haveBalance(double balance) {
        boolean b = false;
        if (balance == 0) {
            b = true;
        }
        return b;
    }
    //------------------------------------------------------------------------------------------------------------------

    public static boolean isEqualOrLessThan(double balance, double enteredValue) {
        boolean b = false;
        if ((balance - enteredValue) >= 0) {
            b = true;
        }
        return b;
    }

    //------------------------------------------------------------------------------------------------------------------
    public static boolean isSuccess(int primaryKey) {
        boolean b = false;
        if (primaryKey > 0) {
            b = true;
        }
        return b;
    }

    //------------------------------------------------------------------------------------------------------------------
    public static String toPhoneNumberSMSFormat(String phoneNumber) {
        return phoneNumber.replaceFirst("^0+(?!$)", "94");
    }
    //------------------------------------------------------------------------------------------------------------------
}
