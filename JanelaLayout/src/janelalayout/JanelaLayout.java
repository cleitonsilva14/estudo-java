package janelalayout;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JanelaLayout extends JFrame{

    JButton botao = new JButton("Teste");
    JButton botao2 = new JButton("Teste 2");
    JButton botao3 = new JButton("Teste 3");
    
    public JanelaLayout() {
        
        setLayout(new BorderLayout()); //opcional
        add(BorderLayout.NORTH,botao); //adiciona o botao na posicao norte
        add(BorderLayout.EAST,botao2);
        add(BorderLayout.CENTER,botao3);
        
        setTitle("Janela Layout");
        setSize(700,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    
    
    public static void main(String[] args) {
        
        JanelaLayout jl = new JanelaLayout();

    }
}
