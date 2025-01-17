package org.m.fxcomponent;


/**
 * @author malaka senanayake
 */
public class CalAddtionUtil {
    //------------------------------------------------------------------------------------------------------------------

    public static double twoValues(String valueOne, String valueTwo) {
        double calculatedValue = 0;
        calculatedValue = (NumberFormatUtil.toDouble(valueOne)) + (NumberFormatUtil.toDouble(valueTwo));
        return calculatedValue;
    }
    //------------------------------------------------------------------------------------------------------------------
}
