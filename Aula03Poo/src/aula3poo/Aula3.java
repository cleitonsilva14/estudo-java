package aula3poo;
public class Aula3 {

    public static void main(String[] args) {
        
        Caneta c1 = new Caneta();
        c1.modelo = "Bic";
        c1.cor = "Azul";
        c1.carga = 80;
        c1.tampar();
        c1.status();
        c1.rabiscar();
    }
    
}
