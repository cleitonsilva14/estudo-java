/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxcolorapplication;

import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 *
 * @author CLEITON
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Button btnExit;
    @FXML
    private Button btnConfirm;
    @FXML
    private Label lblMensagem;
    @FXML
    private Button btnNewWindow;

    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void confirm(MouseEvent event) {
        Date date = new Date();
        lblMensagem.setText(new SimpleDateFormat("dd/MM/yyyy").format(date));
        
    }
    
    
    @FXML
    private void closeApp(MouseEvent event) {
        System.exit(0);
    }

    @FXML
    private void newWindow(ActionEvent event) throws IOException {
        FXMLLoader fxmll = new FXMLLoader();
        fxmll.setLocation(getClass().getResource("InfoFXML.fxml"));
        Scene scene = new Scene(fxmll.load(), 600, 400);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
    
}
