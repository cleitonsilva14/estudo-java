package janelaacoes;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JanelaAcoes extends JFrame implements ActionListener{

    JButton jb = new JButton("Mensagem");
    JButton jb2 = new JButton("Sair");
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == jb) {
            JOptionPane.showMessageDialog(null,"Aula ActionListener");
        }
        if (e.getSource() == jb2) {
            System.exit(0);
        }
    }
    
    public JanelaAcoes(){
        
        jb.addActionListener(this);
        jb2.addActionListener(this);
        
        setLayout(null);
        jb.setBounds(300,200,100,60);
        add(jb);
        jb2.setBounds(400,200,100,60);
        add(jb2);
        
        //Configurações para tela
        setTitle("Título da Janela");
        setSize(700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        
    }
    
    public static void main(String[] args) {
        
        JanelaAcoes j = new JanelaAcoes();
        

    }

}
