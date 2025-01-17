package org.m.fxcomponent;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author malaka senanayake
 */
public class FileNameUtil {
    //------------------------------------------------------------------------------------------------------------------

    public static String getRandomExcelfileName(String reportName) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd@HH-mm-ss");
        Date d = new Date();
        String filename = reportName + "_" + (df.format(d)) + ".xls";
        return (filename);
    }

    //------------------------------------------------------------------------------------------------------------------
    public static String getStaticExcelfileName(String reportName) {
        String filename = reportName + ".xls";
        return (filename);
    }

    //------------------------------------------------------------------------------------------------------------------
    public static String getDateExcelfileName(String reportName) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date d = new Date();
        String filename = reportName + "_" + (df.format(d)) + ".xls";
        return (filename);
    }

    //------------------------------------------------------------------------------------------------------------------
    public static String getRandomSqlfileName(String reportName) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd@HH-mm-ss");
        Date d = new Date();
        String filename = reportName + "_" + (df.format(d)) + ".sql";
        return (filename);
    }

    //------------------------------------------------------------------------------------------------------------------
    public static String getStaticSqlfileName(String reportName) {
        String filename = reportName + ".sql";
        return (filename);
    }

    //------------------------------------------------------------------------------------------------------------------
    public static String getDateSqlfileName(String reportName) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date d = new Date();
        String filename = reportName + "_" + (df.format(d)) + ".sql";
        return (filename);
    }
    //------------------------------------------------------------------------------------------------------------------
}
