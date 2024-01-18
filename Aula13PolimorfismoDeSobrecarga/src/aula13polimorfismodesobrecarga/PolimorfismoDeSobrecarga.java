package aula13polimorfismodesobrecarga;
public class PolimorfismoDeSobrecarga {

    public static void main(String[] args) {
        //Programa Principal
        Cachorro c = new Cachorro();
        
        c.reagir("Olá");                // abanar e latir
        c.reagir("Vai apanhar");        // rosnar
        c.reagir(11, 45);               // abanar
        c.reagir(19, 00);               //ignorar  
        c.reagir(true);                 //abanar
        c.reagir(false);                //rosnar e latir
        c.reagir(2, 12.5f);             // latir
        c.reagir(17, 4.5f);             //rosnar
    }
}
