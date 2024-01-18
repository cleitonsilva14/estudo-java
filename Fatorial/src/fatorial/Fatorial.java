package fatorial;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        System.out.print("Digite o valor: ");
        int num = t.nextInt();
        int f = 1;
        for (int i = num; i > 0; i--) {
            f *= i;
        }
        System.out.printf("%d! é %d\n",num,f);
    }
}
