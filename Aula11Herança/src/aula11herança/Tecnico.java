package aula11herança;
public class Tecnico extends Aluno{
    
    private int registroProfissional;

    public void praticar(){
        System.out.println("O aluno técnico " + this.nome + " está exercendo sua atividade.");
    }

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
    
}
