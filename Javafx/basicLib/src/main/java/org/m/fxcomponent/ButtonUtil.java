package org.m.fxcomponent;

import javafx.scene.control.Button;

/**
 * @author malaka senanayake @ Creative IT
 */
public class ButtonUtil {

    private static  String DEFAULT_STYLE = "-fx-background-color:rgba(0,0,0,0);";
    private static  String SELECTED_STYLE = "-fx-background-color:rgba(0,0,0,0.4);";
    static {
        if (Theme.getTheme().equals("DARK")){
            DEFAULT_STYLE = "-fx-background-color: rgba(0,0,0,0);";
            SELECTED_STYLE = "-fx-background-color:rgba(41,128,185 ,0.3);";
        }else{
            DEFAULT_STYLE = "-fx-background-color:rgba(0,0,0,0);";
            SELECTED_STYLE = "-fx-background-color:rgba(0,0,0,0.4);";
        }
    }



    //------------------------------------------------------------------------------------------------------------------
    public static void setSelectedBtn(Button otherButtons[], Button button) {
        for (Button btn : otherButtons) {
            btn.setStyle(DEFAULT_STYLE);
        }
        button.setStyle(SELECTED_STYLE);
    }

    //------------------------------------------------------------------------------------------------------------------
}