package tratamentoexcecaothrows;

import java.util.Scanner;

public class TratamentoExcecaoThrows {
    
    public static void main(String[] args) {
        //aula 50 parte 2
        System.out.print("Digite o valor decimal: ");
        try{
            double num = leNumero();
            System.out.println("Você digitou  " + num);
        }catch(Exception e){
            System.out.println("Entrada inválida");
            e.printStackTrace();
        }
    }
        
    public static double leNumero()throws Exception{
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();
        return num;
    }
}
