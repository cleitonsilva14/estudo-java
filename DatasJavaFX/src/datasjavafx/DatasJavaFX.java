/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datasjavafx;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author CLEITON
 */
public class DatasJavaFX extends Application {
    Calendar c = Calendar.getInstance();
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        
    }
    
    public static String viewData(){
        Date data = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        //Calendar c = Calendar.getInstance();
        //String dia = Integer.toString(c.get(Calendar.DATE));
        //String mes = Integer.toString(c.get(Calendar.MONTH));
        //String ano = Integer.toString(c.get(Calendar.YEAR));
        
        return sdf.format(data);
        
       
    }
    
    public static String viewHora(){
        //Calendar cd = Calendar.getInstance();
        Date data = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        //String hora = Integer.toString(cd.get(Calendar.HOUR_OF_DAY));
        //String min = Integer.toString(cd.get(Calendar.MINUTE));
        //String sec = Integer.toString(cd.get(Calendar.SECOND));
        //return hora + " : " + min + " : " + sec;
        
        return sdf.format(data);

    }
}
