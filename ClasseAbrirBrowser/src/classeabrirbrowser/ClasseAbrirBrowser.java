package classeabrirbrowser;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class ClasseAbrirBrowser {

    public static void main(String[] args){
        
        try {
            URI u = new URI("www.google.com");
            Desktop d = Desktop.getDesktop();
            d.browse(u);
        } catch (URISyntaxException | IOException ex) {
            ex.printStackTrace();
        }
    }
}
