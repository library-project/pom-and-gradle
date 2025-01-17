package org.m.fxcomponent;

import java.io.IOException;
import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * @author malaka Senanayake @ Creative IT
 */
public class FormUtil {

    static FXMLLoader loder;
    static Stage subStage;
    static AnchorPane root;
    static Scene scene;
    //------------------------------------------------------------------------------------------------------------------

    public static void newUndecoratedMaximizedFrame(URL fxmlAnchourPanePath) {
        try {
            subStage = new Stage();
            root = new AnchorPane();
            subStage.initStyle(StageStyle.UNDECORATED);
            subStage.setMaximized(true);
            loder = new FXMLLoader();
            loder.setLocation(fxmlAnchourPanePath);
            root = loder.load();
            scene = new Scene(root);
            subStage.setScene(scene);
            subStage.centerOnScreen();
            subStage.show();
        } catch (IOException ex) {
            System.out.println("new stage" + ex);
        }
        System.gc();
    }
    //------------------------------------------------------------------------------------------------------------------

    public static void newUndecoratedDialog(URL fxmlAnchourPanePath) {
        try {
            subStage = new Stage();
            root = new AnchorPane();
            loder = new FXMLLoader();
            loder.setLocation(fxmlAnchourPanePath);
            root = loder.load();
            scene = new Scene(root);
            subStage.initStyle(StageStyle.UNDECORATED);
            subStage.initModality(Modality.APPLICATION_MODAL);
            subStage.setScene(scene);
            subStage.centerOnScreen();
            subStage.show();
        } catch (IOException ex) {
            System.out.println("new stage" + ex);
        }
        System.gc();
    }
    //------------------------------------------------------------------------------------------------------------------

    public static void newUndecoratedDialog(URL fxmlAnchourPanePath, Object controller) {
        try {
            subStage = new Stage();
            root = new AnchorPane();
            loder = new FXMLLoader();
            loder.setLocation(fxmlAnchourPanePath);
            loder.setController(controller);
            root = loder.load();
            scene = new Scene(root);
            subStage.initStyle(StageStyle.UNDECORATED);
            subStage.initModality(Modality.APPLICATION_MODAL);
            subStage.setScene(scene);
            subStage.centerOnScreen();
            subStage.show();
        } catch (IOException ex) {
            System.out.println("new stage" + ex);
        }
        System.gc();
    }
    //------------------------------------------------------------------------------------------------------------------

    public static void newUndecoratedDialogGroupPane(URL fxmlGroupPanePath) {
        try {
            subStage = new Stage();
            Group root = new Group();
            loder = new FXMLLoader();
            loder.setLocation(fxmlGroupPanePath);
            root = loder.load();
            scene = new Scene(root);
            subStage.initStyle(StageStyle.UNDECORATED);
            subStage.initModality(Modality.APPLICATION_MODAL);
            subStage.setScene(scene);
            subStage.centerOnScreen();
            subStage.show();
        } catch (IOException ex) {
            System.out.println("new stage" + ex);
        }
        System.gc();
    }
    //------------------------------------------------------------------------------------------------------------------

    public static void newUndecoratedDialogGroupPane(URL fxmlGroupPanePath, Object controller) {
        try {
            subStage = new Stage();
            Group root = new Group();
            loder = new FXMLLoader();
            loder.setLocation(fxmlGroupPanePath);
            loder.setController(controller);
            root = loder.load();
            scene = new Scene(root);
            subStage.initStyle(StageStyle.UNDECORATED);
            subStage.initModality(Modality.APPLICATION_MODAL);
            subStage.setScene(scene);
            subStage.centerOnScreen();
            subStage.show();
        } catch (IOException ex) {
            System.out.println("new stage" + ex);
        }
        System.gc();
    }
    //------------------------------------------------------------------------------------------------------------------

