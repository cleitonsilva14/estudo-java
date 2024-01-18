package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexao {
    
    private String user; // = "root"; // Usuário do BD
    private String pass; // = "root"; // Senha do BD
    private String url; // = "jdbc:mysql://localhost:3306/dbteste"; // Caminho do BD
    private String driver; // = "com.mysql.jdbc.Driver"; // Driver do BD
    private String local; // localhost
    private Connection con; // Realizar conexão com BD
    private Statement statement; // Realizar pesquisa no BD
    private ResultSet resultset; // Armazena o resultado da pesquisa

    // Construtor
    public Conexao (String tipoSgbd, String local, String porta, String banco, String user, String pass ) {
        
        if (tipoSgbd.equals("PostgreSql")) {
            setUrl("jdbc:postgresql://" + local + ":" + porta + "/" + banco);
            setLocal(local);
            setUser(user);
            setPass(pass);
            setDriver("org.postgresql.Driver");
        } else if (tipoSgbd.equals("MySql")) {
            setUrl("jdbc:mysql://" + local + ":" + porta + "/" + banco);
            setUser(user);
            setPass(pass);
            setDriver("com.mysql.jdbc.Driver");
        } else {
            JOptionPane.showMessageDialog(null, "Parâmetros informados estão incorretos. Verifique!");
        }
    }
        
        //Métodos
        public void conectar () {
            
        try {
            Class.forName(getDriver());
            setCon(DriverManager.getConnection(getUrl(), getUser(), getPass()));
            setStatement(getCon().createStatement());
            JOptionPane.showMessageDialog(null, "Conectado!");
        } catch (ClassNotFoundException | SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Erro ao se concetar ao banco de dados!","Erro",JOptionPane.ERROR_MESSAGE);
            
        }
            
    }
        public void desconectar () {
            
        try {
            getCon().close();
        } catch (SQLException ex) {        
            JOptionPane.showMessageDialog(null, "Não foi possível se desconectar!");         
            }
            
        }
        
        // Getters e Setters
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public ResultSet getResultset() {
        return resultset;
    }

    public void setResultset(ResultSet resultset) {
        this.resultset = resultset;
    }
}
    
