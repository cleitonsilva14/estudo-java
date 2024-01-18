package aula11herança;
public class Aluno extends Pessoa{
    
    /* Essa é uma Herança para Diferença.
     * A Classe Aluno herda da classe Astrata Pessoa,
     * tem tudo que ela tem.
     * Mas ocorre uma especialização.
     */
    
    private int matricula;
    private String curso;
    
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade do aluno " + this.nome);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
