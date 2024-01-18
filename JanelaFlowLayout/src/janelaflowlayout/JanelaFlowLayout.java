package janelaflowlayout;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JanelaFlowLayout extends JFrame{

    JButton botao = new JButton("Vídeo aula");
    JButton botao2 = new JButton("Teste");
    
    public JanelaFlowLayout(){
        
        //setLayout(new FlowLayout());// instancia normal
        
        // instancia com uma constante alinha tudo a direita
        setLayout(new FlowLayout(FlowLayout.RIGHT)); 
        add(botao);
        add(botao2);
        
        setTitle("Janela Flow Layout");
        setSize(700,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        
    }
    
    public static void main(String[] args) {
        
        JanelaFlowLayout jfl = new JanelaFlowLayout();

    }
}
