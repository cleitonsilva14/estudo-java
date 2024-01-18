package primeiroprograma;
import java.util.Random;
import java.util.Scanner;
public class PrimeiroPrograma {
    
    
    public static void main(String[] args) {
        //Scanner teclado = new Scanner(System.in);

        int v[] = new int[10];
        Scanner c = new Scanner(System.in);
        Random r = new Random();
        
        int maior = 0;
        int menor = 0;
        int aux;
        int soma = 0;
        double md = 0.0;
        
        //Os valores são escolhidos aleatóriamente
        System.out.println("Randomizando...");
        for (int i = 0; i < v.length; i++) {
            v[i] = r.nextInt(11);
        }
        
        System.out.println("============================================");
        System.out.printf("%25s%n","[VETOR RANDOMIZADO]");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        
        System.out.println("\n==========================================");
        System.out.printf("%25s%n","VETOR ORGANIZADO");
        System.out.println("\n------------------------------------------");
        
        //Algoritmo de organização de vetro do tipo Bubble Sort
        for (int i = 0; i < v.length; i++) {
            for (int j = i+1; j < v.length; j++) {
                if (v[i] > v[j]) {
                    aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                }
            }
        }
        
        //Realiza a soma dos elementos e ao mesmo tempo mostra os valores em 
        //cada índice
         
        for (int i = 0; i < v.length;soma +=v[i], i++) {
            System.out.print(v[i] + " ");
        }
        // Calcula a média
        md = soma / v.length;
        
        // Faz a análise dos elementos do vetor v para descobrir o maior e menor 
        // valor
        for (int i = 0; i < v.length; i++) {
            if (i==0) {
                maior = v[i];
                menor = v[i];
            }
            else{
                if (v[i]> maior){
                    maior = v[i];
                }
                else if(v[i]<menor){
                    menor = v[i];
                }
            }
        }
        
        //Printa  
        System.out.println("\n============ RESULTADO =================");
        System.out.println("Maior valor do vetor v: " + maior);
        System.out.println("Menor valor do vetor v: " + menor);
        System.out.println("Soma dos elementos do vetor v: " + soma);
        System.out.println("Média dos elementos do vetor v: " + md);
        System.out.println("=========================================");
        
    }
}
