/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datasjavafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
//import datasjavafx.DatasJavaFX;
/**
 *
 * @author CLEITON
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private Label label2;
    
    
    @FXML
    private void data(ActionEvent event) {
        //System.out.println("You clicked me!");
        //label.setText("Hello World!");
        label.setText(DatasJavaFX.viewData());
        System.out.println("Data");
        
        //label.setText(DatasJavaFX.viewHora());
        
        
    }
    @FXML
    private void hora(ActionEvent event){
        label2.setText(DatasJavaFX.viewHora());
        System.out.println("Hora");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
