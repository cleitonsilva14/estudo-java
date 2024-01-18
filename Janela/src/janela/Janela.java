package janela;

import java.awt.Color;
import javax.swing.JFrame;

public class Janela extends JFrame{

    
    public Janela(){
        
        setTitle("Título da Janela"); // título
        setSize(500,400); //medidas
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//fechar a janela
        setLocationRelativeTo(null); //abre a janela centralizada 
        setResizable(false); // redimensionamento
        setVisible(true);//aparece a janela
        getContentPane().setBackground(Color.yellow);
    
    }
    
    public static void main(String[] args) {

        Janela w = new Janela();

    }
}
