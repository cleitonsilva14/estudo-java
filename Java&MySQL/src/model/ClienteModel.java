
package model;

public class ClienteModel {
    
    // Atributos
    private int id_cliente;
    private int idade_cliente;
    private String email_cliente;
    private String nome_cliente;
    private String telefone_cliente;

    // Construtores
    public ClienteModel() {
      
    }

    public ClienteModel(int id_cliente, int idade_cliente, String email_cliente, String nome_cliente, String telefone_cliente) {
        this.id_cliente = id_cliente;
        this.idade_cliente = idade_cliente;
        this.email_cliente = email_cliente;
        this.nome_cliente = nome_cliente;
        this.telefone_cliente = telefone_cliente;
    }
      
    // Gettters e Setters
    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getIdade_cliente() {
        return idade_cliente;
    }

    public void setIdade_cliente(int idade_cliente) {
        this.idade_cliente = idade_cliente;
    }

    public String getEmail_cliente() {
        return email_cliente;
    }

    public void setEmail_cliente(String email_cliente) {
        this.email_cliente = email_cliente;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public String getTelefone_cliente() {
        return telefone_cliente;
    }

    public void setTelefone_cliente(String telefone_cliente) {
        this.telefone_cliente = telefone_cliente;
    }
    
    
       
}
