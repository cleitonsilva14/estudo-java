/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equacaodosegundograu;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author CLEITON
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private TextField txtA;
    @FXML
    private TextField txtB;
    @FXML
    private TextField txtC;
    @FXML
    private Button btnCalc;
    @FXML
    private TextField txtRs;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        btnCalc.setOnAction((ActionEvent ->{

            int a = txtA.getText().equals("") ? 0 : Integer.parseInt(txtA.getText());
            int b = txtB.getText().equals("") ? 0 : Integer.parseInt(txtB.getText());
            int c = txtC.getText().equals("") ? 0 : Integer.parseInt(txtC.getText());
            
            double delta = Math.pow(b, 2) - 4 * a * c;
            
            txtRs.setText(String.format("%.1f", delta));
            
        }));
        
    }    
    
}
