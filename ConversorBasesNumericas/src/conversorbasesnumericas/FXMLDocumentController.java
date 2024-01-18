/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversorbasesnumericas;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 *
 * @author CLEITON
 */
public class FXMLDocumentController implements Initializable {

    int decimal = 0;

    @FXML
    private TextField txtBinario;
    @FXML
    private TextField txtOctal;
    @FXML
    private TextField txtHex;
    @FXML
    private Button btnConv;
    @FXML
    private TextField txtDec;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        btnConv.setOnAction((ActionEvent evt) -> {
            try {
                decimal = Integer.parseInt(txtDec.getText());

                txtBinario.setText(Integer.toBinaryString(decimal));
                txtOctal.setText(Integer.toOctalString(decimal));
                txtHex.setText(Integer.toHexString(decimal).toUpperCase());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null,"Erro: " + ex.getMessage());
            }

        });

    }

}
