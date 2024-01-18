package palavras;
import java.util.ArrayList;
import java.util.Scanner;

public class Palavras {

    public static void main(String[] args) {
      
        
        Scanner tec = new Scanner(System.in);
        ArrayList <String> listaFrutas = new ArrayList();
        String []frutas = new String[5];
        
        int c = 0;
        
        listaFrutas.add("Abacate");
        listaFrutas.add("Abacaxi");
        listaFrutas.add("Pitaya");
        listaFrutas.add("Caju");
        listaFrutas.add("Jabuticaba");
        listaFrutas.add("Banana");
        listaFrutas.add("Acerola");
        listaFrutas.add("Laranja");
        listaFrutas.add("Amora");
        listaFrutas.add("Morango");
        listaFrutas.add("Melancia");
        listaFrutas.add("Kiwi");
        listaFrutas.add("Buriti");
        listaFrutas.add("Jaca");
        listaFrutas.add("Articum");
        listaFrutas.add("Graviola");
        
        
        System.out.print("Digite a letra: ");
        char l = tec.next().toUpperCase().charAt(0);
        
        
        for (int i = 0; i < listaFrutas.size(); i++) {
            if (listaFrutas.get(i).charAt(0) == l) {
                c+=1;
            }
        }
        if (c>0) {
            System.out.println("Com a letra " + l + " encontrei: ");
            for (int i = 0; i < listaFrutas.size(); i++) {
                if (listaFrutas.get(i).charAt(0) == l) {
                    System.out.println(listaFrutas.get(i));
                }
            }
        }else{
            System.out.println("Não encontrei nenhuma fruta que começa com a letra: " + l);
        }
    }
}
