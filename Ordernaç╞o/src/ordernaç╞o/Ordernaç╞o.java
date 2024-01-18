package ordernação;
import java.util.Scanner;
public class Ordernação {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int v[] = new int[10];
        int aux;
        for (int i = 0; i < v.length; i++) {
            System.out.printf("Digite o valor para [%d]: ",(i+1));
            v[i] = input.nextInt();
        }
        for (int i = 0; i < v.length; i++) {
            for (int j = i+1; j < v.length; j++) {
                if(v[i]>v[j]){
                    aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                }
            }
        }
        for(int c:v){
            System.out.println(c);
        }
    }
}
