/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relogiojavafx;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.TextFlow;

/**
 *
 * @author CLEITON
 */
public class FXMLDocumentController implements Initializable {
    
    
    @FXML
    private Label lblData;
    @FXML
    private TextField txtHora;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        Timer tempo = new Timer();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat fd = new SimpleDateFormat("dd/MM/yyyy");
        TimerTask tmk = new TimerTask() {
            
            @Override
            public void run() {
                txtHora.setEditable(false);
                txtHora.setText(sdf.format(new Date()));
                lblData.setText(fd.format(new Date()));
            }
        };
        
        tempo.scheduleAtFixedRate(tmk, 0, 1000);
        
    }    
    
}
