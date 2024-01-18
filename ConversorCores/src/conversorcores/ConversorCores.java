package conversorcores;
import java.util.Scanner;

public class ConversorCores {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite a cor: #");
        String cor = input.nextLine().toUpperCase();
        //0099ff
        String []digitosHex = new String[3];
        
        digitosHex[0] = cor.substring(0,2);
        digitosHex[1] = cor.substring(2,4);
        digitosHex[2] = cor.substring(4,6);
        
        System.out.println(digitosHex[0]);
        System.out.println(digitosHex[1]);
        System.out.println(digitosHex[2]);
        
        
        System.out.println("R: " + Integer.parseInt(digitosHex[0], 16));
        System.out.println("G: " + Integer.parseInt(digitosHex[1], 16));
        System.out.println("B: " + Integer.parseInt(digitosHex[2], 16));
        
    }
}
