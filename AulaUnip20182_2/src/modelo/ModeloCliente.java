package modelo;
public class ModeloCliente {
    
   private int codigo;
   private String nome;

    public ModeloCliente() { 
    }

    public ModeloCliente(int codigo, String nome) {
        //this.codigo = codigo;
        this.setCodigo(codigo);
        //this.nome = nome;
        this.setNome(nome);
    }
   

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
   
}
