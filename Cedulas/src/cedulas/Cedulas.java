package cedulas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cedulas {

    public static void main(String[] args) {
        
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(sdf.format(d));
        
        int v[] = new int[]{100,50,20,10,5};
        int valor = 405;
        
        for (int i = 0; i < v.length; i++) {
            int q = valor / v[i];
            System.out.println(q + " cédula(s) de " + v[i]);
            valor %= v[i];
        }
        
    }
}
