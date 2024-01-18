package tratamentodeexcecao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoDeExcecao {
    
    static int quociente(int n,int d){
        return n/d;
    }
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); 
        
        try{
            System.out.print("Valor 1: ");
            int n1 = input.nextInt();
            System.out.print("Valor 2: ");
            int n2 = input.nextInt();
            System.out.print("Valor 3: ");
            int n3 = input.nextInt();
            System.out.println(n1/n2/n3);
        }
        catch(ArithmeticException aex){
            System.out.println("Não é possível dividir por zero.");
        }
        catch(InputMismatchException imex){
             System.out.println("Apenas números inteiros");
        }
    }
}
