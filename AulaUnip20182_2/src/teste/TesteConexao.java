
package teste;
import conexao.ConexaoMysql;

public class TesteConexao {
    
    public static void main(String[] args) {
        //ConexaoMysql(String tipoSgbd, String local, String porta, String banco, String usuario, String senha)
        ConexaoMysql c = new ConexaoMysql("Mysql","localhost","3306","aulaunip20182","root","root");
        c.conectar();
        c.desconectar();
        
    }
}
