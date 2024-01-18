package Main;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author CLEITON
 */
public class DataFormat {

    public static void main(String[] args) {

        Date data = new Date();
        System.out.println("Objeto da classe Date sem formatação: " + data);
        
        SimpleDateFormat dma = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(dma.format(data));
        
        SimpleDateFormat dm = new SimpleDateFormat("dd/MM");
        System.out.println(dm.format(data));
        
        SimpleDateFormat hms = new SimpleDateFormat("HH:mm:ss");
        System.out.println(hms.format(data));
        
        
    }
}
