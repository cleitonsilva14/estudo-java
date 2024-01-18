
package aula04metodosacessores;

public class Aula04 {

    public static void main(String[] args) {
        
        Caneta c1 = new Caneta("Bic","Azul",0.5f);
        System.out.println("Tenho uma caneta " + c1.getModelo()
                            + " " +  c1.getCor());

    }
    
}
