/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author IFNMG
 */
public class Aula3Controller implements Initializable {

    @FXML
    private PasswordField TextoSenha;
    @FXML
    private TextArea TextArea;
    @FXML
    private Label LabelDados;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void PegarDados(ActionEvent event) {
      String t = "" ;
        
     //pegar dado do passsword
     t += " Senha: " + TextoSenha.getText();
     
     t += "\n Reclamações: " + TextArea.getText();
     
    
     LabelDados.setText(t);
    
    
    
    
    }
    
}
