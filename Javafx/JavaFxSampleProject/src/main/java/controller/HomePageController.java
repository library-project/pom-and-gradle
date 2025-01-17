/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import JfxComponent.AlertsUtil;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author BEST
 */
public class HomePageController implements Initializable {

    @FXML
    private Button loginBtn;
    @FXML
    private Button closeBth;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loginBtnOnAction(ActionEvent event) {
        AlertsUtil.informationMessage("ok success !!");
        AlertsUtil.errorMessage("error");
    }

    @FXML
    private void closeBthOnAction(ActionEvent event) {
        System.exit(0);
    }
    
}
