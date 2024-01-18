package basesnumericas;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BasesNumericas {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        //System.out.print("Digite o número inteiro: ");
        //int num = input.nextInt();
        
        int num = rand.nextInt(101);
        int n = num;
        System.out.print("Valor " + num + " em binário: ");
        ArrayList<Integer> resultado = new ArrayList();
        
        while(n!=0){
            resultado.add(n%2);
            n/=2;
        }
        
        for (int i = resultado.size()-1; i >= 0 ; i--) {
            System.out.print(resultado.get(i));
        }
        System.out.println("");
        
        

    }
    
}
