package imprimir;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class Imprimir {

    public static void main(String[] args) {
        
        String file = "C:\\Users\\CLEITON\\Desktop\\Arquivo.txt";
        //String file = "C:\\Users\\CLEITON\\Desktop\\Pim - HelpDesk.pdf";
        impressao(file);
        
    }
    
    public static void impressao(String caminhoFile){
        
        Desktop dktp = Desktop.getDesktop();
        
        try{
            File arquivoParaImprimir = new File(caminhoFile);
            dktp.print(arquivoParaImprimir);
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    
}
