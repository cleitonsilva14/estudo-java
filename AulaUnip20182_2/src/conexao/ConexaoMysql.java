package conexao;

import java.sql.Connection;     //Classe responsável pelo tratamento do objeto conexão.
import java.sql.DriverManager;  //Classe responsável por gerenciar o driver de conexão ao sgbd.
import java.sql.SQLException;   //Classe responsável por tratar exceção do mysql
import java.sql.ResultSet;      //Classe responsavel por receber objetos de reseultado do sgbd
import java.sql.Statement;      //Classe responsavel por enviar objetos do sgbd.
import javax.swing.JOptionPane;
public class ConexaoMysql {

    //private boolean status = false;
    //private Connection con = null;
    //private ResultSet resultset;
    //private Statement statment;
    //private String mensagem = " ";
    
    private String local;
    private String usuario;
    private String senha;
    private Connection c;
    private ResultSet resultset;
    private Statement statment;
    private String strConexao;
    private String driverjdbc;

    public ConexaoMysql() {
    }

    public ConexaoMysql(String tipoSgbd, String local, String porta, String banco, String usuario, String senha) {
        if (tipoSgbd.equals("PostgreSql")) {
            setStrConexao("jdbc:postgresql://" + local + ":" + porta + "/" + banco);
            setLocal(local);
            setUsuario(usuario);
            setSenha(senha);
            setDriverjdbc("org.postgresql.Driver");
            
        } else if (tipoSgbd.equals("Mysql")) {
            setStrConexao("jdbc:mysql://" + local + ":" + porta + "/" + banco); 
            setLocal(local);
            setUsuario(usuario);
            setSenha(senha);
            setDriverjdbc("com.mysql.jdbc.Driver");
            
        } else {
            JOptionPane.showMessageDialog(null, "Envie o parâmetro correto por favor");
        }

        this.local = local;
        this.usuario = usuario;
        this.senha = senha;
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

    public ResultSet getResultset() {
        return resultset;
    }

    public void setResultset(ResultSet resultset) {
        this.resultset = resultset;
    }

    public Statement getStatment() {
        return statment;
    }

    public void setStatment(Statement statment) {
        this.statment = statment;
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

    public void setDriverjdbc(String diverjdbc) {
        this.driverjdbc = diverjdbc;
    }
    
    public void conectar(){
        try{
            Class.forName(getDriverjdbc());
            setC(DriverManager.getConnection(getStrConexao(),getUsuario(),getSenha()));
            setStatment(getC().createStatement());
        }catch(Exception e){
            System.err.println(e);
            e.printStackTrace();
        }
    }
    
    public void desconectar(){
        try{
            getC().close();
        }catch(Exception e){
            System.err.println();
            e.printStackTrace();
        }
    }
    
    
    public int queryDelete(String sql){
        int qtdRegistrosAfetados = 0;
        try {
            this.setStatment(getC().createStatement());
            qtdRegistrosAfetados = getStatment().executeUpdate(sql);
            
        } catch (Exception e) {
            e.printStackTrace();
            return qtdRegistrosAfetados;
            
        }
        return qtdRegistrosAfetados;
            
    }
    
    public int queryIncluir(String sql,String sqlUltimo){
        int sqlUltimoId = 0;
        try{
            this.setStatment(getC().createStatement());
            this.getStatment().executeUpdate(sql);
            this.setResultset(this.getStatment().executeQuery(sqlUltimo));
            //this.resultset.first();
            while(this.resultset.next()){
                sqlUltimoId = this.resultset.getInt(1);
            }

            //return status;
            
        }catch(Exception e){
            e.printStackTrace();
            
        }finally{
            return sqlUltimoId;
        }
    }
    
    
}
