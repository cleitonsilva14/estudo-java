
package conversortemperaturas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class ConversorTemperaturas extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Image appIcon = new Image(getClass().getResourceAsStream("/imagens/logo.png"));
        Scene scene = new Scene(root);
        stage.setResizable(false);
        stage.setTitle("Conversor Temperaturas - JavaFX");
        stage.getIcons().add(appIcon);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
