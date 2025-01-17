package com.main;


import JfxComponent.AnchorPaneUtil;
import com.app.path.FxmlPath;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author malaka senanayake
 */
public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        if (true) { //CheckUtil.staus()
            try {
                AnchorPane rootpane = AnchorPaneUtil.setNew(FxmlPath.HOME_PAGE_URL);
                Scene sc = new Scene(rootpane);
                primaryStage.initStyle(StageStyle.UNDECORATED);
                primaryStage.centerOnScreen();
                primaryStage.getIcons().add(new Image("/image/appIcon.png"));
                primaryStage.setScene(sc);
//                rootpane.setStyle("/styles/Styles_1.css");
//                loadJasper(); // this  method is use to load jasper libs
                primaryStage.show();
            } catch (Exception ex) {
//                System.out.println(" exception in main method  " + ex);
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
//******************************************************************************

    private void loadJasper() {
        try {
//           JasperReport jr = JasperCompileManager.compileReport(Path.Reports.getItemInvoices());
//           JasperPrint jp = JasperFillManager.fillReport(jr, null, DataBase.getConnection()); 
        } catch (Exception e) {
            System.out.println("jasper load exception" + e);
        }
    }
//******************************************************************************
}
