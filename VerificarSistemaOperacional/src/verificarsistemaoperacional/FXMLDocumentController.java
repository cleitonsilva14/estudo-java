/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificarsistemaoperacional;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author CLEITON
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Button btnVerificar;
    @FXML
    private Label lblSo;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btnVerificar.setOnAction((ActionEvent evt) ->{
            
            String so = System.getProperty("os.name");
            lblSo.setText(so);
        });
    }    
    
}
