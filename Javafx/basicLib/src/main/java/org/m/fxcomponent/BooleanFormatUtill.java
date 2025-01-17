package org.m.fxcomponent;

/**
 * @author malaka senanayake @ Creative IT
 */
public class BooleanFormatUtill {
    //------------------------------------------------------------------------------------------------------------------

    public static boolean isHasPermition(String zeroORone) {
        boolean b = false;
        if (zeroORone.equals("0")) {
            b = false;
        } else if (zeroORone.equals("1")) {
            b = true;
        }
        return b;
    }

    //------------------------------------------------------------------------------------------------------------------
    public static boolean isTodayEntered(String enteredDate) {
        boolean b = true;
//        if (enteredDate.equals(DateFormatUtil.getCurrentDate())) {
//            b = true;
//        } else {
//            b = false;
//        }
        return b;
    }
    //------------------------------------------------------------------------------------------------------------------
}
