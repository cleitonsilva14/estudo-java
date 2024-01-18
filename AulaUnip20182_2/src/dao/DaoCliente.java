package dao;
import conexao.ConexaoMysql;
import modelo.ModeloCliente;

public class DaoCliente {
    
    public int incluirDao(ModeloCliente cliente){
        ConexaoMysql c = new ConexaoMysql("MySql", "localhost", "3306", "AulaUnip20182", "root", "root");
        
        try{
            c.conectar();
            String sql = "INSERT INTO cliente (nome) VALUES ('" + cliente.getNome() + "');";
            
            String sqlUltimo = "SELECT MAX(c.codigo) AS ultimoId FROM Cliente;";
            return c.queryIncluir(sql,sqlUltimo);
            
            
        }catch(Exception e){
        
            e.printStackTrace();
        }
        finally{
            c.desconectar();
        }
        return 0;
    }
    

    public int excluirDao(int codigo){

        int qtdRegistrosAfetados = 0;
        
        ConexaoMysql c = new ConexaoMysql("MySql", "localhost", "3306", "AulaUnip20182", "root", "root");
        try{
            c.conectar();
            String sql = "DELETE FROM cliente WHERE codigo = '" + codigo +"';";
            qtdRegistrosAfetados = c.queryDelete(sql);
            return  qtdRegistrosAfetados;
        }catch(Exception e){
            e.printStackTrace();
            return qtdRegistrosAfetados;
        
        }finally{
            c.desconectar();
        }
    }
}
