
package palindromo;

public class Palindromo {

    public static void main(String[] args) {
        
        String normal = "arara";
        String contrario = new StringBuffer(normal).reverse().toString();
        
        if (normal.equals(contrario)) {
            System.out.println("É um palíndromo!");
        }else{
            System.out.println("Não é um palíndromo");
        }

    }
}
