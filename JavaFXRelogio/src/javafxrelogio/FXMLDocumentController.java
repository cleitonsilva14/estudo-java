/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxrelogio;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author CLEITON
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;
    
    @FXML
    private Label lbl;

    @FXML
    private void actionData(ActionEvent event) {
        //System.out.println("You clicked me!");
        //label.setText("Hello World!");
        Date data = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        label.setText(sdf.format(data));
    }
    
    @FXML
    private void actionHora(ActionEvent event){
        Date data = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        lbl.setText(sdf.format(data));
    }
    
    @FXML
    private void actionClear(ActionEvent event){
        label.setText("");
        lbl.setText("");
    }
    
    @FXML 
    private void close(ActionEvent event){
        System.exit(0);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
