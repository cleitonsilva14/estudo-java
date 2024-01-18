/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coresslider;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

/**
 *
 * @author CLEITON
 */
public class FXMLDocumentController implements Initializable, ChangeListener {

    @FXML
    private Slider green;
    @FXML
    private Slider red;
    @FXML
    private Slider blue;
    @FXML
    private AnchorPane background;
    @FXML
    private Text txtGreen;
    @FXML
    private Text txtBlue;
    @FXML
    private Text txtRed;
    @FXML
    private Text txtHex;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        red.valueProperty().addListener(this);
        green.valueProperty().addListener(this);
        blue.valueProperty().addListener(this);
        
    }    

    @FXML
    private void clicked(MouseEvent event) {
        
    }

    @Override
    public void changed(ObservableValue observable, Object oldValue, Object newValue) {
        /**/
        txtRed.setText(String.format("%.0f",red.getValue()));
        txtGreen.setText(String.format("%.0f",green.getValue()));
        txtBlue.setText(String.format("%.0f",blue.getValue()));
        //txtHex.setText(txtRed.getText().concat(txtGreen.getText()).concat(txtBlue.getText()));
        
        String hex = "#";
        hex += Integer.toHexString(Integer.parseInt(txtRed.getText()));
        hex += Integer.toHexString(Integer.parseInt(txtGreen.getText()));
        hex += Integer.toHexString(Integer.parseInt(txtBlue.getText()));
        
        txtHex.setText(hex);
        
        int rToHex = Integer.parseInt(txtRed.getText());
        int gToHex = Integer.parseInt(txtGreen.getText());
        int bToHex = Integer.parseInt(txtBlue.getText());
        
        //System.out.print((rToHex >> 16) & 0xFF);
        //System.out.print((gToHex >> 8) & 0xFF);
        //System.out.print(bToHex  & 0xFF);
        //System.out.println("");
        /**/
        
        Double r = red.getValue();
        Double g = green.getValue();
        Double b = blue.getValue();
        //System.out.println("Clicado");
        Color color0 = Color.rgb(r.intValue(), g.intValue(), b.intValue());
        background.setBackground(new Background(new BackgroundFill(color0, CornerRadii.EMPTY, Insets.EMPTY)));

    }
}
