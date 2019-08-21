/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author IFNMG
 */
public class FXMLController implements Initializable {

    @FXML
    private CheckBox CheckBoxPoo1;
    @FXML
    private CheckBox CheckBoxBD1;
    @FXML
    private CheckBox CheckBoxAEDs1;
    @FXML
    private CheckBox CheckBoxENGDS1;
    @FXML
    private Label label;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void PegarInformacoes(ActionEvent event) {
    String Info = " ";

//como elemento checkbox nos temos que verificar indiviualmente se o mesmo está ou nao selecionado
    
    
    
    //o metodo isSelect() diz se o checkbox está ou nao selecionado
    if (CheckBoxPoo1.isSelected()){
        Info += CheckBoxPoo1.getText()+" | ";
    
    }
    
    if (CheckBoxBD1.isSelected()){
        Info += CheckBoxBD1.getText()+" | ";
            
    }
    if (CheckBoxENGDS1.isSelected()){
        Info += CheckBoxENGDS1.getText()+" | ";
            
    }
      
    if (CheckBoxAEDs1.isSelected()){
        Info += CheckBoxAEDs1.getText()+" | ";
            
    }
    
    label.setText( Info );

    }

}

