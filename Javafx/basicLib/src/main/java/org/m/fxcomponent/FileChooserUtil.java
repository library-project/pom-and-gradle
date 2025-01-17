package org.m.fxcomponent;

import java.io.File;

import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;

/**
 * @author malaka senanayake @ Creative IT
 */
public class FileChooserUtil {

    //------------------------------------------------------------------------------------------------------------------
    public static String getFolderPath() {
        String path = "";
        try {
            DirectoryChooser dc = new DirectoryChooser();
            dc.setTitle("Select Folder");
            File file = dc.showDialog(null);
            path = file.getAbsolutePath();
            path = path.replace("\\", "/");
        } catch (Exception e) {
            System.out.println(" excepton at FXFileChooser in selectExcelFile method " + e);
        }
        return path;
    }
    //------------------------------------------------------------------------------------------------------------------

    public static File selectExcelFile2007() {
        File selectedFile = null;
        File excelFile = null;
        try {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Select Excel file");
            fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("*.xls", "*.xls"));
            selectedFile = fileChooser.showOpenDialog(null);

            if (selectedFile.getName().endsWith(".xls")) {
                excelFile = selectedFile;
            } else {
                AlertsUtil.waningMessage(" select  excel files only (.xls)");
            }
        } catch (Exception e) {
            System.out.println(" excepton at FXFileChooser in selectExcelFile method " + e);
        }
        return excelFile;
    }

    //------------------------------------------------------------------------------------------------------------------
    public static File selectExcelFile2010() {
        File selectedFile = null;
        File excelFile = null;
        try {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Select Excel file");
            fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("*.xlsx", "*.xlsx"));
            selectedFile = fileChooser.showOpenDialog(null);

            if (selectedFile.getName().endsWith(".xlsx")) {
                excelFile = selectedFile;
            } else {
                AlertsUtil.waningMessage(" select  excel files only (.xlsx)");
            }
        } catch (Exception e) {
            System.out.println(" excepton at FXFileChooser in selectExcelFile method " + e);
        }
        return excelFile;
    }
    //------------------------------------------------------------------------------------------------------------------

    public static String selectFile() {
        String path = "";
        try {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Select Excel file");
            File file = fileChooser.showOpenDialog(null);
            path = file.getAbsolutePath();
            path = path.replace("\\", "/");
        } catch (Exception e) {
            System.out.println(" excepton at FXFileChooser in selectExcelFile method " + e);
        }
        return path;
    }

    //------------------------------------------------------------------------------------------------------------------
    public static boolean isSelectedFile(File selectedFile) {
        if (selectedFile != null) {
            return true;
        } else {
            return false;
        }
    }
    //------------------------------------------------------------------------------------------------------------------
}
