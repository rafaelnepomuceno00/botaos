/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author IFNMG
 */
public class Aula1Controller implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button button;
    @FXML
    private Label aaaa;
    @FXML
    private TextField Campodetexto;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("Voce clicou");
        //recebendo o texto armazenado em um label
        
        String m = label.getText();

                label.setText(m+ " Grama!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

@FXML
    private void Cabess(ActionEvent event) {
        
          String t = Campodetexto.getText();
        
          System.out.println("texto recbedo");
        
   
        
        aaaa.setText(t);

        
    }
    
}
