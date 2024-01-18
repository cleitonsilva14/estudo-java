package aula11herança;
public class Aula11Herança {
    public static void main(String[] args) {

        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());
        
        Aluno a1 = new Aluno();
        a1.setNome("Cláudio");
        a1.setMatricula(1111);
        a1.setCurso("Informática");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("Jonas");
        b1.setSexo("M");
        b1.pagarMensalidade();
        
        Tecnico t1 = new Tecnico();
        t1.setNome("Marlos");
        t1.setIdade(21);
        t1.setSexo("M");
        t1.setMatricula(1010);
        t1.setRegistroProfissional(9982);
        t1.setCurso("Redes de Computadores");
        t1.praticar();
        
        Professor p1 = new Professor();
        p1.setNome("Carlão");
        p1.setSexo("M");
        p1.setIdade(35);
        p1.setSalario(2500.00f);
        p1.setEspecialidade("Programação Orientada a Objeto");
        p1.receberAumento(1250.0f);
        
        /* Utilizar a palavra final nas classes quando a classe não
         * for fazer herança.
         * Utilizar a palavra final nos métodos quando não deverão ser
         * sobrepostos.
         */
        
    }
    
}
