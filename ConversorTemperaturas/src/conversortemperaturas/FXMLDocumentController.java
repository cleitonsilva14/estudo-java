/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversortemperaturas;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;

import javafx.beans.binding.Bindings;

/**
 *
 * @author CLEITON
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Slider sldTemp;
    @FXML
    private Label lblC;
    @FXML
    private Label lblF;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void send(MouseEvent event) {
        /*
            lblSend.setText(String.format("%.2f",sliderTemp.getValue()));

            lblSend.setText(Double.toString(sliderTemp.getValue()));
        
            sliderTemp.valueProperty().addListener((a,n,d)->{
            lblSend.setText(String.format("%.2f",n.floatValue()));
            });
         */ 
        
        lblC.textProperty().bind(
                Bindings.format("%.2f", sldTemp.valueProperty()
            )
        );
        //Double temperatura = (Double.parseDouble(lblC.getText()) * 9/5 + 32);
        //lblF.setText(String.format("%.2f",temperatura));
        
        lblF.setText(lblC.getText());
        //(0 °C × 9/5) + 32 = 32 °F
       
        
        
    }
}
