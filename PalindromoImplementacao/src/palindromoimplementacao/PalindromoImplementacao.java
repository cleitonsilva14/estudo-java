
package palindromoimplementacao;

public class PalindromoImplementacao {

    public static void main(String[] args) {
        
        String palavra = "reviver";
        String p = palavra.replace(" ", "");
        int e = 0;
        int d = p.length() - 1;
        boolean palindromo = true;
        while(e <= d){
            if (p.charAt(e) != p.charAt(d)) {
                palindromo = false;
            }
            e++;
            d--;
        }
        if (palindromo) {
            System.out.printf("A palavra %s é um palíndromo!%n", palavra);
        } else {
            System.out.printf("A palavra %s não é um palíndromo!%n", palavra);
        }
        
    }
}
