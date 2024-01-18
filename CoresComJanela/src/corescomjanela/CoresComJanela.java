package corescomjanela;

import java.util.Scanner;

public class CoresComJanela {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a cor em Hexadecimal: #");
        // # 00 00 00 
        String cor = input.nextLine().trim().toUpperCase().substring(0, 6);
        
        Janela j = new Janela("#".concat(cor));

    }
}
