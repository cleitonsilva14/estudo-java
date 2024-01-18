package listainteiros;
import java.util.ArrayList;
import java.util.Random;

public class ListaInteiros {

    public static void main(String[] args) {
        
        Random r = new Random();
        
        ArrayList <Integer> valores = new ArrayList();
        ArrayList <Integer> numerosPares = new ArrayList();
        
        for (int i = 0; i < 20; i++) {
            valores.add(r.nextInt(10));
        }
        System.out.println("Valores Gerados: ");
        valores.forEach((v) -> {
            System.out.print(v + " ");
        });
        
        
        System.out.println();
        /*
            valores.set(0, 78953);
        
            System.out.println("Modificando....");
            valores.forEach((v)->{
                System.out.print(v + " ");
            });
            System.out.println();
        */
        
        for (int i = 0; i < valores.size(); i++) {
            if (valores.get(i) % 2 == 0) {
                numerosPares.add(valores.get(i));
            }
        }
        System.out.println("Pares");
        System.out.println("-----------------------------------");
        int aux;
        //numerosPares.set(i, numerosPares.get(j));
        for (int i = 0; i < numerosPares.size(); i++) {
            for (int j = i+1; j < numerosPares.size(); j++) {
                if (numerosPares.get(i)>numerosPares.get(j)) {
                    aux = numerosPares.get(i);
                    //numerosPares.set(i, numerosPares.get(j));
                    //numerosPares.get(i) = numerosPares.get(j);
                    //numerosPares.get(j) = aux;
                    numerosPares.set(i, numerosPares.get(j));
                    numerosPares.set(j, aux);
                
                }
            }
        }
        
        numerosPares.forEach((np) -> {
            System.out.print(np + " ");
        });
        System.out.println();
    }
}
