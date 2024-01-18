package instancias;

public class Instancias {

    public static void main(String[] args) {
        
        Integer i = 125;
        Float f = 14.5f;
        Boolean b = true;
        
        if (i instanceof Integer) {
            System.out.println("Variável do tipo Int");
        }
        if (f instanceof Float) {
            System.out.println("Variável do tipo Float");
        }
        if (b instanceof Boolean) {
            System.out.println("Variável do tipo Boolean");
        }
        
        // Outra coisa
        StringBuilder str = new StringBuilder();
        String p = "oi ";
        p += str.append("Java").toString();
        System.out.println(p);
        
    }
}
