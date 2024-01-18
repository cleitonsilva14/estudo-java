/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corescomjanelafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author CLEITON
 */
public class CoresComJanelaFX extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Image appIcon = new Image(getClass().getResourceAsStream("/imagens/icon_color.png"));
        Scene scene = new Scene(root);
        stage.setResizable(false);
        //scene.setFill(Color.web("1abc9c"));
        stage.setScene(scene);
        stage.setTitle("Cores");
        stage.getIcons().add(appIcon);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
