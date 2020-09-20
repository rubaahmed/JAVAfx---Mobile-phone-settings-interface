/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setting;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author reham
 */
public class FXMLDocumentController implements Initializable {
    
      @FXML
    private AnchorPane Hide;

    @FXML
    private JFXButton setting;

    @FXML
    private JFXButton user;

    @FXML
    private JFXButton hide;

    @FXML
    private JFXButton exit;

    @FXML
    private AnchorPane Settings;

    @FXML
    private AnchorPane Users;

    @FXML
    void handleButtonAction(ActionEvent event) {
     if(event.getSource()==setting){
         Settings.toFront();
     }else if(event.getSource()==user){
         Users.toFront();
     }else if(event.getSource()==hide){
         Hide.toFront();
     }else if(event.getSource()==exit){
         Platform.exit();
     }
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
