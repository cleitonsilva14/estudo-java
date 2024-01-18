package model.dao;

//----> Camada de persistência 

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bean.Categoria;



/**
    CRUD
    Create 
    Read
    Update
    Delete
    @author Cleiton 
*/


public class CategoriaDAO {
    private Connection con = null;

    public CategoriaDAO() {
        con = ConnectionFactory.getConnection();
    }

    public boolean save(Categoria categoria){
        String sql = "INSERT INTO categoria (descricao) VALUES (?)";
        PreparedStatement stmt = null;
        try{
            stmt = con.prepareStatement(sql);
            stmt.setString(1, categoria.getDescricao());
            stmt.executeUpdate();
            return true;

        }catch(SQLException ex){
            System.err.println("Erro: " + ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<Categoria> findAll(){
        
        String sql = "SELECT * FROM categoria";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Categoria> categorias = new ArrayList();//cria a lista
        
        try{
            
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Categoria categoria = new Categoria(); // cria o objeto
                categoria.setDescricao(rs.getString("descricao"));
                categorias.add(categoria);
                
            }
            
            
        }catch(SQLException ex){
            System.err.println("Erro: " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return categorias;
    
    } 
    
}