    public static void newMaxiMizedFrame(URL fxmlPath) {
        try {
            subStage = new Stage();
            root = new AnchorPane();
            subStage.setMaximized(true);
            loder = new FXMLLoader();
            loder.setLocation(fxmlPath);
            root = loder.load();
            scene = new Scene(root);
            subStage.setScene(scene);
            subStage.centerOnScreen();
            subStage.show();
        } catch (IOException ex) {
            System.out.println("new stage" + ex);
        }
        System.gc();
    }
    //------------------------------------------------------------------------------------------------------------------

    public static void newMaxiMizedFrame(URL fxmlPath, Object controller) {
        try {
            subStage = new Stage();
            root = new AnchorPane();
            subStage.setMaximized(true);
            loder = new FXMLLoader();
            loder.setLocation(fxmlPath);
            loder.setController(controller);
            root = loder.load();
            scene = new Scene(root);
            subStage.setScene(scene);
            subStage.centerOnScreen();
            subStage.show();
        } catch (IOException ex) {
            System.out.println("new stage" + ex);
        }
        System.gc();
    }
    //------------------------------------------------------------------------------------------------------------------

    public static void newFrame(URL fxmlPath) {
        try {
            subStage = new Stage();
            root = new AnchorPane();
            loder = new FXMLLoader();
            loder.setLocation(fxmlPath);
            root = loder.load();
            scene = new Scene(root);
            subStage.setScene(scene);
            subStage.centerOnScreen();
            subStage.show();
        } catch (IOException ex) {
            System.out.println("new stage" + ex);
        }
        System.gc();
    }
    //------------------------------------------------------------------------------------------------------------------

    public static void newTranparentDialog(URL fxmlAnchourPanePath) {
        try {
            subStage = new Stage();
            root = new AnchorPane();
            loder = new FXMLLoader();
            loder.setLocation(fxmlAnchourPanePath);
            root = loder.load();
            scene = new Scene(root);
            subStage.initStyle(StageStyle.UNDECORATED);
            subStage.initModality(Modality.APPLICATION_MODAL);
            subStage.initStyle(StageStyle.TRANSPARENT);
            subStage.centerOnScreen();
            scene.setFill(Color.TRANSPARENT);
            subStage.setScene(scene);
            subStage.show();
        } catch (IOException ex) {
            System.out.println("new stage" + ex);
        }
        System.gc();
    }
    //------------------------------------------------------------------------------------------------------------------

    public static void newDialog(URL fxmlAnchourPanePath) {
        try {
            subStage = new Stage();
            root = new AnchorPane();
            loder = new FXMLLoader();
            loder.setLocation(fxmlAnchourPanePath);
            root = loder.load();
            scene = new Scene(root);
            subStage.initStyle(StageStyle.DECORATED);
            subStage.initModality(Modality.APPLICATION_MODAL);
            subStage.setResizable(false);
            subStage.setScene(scene);
            subStage.centerOnScreen();
            subStage.show();
        } catch (IOException ex) {
            System.out.println("new stage" + ex);
        }
        System.gc();
    }
    //------------------------------------------------------------------------------------------------------------------

    public static void newDialog(URL fxmlAnchourPanePath, Object controller) {
        try {
            subStage = new Stage();
            root = new AnchorPane();
            loder = new FXMLLoader();
            loder.setLocation(fxmlAnchourPanePath);
            loder.setController(controller);
            root = loder.load();
            scene = new Scene(root);
            subStage.initStyle(StageStyle.DECORATED);
            subStage.initModality(Modality.APPLICATION_MODAL);
            subStage.setResizable(false);
            subStage.setScene(scene);
            subStage.centerOnScreen();
            subStage.show();
        } catch (IOException ex) {
            System.out.println("new stage" + ex);
        }
        System.gc();
    }
    //------------------------------------------------------------------------------------------------------------------

    public static void newFrame(URL fxmlPath, Object controller) {
        try {
            subStage = new Stage();
            root = new AnchorPane();
            loder = new FXMLLoader();
            loder.setLocation(fxmlPath);
            loder.setController(controller);
            root = loder.load();
            scene = new Scene(root);
            subStage.centerOnScreen();
            subStage.setAlwaysOnTop(true);
            subStage.setResizable(false);
            subStage.setScene(scene);
            subStage.show();
        } catch (IOException ex) {
            System.out.println("new stage" + ex);
        }
        System.gc();
    }
    //------------------------------------------------------------------------------------------------------------------

