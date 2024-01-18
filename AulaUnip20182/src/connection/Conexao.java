package connection;

import java.sql.Connection;    //Classe responsável pelo tratamento do objeto conexão
import java.sql.DriverManager; //Classe responsável por gerenciar o driver de conexão ao SGBD
import java.sql.ResultSet;     //Classe responsável por receber objetos de resultado do SGBD
import java.sql.Statement;     //Classe responsável por enviar objetos para SGBD
import java.sql.SQLException;  //Classe responsável por tratamento de exceção no SQL
import javax.swing.JOptionPane;

public class Conexao {

    private String local;
    private String usuario;
    private String senha;
    private Connection c;
    private Statement statement;
    private ResultSet resultSet;
    private String strConexao;
    private String driverjdbc;

    public Conexao() {
    }

    public Conexao(String tipoSgbd, String local, String porta, String banco, String usuario, String senha) {
        if (tipoSgbd.equals("PostgreSql")) {
            setStrConexao("jdbc:postgresql://" + local + ":" + porta + "/" + banco);
            setLocal(local);
            setUsuario(usuario);
            setSenha(senha);
            setDriverjdbc("org.postgresql.Driver");
            
        } else if (tipoSgbd.equals("MySql")) {
            setStrConexao("jdbc:mysql://" + local + ":" + porta + "/" + banco);
            setLocal(local);
            setUsuario(usuario);
            setSenha(senha);
            setDriverjdbc("com.mysql.jdbc.Driver");
        } else {
            JOptionPane.showMessageDialog(null, "Caro(a) usuário(a) envie o parâmetro correto para a conexão ao SGBD!");
            
        }
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Connection getC() {
        return c;
    }

    public void setC(Connection c) {
        this.c = c;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public ResultSet getResultSet() {
        return resultSet;
    }

    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }

    public String getStrConexao() {
        return strConexao;
    }

    public void setStrConexao(String strConexao) {
        this.strConexao = strConexao;
    }

    public String getDriverjdbc() {
        return driverjdbc;
    }

    public void setDriverjdbc(String driverjdbc) {
        this.driverjdbc = driverjdbc;
    }

    public void conectar(){
        try{
            Class.forName(getDriverjdbc());
            setC(DriverManager.getConnection(getStrConexao(), getUsuario(), getSenha()));
            setStatement(getC().createStatement());
            
        } catch (Exception e){
            System.err.println(e);
            e.printStackTrace();
            
        }
    }
    
    public void desconectar(){
        try {
            getC().close();
            
        } catch (Exception e) {
            System.err.println(e);
            e.printStackTrace();
            
        }
    }
    
}
