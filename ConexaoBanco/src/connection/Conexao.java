package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import javax.swing.JOptionPane;

public class Conexao {
    
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/times";
    private static final String USER = "root";
    private static final String PASS = "";
    
    public static Connection getConnection(){
        try {
            Class.forName(DRIVER);
            JOptionPane.showMessageDialog(null, "Conectado ao Banco de Dados");
            return DriverManager.getConnection(URL,USER,PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro " + ex, "Aviso",JOptionPane.ERROR_MESSAGE);
            //throw new RuntimeException();
            return null;
        }
    }
    
    public static void closeConnection(Connection c){
        try{
            if (c!=null) {
                c.close();
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Erro " + ex,"Aviso",JOptionPane.ERROR_MESSAGE);
            //System.err.println("Erro: " + ex.getMessage());
        }
    }
    
    public static void closeConnection(Connection c,PreparedStatement stmt){
        try{
            if (stmt != null) {
                stmt.close();
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro" + ex,"Aviso" , JOptionPane.ERROR_MESSAGE);
        }
        closeConnection(c);
    }
    
    public static void closeConnection(Connection c,PreparedStatement stmt,ResultSet rs){
        
        try{
            if(rs != null){
                rs.close();
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro " + ex, "Aviso", JOptionPane.ERROR_MESSAGE);
        }
        
        closeConnection(c,stmt);
    }
}
