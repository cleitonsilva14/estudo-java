/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author CLEITON
 */
public class FXMLDocumentController implements Initializable {
    
    double valor1 = 0.0;
    double valor2 = 0.0;
    double resultado = 0.0;
    final double  PI = 3.14;
    String operacao = "";
    
    @FXML
    private Button btn7;
    @FXML
    private Button btn5;
    @FXML
    private Button btn8;
    @FXML
    private Button btn9;
    @FXML
    private Button btn4;
    @FXML
    private Button btn2;
    @FXML
    private Button btn1;
    @FXML
    private Button btn3;
    @FXML
    private Button btn6;
    @FXML
    private Button btnPonto;
    @FXML
    private Button btn0;
    @FXML
    private Button btnIgual;
    @FXML
    private Button btnMais;
    @FXML
    private Button btnMenos;
    @FXML
    private Button btnVezes;
    @FXML
    private Button btnLimpar;
    @FXML
    private Button btnDividir;
    @FXML
    private Button btnRaizQuadrada;
    @FXML
    private Button btnPi;
    @FXML
    private Button btnPotencia;
    @FXML
    private TextField txtCalc;
    @FXML
    private TextField txtAux;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        
        btn0.setOnAction((ActionEvent event) -> {
            txtCalc.setText(txtCalc.getText() + "0");
        });
        
        btn1.setOnAction((ActionEvent event) -> {
            txtCalc.setText(txtCalc.getText() + "1");
        });
        
        btn2.setOnAction((ActionEvent event)->{
            txtCalc.setText(txtCalc.getText() + "2");
        });
        
        btn3.setOnAction((ActionEvent event) ->{
           txtCalc.setText(txtCalc.getText()+ "3");
        });
        
        btn4.setOnAction((ActionEvent event) ->{
           txtCalc.setText(txtCalc.getText() + "4");
        });
        
        btn5.setOnAction((ActionEvent event)->{
            txtCalc.setText(txtCalc.getText() + "5");
        });
        
        btn6.setOnAction((ActionEvent event)->{
            txtCalc.setText(txtCalc.getText() + "6");
        });
        
        btn7.setOnAction((ActionEvent event) ->{
           txtCalc.setText(txtCalc.getText() + "7"); 
        });
        
        btn8.setOnAction((ActionEvent event) ->{
            txtCalc.setText(txtCalc.getText() + "8");
        });
        
        btn9.setOnAction((ActionEvent event) -> {
            txtCalc.setText(txtCalc.getText() + "9");
        });
        
        btnLimpar.setOnAction((ActionEvent event) ->{
            txtCalc.setText("");
            txtAux.setText("0");
        });
        
        btnPonto.setOnAction((ActionEvent event) ->{
            txtCalc.setText(txtCalc.getText() + ".");
        });
        
        //Operações
        /*  
            0 - Telinha auxiliar; 
            1 - Obter primeiro valor;
            2 - Pegar a operação;
            3 - Limpar o txtCalc;
        */
        
        btnMais.setOnAction((ActionEvent event)->{
            txtAux.setText(txtCalc.getText() + " + "); //telinha auxiliar
            valor1 = Double.parseDouble(txtCalc.getText()); // variável adquire um valor
            operacao = "+"; //operação
            txtCalc.setText(""); // limpa o campo de entrada dos valores
        });
        
        btnMenos.setOnAction((ActionEvent event) ->{
            txtAux.setText(txtCalc.getText() + " - ");
            valor1 = Double.parseDouble(txtCalc.getText());
            operacao = "-";
            txtCalc.setText("");
        });
        
        btnVezes.setOnAction((ActionEvent event)->{
            txtAux.setText(txtCalc.getText() + " x ");
            valor1 = Double.parseDouble(txtCalc.getText());
            operacao = "*";
            txtCalc.setText("");
        });
        
        btnDividir.setOnAction((ActionEvent event) ->{
            txtAux.setText(txtCalc.getText() + " / ");
            valor1 = Double.parseDouble(txtCalc.getText());
            operacao = "/";
            txtCalc.setText("");
        });
        
        
        btnIgual.setOnAction((ActionEvent event) ->{
            valor2 = Double.parseDouble(txtCalc.getText());
            switch(operacao){
                case "+":
                    txtAux.setText(txtAux.getText() + txtCalc.getText());
                    txtCalc.setText(String.valueOf(valor1 + valor2));
                    break;
                case "-":
                    txtAux.setText(txtAux.getText() + txtCalc.getText());
                    txtCalc.setText(String.valueOf(valor1 - valor2));
                    break;
                case "*":
                    txtAux.setText(txtAux.getText() + txtCalc.getText());
                    txtCalc.setText(String.valueOf(valor1 * valor2));
                    break;
                case "/":
                    txtAux.setText(txtAux.getText() + txtCalc.getText());
                    txtCalc.setText(String.valueOf(valor1 / valor2));
                break;
                
            }
            
        });
        
        //Operações Adicionais
        
        //if (txtCalc.getText().contains(".")) {}
        // txtCalc.getText().concat(",");
        
        //Raíz Quadrada
        btnRaizQuadrada.setOnAction((ActionEvent event) ->{
            valor1 = Double.parseDouble(txtCalc.getText());
            if (valor1 != 0) {
                txtAux.setText("√" + valor1);
                txtCalc.setText(String.valueOf(Math.sqrt(valor1)));
            }else{
                txtAux.setText("");
                txtCalc.setText("");
            }
            
        });
        
        
        //Valor de PI
        btnPi.setOnAction((ActionEvent event)->{
            txtCalc.setText("3.14");
        });
        
        
        //Pontência
        btnPotencia.setOnAction((ActionEvent event)->{
            valor1 = Double.parseDouble(txtCalc.getText());
            txtAux.setText(txtCalc.getText() + "^²");
            
            txtCalc.setText(String.valueOf(valor1*valor1));
            
        });
        
    }    
}
