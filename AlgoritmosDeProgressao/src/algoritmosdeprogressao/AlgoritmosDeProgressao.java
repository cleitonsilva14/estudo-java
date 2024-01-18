
package algoritmosdeprogressao;

public class AlgoritmosDeProgressao {

    public static void main(String[] args) {
        
        System.out.println("Arithmetic progression with default icrement: ");
        arithmeticProgressionDefault(10);
        System.out.println("Arithtmetic progression with increment 5: ");
        arithmeticProgressionIncrement(5);
        System.out.println("Geometric progression with default base: ");
        geometricProgression(3);
        System.out.println("Fibonacci Progression with start values 4 and 6: ");
        fiboncciProgression(4, 6);
    }
    
    private static void arithmeticProgressionDefault(int v){
        
        for (int i = 0; i < v; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
    
    private static void arithmeticProgressionIncrement(int icmt){
        for (int i = 0; i < 10; i++) {
            System.out.print( icmt * i + " ");
        }
        System.out.println("");
    }
    
    private static void geometricProgression(int base){
        int v = 1;
        
        for (int i = 0; i < 10; i++) {
            System.out.print((v *= base) + " ");            
        }
        System.out.println("");
    }
    
    private static void fiboncciProgression(int x, int y){
        
        int a = x;
        int b = y;
        int c = 0;
        System.out.print(a + " " + b + " ");
            
        for (int i = 0; i < 10; i++) {
            
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
        System.out.println("");
        
    }
    
    
}
