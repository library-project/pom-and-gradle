package org.m.fxcomponent;

import java.io.IOException;

/**
 * @author malaka senanayake
 */
public class FileUtil {
    //------------------------------------------------------------------------------------------------------------------

    public static void openFile(String filePath) {
        try {
            String[] cmdarray = new String[]{"cmd.exe", "/c", filePath};
            Runtime.getRuntime().exec(cmdarray);
        } catch (IOException ex) {
            System.out.println("exception in File.openFile" + ex);
        }
    }
    //------------------------------------------------------------------------------------------------------------------
}
