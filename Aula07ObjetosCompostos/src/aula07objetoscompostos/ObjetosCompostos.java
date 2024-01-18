package aula07objetoscompostos;

public class ObjetosCompostos {

    public static void main(String[] args) {
        
        Lutador l[] = new Lutador[5];
        l[0] = new Lutador("Putscript","Brasil",29,1.68f,57.8f,14,2,3);
        l[1] = new Lutador("PeBasic","EUA",31,1.71f,57.8f,2,3,1);
        
        System.out.println("Nome: " + l[0].getNome());
        System.out.println("Nacionalidade: " +  l[0].getNacionalidade());
        System.out.println("Categoria: " + l[0].getCategoria());
        System.out.println("-------------------------------------------");
        System.out.println("Nome: " + l[1].getNome());
        System.out.println("Nacionalidade: " + l[1].getNacionalidade());
        System.out.println("Categoria: " + l[1].getCategoria());

    }
    
}
