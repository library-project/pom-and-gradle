package org.m.fxcomponent;

/**
 * @author malaka
 */
public class StringFormatUtil {
    //------------------------------------------------------------------------------------------------------------------

    public static String removeDash(String value) {
        String regx = "[-_=]";
        return (value.replaceAll(regx, ""));
    }
    //------------------------------------------------------------------------------------------------------------------

    public static String removeUnwantedSymbols(String value) {
        String regx = "[.,@#$%^&*:-=_!/\"\"]";
        return (value.replaceAll(regx, "").replace("'", " "));
    }
    //------------------------------------------------------------------------------------------------------------------

    public static String removeDoubleQouates(String value) {
        String regx = "[\"\"]";
        return (value.replaceAll(regx, ""));
    }
    //------------------------------------------------------------------------------------------------------------------

    public static String toHistoryDataFormat(String value[]) {
        String stringValues = "";
        for (int i = 0; i < value.length; i++) {
            stringValues = stringValues + "/" + value[i];
        }
        return stringValues.replaceFirst("/", "");
    }
    //------------------------------------------------------------------------------------------------------------------

    public static String toFristLetterCapital(String value) {
        value = value.toLowerCase().replaceAll(" +", " ");
        return value.substring(0, 1).toUpperCase() + value.substring(1);
    }

    //------------------------------------------------------------------------------------------------------------------
    public static String toNameFormat(String value) {
        String regx = "[.,@#$%^&*:-=_!/\"\"]";
        return (value.replaceAll(regx, "").replace("'", " ").toUpperCase());
    }
    //------------------------------------------------------------------------------------------------------------------
}
