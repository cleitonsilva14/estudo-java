
package teste;

import connection.Conexao;

public class Teste {
 
    public static void main(String[] args) {
        
        Conexao con = new Conexao("MySql", "localhost", "3306", "bank", "root", "");
        con.conectar();
        
        
    }
    
}
