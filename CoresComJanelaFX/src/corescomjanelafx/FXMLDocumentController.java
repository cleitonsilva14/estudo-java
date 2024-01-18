/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corescomjanelafx;

import java.awt.Color;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

/**
 *
 * @author CLEITON
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField txtCorHex;
    @FXML
    private Pane panCor;
    @FXML
    private Button btnConv;
    @FXML
    private TextField txtCorAtual;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void converterCor(ActionEvent event) {
        txtCorHex.getText(0, 6);
        txtCorAtual.setText("#"+txtCorHex.getText(0,6));
        panCor.setLayoutX(32.00);
    }
    
}
