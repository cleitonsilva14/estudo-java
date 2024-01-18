
package matrizes;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
public class Matrizes {

    public static void main(String[] args) {
        
        final int DIA_DO_PROGRAMADOR = 256;
        
        Date data = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(sdf.format(data));
        
        Calendar cld = Calendar.getInstance();
        int dia_atual = cld.get(Calendar.DAY_OF_YEAR);
        
        if(dia_atual == DIA_DO_PROGRAMADOR){
            System.out.println("Feliz dia do programador");
        }else{
            System.out.println("Hoje não é dia do programador");
            System.out.println("Dia do ano: " + dia_atual);
        }
       

        int a[][] = new int[4][3];
        int c[][] = new int[5][2];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%2d%d ",i+1,j+1);
            }
            System.out.println("");
        }
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (i>=j) {
                    a[i][j] = 2;
                }else if(i < j){
                    a[i][j] = -1;
                }
            }
        }
        System.out.println("");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("\033[34m%2d\033[m ",a[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.printf("%2d%d ",i+1,j+1);
            }
            System.out.println("");
        }
        System.out.println("");
        
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 2; j++) {
                c[i][j] = (i*i) + j;
            }
            
        }
        
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 2; j++) {
                System.out.printf("\033[35m%d\033[m ",c[i][j]);
            }
        }
        System.out.println("");




    }
}
