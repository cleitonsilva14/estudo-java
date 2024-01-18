package janelagridlayout;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JanelaGridLayout extends JFrame{
    //Aula 47
    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    JButton b4 = new JButton("4");
    JButton b5 = new JButton("5");
    JButton b6 = new JButton("6");
    
    
    public JanelaGridLayout(){
        
        
        setLayout(new GridLayout(3,2)); // numero de linha e colunas
        
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        
        setTitle("Grid Layout");
        setSize(700,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        
        JanelaGridLayout jgl = new JanelaGridLayout();

    }
}
