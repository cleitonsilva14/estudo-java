package teste;

import connection.Conexao;

public class TesteConexao {

    public static void main(String[] args) {
        
        //Conexao c = new Conexao("MySql", "localhost", "3306", "AulaUnip20182", "root", "@nne&P&dro0413");
        Conexao c = new Conexao("PostgreSql", "localhost", "5432", "AulaUnip20182", "postgres", "@nne&P&dro0413");
        c.conectar();
        c.desconectar();
        
    }
    
}
