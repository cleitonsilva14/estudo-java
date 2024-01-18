package corescomjanela;

import java.awt.Color;
import javax.swing.JFrame;

public class Janela extends JFrame {
    

    public Janela(String corFrame) {
        Color c = Color.decode(corFrame);
        hexToRGB(corFrame);
        this.setTitle("Cor");
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
        //this.getContentPane().setBackground(new Color(00, 30, 156));
        this.getContentPane().setBackground(new Color(c.getRed(),c.getGreen(), c.getBlue()));
        System.out.printf("Cor em RGB: %d %d %d%n", c.getRed(), c.getGreen(), c.getBlue());
        //R: 26 G: 188 B: 156
    }
    
    private void hexToRGB(String color){
        
        String dgt[] = new String[3];
        // # 00 00 00 
        /*
        if (color.startsWith("#")) {
            
            dgt[0] = color.substring(1, 3);
            dgt[1] = color.substring(3, 5);
            dgt[2] = color.substring(5, 7);
            
        }else{
        */  
        
        dgt[0] = color.substring(0,2);
        dgt[1] = color.substring(2, 4);
        dgt[2] = color.substring(4, 6);
        
        for(String d : dgt){
            System.out.printf("%s",d);
        }
        System.out.println("");
    }
    
}
