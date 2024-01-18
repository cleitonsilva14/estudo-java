package matriz;
import java.util.Scanner;
public class Matriz {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        
        System.out.println("Matriz 1");
        System.out.print("Qtd linhas matriz 1: ");
        int lx = read.nextInt();
        System.out.print("Qtd colunas matriz 1: ");
        int cx = read.nextInt();
        
        int x[][] = new int[lx][cx];
        
        System.out.println("Matriz 2");
        System.out.print("Qtd linhas matriz 2: ");
        int ly = read.nextInt();
        System.out.print("Qtd colunas matriz 2: ");
        int cy = read.nextInt();
        
        int y[][] = new int[ly][cy];
        
        System.out.println("Inserir valores para a matriz X");
        for (int i = 0; i < lx; i++) {
            for (int j = 0; j < cx; j++) {
                System.out.printf("Valor para [%d][%d]: ",i+1,j+1);
                x[i][j] = read.nextInt();
            }
        }
        
        System.out.println("Inserir valores para a matriz Y");
        for (int i = 0; i < ly; i++) {
            for (int j = 0; j < cy; j++) {
                System.out.printf("Valor para [%d][%d]: ",i+1,j+1);
                y[i][j] = read.nextInt();
            }
        }
        System.out.println("\nMatriz X");
        for (int i = 0; i < lx; i++) {
            for (int j = 0; j < cx; j++) {
                System.out.printf("%d ",x[i][j]);
            }
            System.out.println();
        }
        System.out.println("\nMatriz Y");
        for (int i = 0; i < ly; i++) {
            for (int j = 0; j < cy; j++) {
                System.out.printf("%d ",y[i][j]);
            }
            System.out.println();
        }
        if ((lx == ly)&&(cx==cy)) {
            System.out.println("A soma pode ser realizada.");
        }else{
            System.out.println("A soma não pode ser realizada.");
        }
    }
}
