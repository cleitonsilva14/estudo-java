package model;

public class Cliente {

    private int codigo;
    private String nome;

    public Cliente() {
    }

    public Cliente(int codigo, String nome) {
        setCodigo(codigo);
        setNome(nome);
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
