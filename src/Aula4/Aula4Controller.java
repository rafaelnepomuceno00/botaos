/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula4;

import com.sun.javafx.collections.ObservableIntegerArrayImpl;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author IFNMG
 */
public class Aula4Controller implements Initializable {

    @FXML
    private DatePicker datepickervalidade;
    @FXML
    private Button moss;
    @FXML
    private ComboBox<String> combocidades;
    @FXML
    private ListView<String> LIstViewCidade;
    @FXML
    private Spinner <Integer> spinerperiodo;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       // Configurar os elementos que vao aparecer que vao aparecer no combobox
       //list de String no comboBox
        ObservableList lista = FXCollections.observableArrayList();
        lista.add("Pirapora");
        lista.add("Buritizeiro");
        lista.add("Varzea da Palma");
        
        combocidades.setItems(lista);
        
        
        LIstViewCidade.setItems(lista);
        
        SpinnerValueFactory <Integer> valores;
        valores = new  SpinnerValueFactory.IntegerSpinnerValueFactory(1,8);
        
        spinerperiodo.setValueFactory(valores);
    }    

    @FXML
    private void pegardados(ActionEvent event) {
    
        //pegando a data do componente
        LocalDate data = datepickervalidade.getValue();
        System.out.print(data);
   
       
        System.out.println("\n "+combocidades.getValue());
        
        
        String Selecionado = LIstViewCidade.getSelectionModel().getSelectedItem();
        System.out.println(Selecionado);
        
        
       System.out.println("\n "+spinerperiodo.getValue());
    }
    
}
