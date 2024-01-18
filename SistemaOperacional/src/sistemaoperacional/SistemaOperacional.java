package sistemaoperacional;


public class SistemaOperacional {

    public static void main(String[] args) {

        System.out.println(System.getProperty("os.name"));

        String so = System.getProperty("os.name"); // sitema operacional 
        
        System.out.println(so);
        
        // outras propriedades
        System.out.println(System.getProperty("os.version"));
        System.out.println(System.getProperty("os.arch"));
        System.out.println(System.getProperty("file.separator"));
        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("user.name"));
        //System.out.println(System.getProperties()); // pega todas as propriedades
        
    }
}
