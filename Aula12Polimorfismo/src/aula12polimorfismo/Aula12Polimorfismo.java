package aula12polimorfismo;
public class Aula12Polimorfismo {
    public static void main(String[] args) {
        
        /* Animal n = new Animal();
         * A classe Animal não pode ser instânciada
         * porque é uma classe abstrata.
         */
        
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish g  = new GoldFish();
        Arara e = new Arara();
        
        c.locomover();
        k.locomover();
        c.emitirSom();
        k.emitirSom();
        
        //m.setPeso(35.2f);
        //m.setCorPelo("Marrom");
        //m.alimentar();
        //m.locomover();
        //m.emitirSom();
        
        //a.locomover();
        //p.locomover();
        //r.locomover();
    }
    
}
