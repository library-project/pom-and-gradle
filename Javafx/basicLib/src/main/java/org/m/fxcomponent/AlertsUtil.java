package org.m.fxcomponent;

import java.util.Optional;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DialogPane;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * @author malaka senanayake @ Creative IT
 */
public class AlertsUtil {

    static Alert alert;
    static DialogPane dialogPane;
    private static  String STYLE_SHEET_LIGHT ;
    static {
        if(Theme.getTheme().equals("DARK")){
            STYLE_SHEET_LIGHT = "/style/alertStyleDark.css";
        }else {
            STYLE_SHEET_LIGHT = "/style/alertStyleLight.css";
        }
    }
    //------------------------------------------------------------------------------------------------------------------

    public static void errorMessage(String message) {
        alert = new Alert(AlertType.ERROR);
        dialogPane = alert.getDialogPane();
        dialogPane.getStylesheets().add(AlertsUtil.class.getResource(STYLE_SHEET_LIGHT).toExternalForm());
        ((Stage) dialogPane.getScene().getWindow()).getIcons().add(new Image("/image/appIcon.png"));
        alert.setTitle(null);
        alert.setHeaderText("Error !");
        alert.setContentText(message);
        alert.showAndWait();
    }
    //------------------------------------------------------------------------------------------------------------------

    public static void informationMessage(String message) {
        alert = new Alert(AlertType.INFORMATION);
        dialogPane = alert.getDialogPane();
        dialogPane.getStylesheets().add(AlertsUtil.class.getResource(STYLE_SHEET_LIGHT).toExternalForm());
        ((Stage) dialogPane.getScene().getWindow()).getIcons().add(new Image("/image/appIcon.png"));
        alert.setTitle(null);
        alert.setHeaderText(" Succes !");
        alert.setContentText(message);
        alert.showAndWait();
    }
    //------------------------------------------------------------------------------------------------------------------

    public static void waningMessage(String message) {
        alert = new Alert(AlertType.WARNING);
        dialogPane = alert.getDialogPane();
        dialogPane.getStylesheets().add(AlertsUtil.class.getResource(STYLE_SHEET_LIGHT).toExternalForm());
        ((Stage) dialogPane.getScene().getWindow()).getIcons().add(new Image("/image/appIcon.png"));
        alert.setTitle(null);
        alert.setHeaderText("Warning !");
        alert.setContentText(message);
        alert.showAndWait();
    }
    //------------------------------------------------------------------------------------------------------------------

    public static void isSavedMessage(boolean isSave) {
        if (isSave == true) {
            informationMessage("SUCCESS !");
        } else {
            errorMessage("ERROR !");
        }
    }
    //------------------------------------------------------------------------------------------------------------------

    public static boolean conformmationMessage(String message) {
        boolean b = false;
        alert = new Alert(AlertType.CONFIRMATION);
        dialogPane = alert.getDialogPane();
        dialogPane.getStylesheets().add(AlertsUtil.class.getResource(STYLE_SHEET_LIGHT).toExternalForm());
        ((Stage) dialogPane.getScene().getWindow()).getIcons().add(new Image("/image/appIcon.png"));
        alert.setTitle(null);
        alert.setHeaderText("Conform ?");
        alert.setContentText(message);
        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK) {
            // ... user chose OK
            b = true;
        } else {
            // ... user chose CANCEL or closed the dialog
            b = false;
        }
        return b;
    }
    //------------------------------------------------------------------------------------------------------------------
}