    public static void newDialogGroupPane(URL fxmlGroupPanePath) {
        try {
            subStage = new Stage();
            Group root = new Group();
            loder = new FXMLLoader();
            loder.setLocation(fxmlGroupPanePath);
            root = loder.load();
            scene = new Scene(root);
            subStage.initStyle(StageStyle.DECORATED);
            subStage.initModality(Modality.APPLICATION_MODAL);
            subStage.setScene(scene);
            subStage.setResizable(false);
            subStage.centerOnScreen();
            subStage.show();
        } catch (IOException ex) {
            System.out.println("new stage" + ex);
        }
        System.gc();
    }
    //------------------------------------------------------------------------------------------------------------------

    public static void newDialogGroupPane(URL fxmlGroupPanePath, Object controller) {
        try {
            subStage = new Stage();
            Group root = new Group();
            loder = new FXMLLoader();
            loder.setLocation(fxmlGroupPanePath);
            loder.setController(controller);
            root = loder.load();
            scene = new Scene(root);
            subStage.initStyle(StageStyle.DECORATED);
            subStage.initModality(Modality.APPLICATION_MODAL);
            subStage.setScene(scene);
            subStage.setResizable(false);
            subStage.centerOnScreen();
            subStage.show();
        } catch (IOException ex) {
            System.out.println("new stage" + ex);
        }
        System.gc();
    }
    //------------------------------------------------------------------------------------------------------------------

    public static void closeWindow(Node node) {
        ((Stage) node.getParent().getScene().getWindow()).close();
    }
    //------------------------------------------------------------------------------------------------------------------
//
//    public static void newUndecoratedFrame(URL fxmlPath) {
//        try {
//            Stage subStage = new Stage();
//            AnchorPane editsupRoot = new AnchorPane();
//            subStage.initStyle(StageStyle.UNDECORATED);
//            FXMLLoader loder = new FXMLLoader();
//            loder.setLocation(fxmlPath);
//            editsupRoot = loder.load();
//            Scene newsc = new Scene(editsupRoot);
//            subStage.setScene(newsc);
//            subStage.show();
//        } catch (IOException ex) {
//            System.out.println("new stage" + ex);
//        }
//    }
////******************************************************************************
//
//    public static void newUndecoratedMaximizedDialog(URL fxmlPath) {
//        try {
//            Stage subStage = new Stage();
//            AnchorPane editsupRoot = new AnchorPane();
//            FXMLLoader loder = new FXMLLoader();
//            loder.setLocation(fxmlPath);
//            editsupRoot = loder.load();
//            Scene newsc = new Scene(editsupRoot);
//            subStage.setMaximized(true);
//            subStage.initStyle(StageStyle.UNDECORATED);
//            subStage.initModality(Modality.APPLICATION_MODAL);
//
//            subStage.setScene(newsc);
//            subStage.show();
//        } catch (IOException ex) {
//            System.out.println("new stage" + ex);
//        }
//    }
////******************************************************************************
//
//    public static void newMaximizedDialog(URL fxmlPath) {
//        try {
//            Stage subStage = new Stage();
//            AnchorPane editsupRoot = new AnchorPane();
//            FXMLLoader loder = new FXMLLoader();
//            loder.setLocation(fxmlPath);
//            editsupRoot = loder.load();
//            Scene newsc = new Scene(editsupRoot);
//            subStage.setMaximized(true);
//            subStage.initStyle(StageStyle.DECORATED);
//            subStage.initModality(Modality.APPLICATION_MODAL);
//
//            subStage.setScene(newsc);
//            subStage.show();
//        } catch (IOException ex) {
//            System.out.println("new stage" + ex);
//        }
//    }
////******************************************************************************
}
