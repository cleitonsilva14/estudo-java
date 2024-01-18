/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coresslider;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author CLEITON
 */
public class CoresSlider extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Image appImage = new Image(getClass().getResourceAsStream("/imgs/icon.png"));
        Scene scene = new Scene(root);
        stage.setTitle("Cores RGB");
        //stage.setResizable(false);
        stage.setScene(scene);
        stage.getIcons().add(appImage);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
