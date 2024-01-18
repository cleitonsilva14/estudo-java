package aula09exerciciopratico;
public class ProjetoLivro {
    public static void main(String[] args) {

        Pessoa p[] = new Pessoa[2];
        Livro l[] = new Livro[3];
        p[0] = new Pessoa("Diego",15,"M");
        p[1] = new Pessoa("Marquinhos",22,"M");
        
        l[0] = new Livro("POO","Gil Silva",250,p[0]);
        l[1] = new Livro("HTML5 e CSS3","Jon",280,p[1]);
        l[0].abrir();
        l[0].folhear(100);
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());
    }
    
}
