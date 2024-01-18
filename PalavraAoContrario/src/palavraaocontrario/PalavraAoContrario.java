package palavraaocontrario;

import java.util.Scanner;

public class PalavraAoContrario {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a palavra: ");
        String p = input.nextLine();
        
        int f = 0;
        int l = p.length() - 1;
        
        for (int i = p.length() - 1; i >= 0; i--) {
            System.out.printf("%s", p.charAt(i));
        }
        System.out.println("");
    }
}
