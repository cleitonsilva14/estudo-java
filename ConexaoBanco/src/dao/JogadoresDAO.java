package dao;
import connection.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import model.Jogadores;

public class JogadoresDAO {


    public void create(Jogadores j){
        Connection c = Conexao.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = c.prepareStatement("INSERT INTO jogadores(nome,numero) VALUES (?,?);");
            stmt.setString(1, j.getNome());
            stmt.setInt(2, j.getNumero());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar");
        }
        
        
        Conexao.closeConnection(c,stmt);
        
    }
    
}
