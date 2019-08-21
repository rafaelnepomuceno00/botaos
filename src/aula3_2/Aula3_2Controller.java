/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3_2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author IFNMG
 */
public class Aula3_2Controller implements Initializable {

    @FXML
    private RadioButton RB1;
    @FXML
    private RadioButton RB2;
    @FXML
    private RadioButton RB4;
    @FXML
    private RadioButton RB3;
    @FXML
    private ToggleGroup Estado;
    @FXML
    private Label LABEL;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void PegaDados(ActionEvent event) {
    String Info= "";
        
    if (RB1.isSelected()){
        Info += RB1.getText();
    
    }
    
    if (RB2.isSelected()){
        Info += RB2.getText();
            
    }
    if (RB3.isSelected()){
        Info += RB3.getText();
            
    }
      
    if (RB4.isSelected()){
        Info += RB4.getText();
            
    }
    
    LABEL.setText( Info );
    
    }
    
}
