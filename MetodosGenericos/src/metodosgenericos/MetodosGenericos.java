
package metodosgenericos;

public class MetodosGenericos {

    public static void main(String[] args) {

        String []s = new String[]{"Abacate","Banana","Caju"};
        Integer []i = new Integer[]{1,2,3,4};
        Boolean []b = new Boolean[]{true,true,false};
        Character []c = new Character[]{'J','A','V','A'};
        Double []d = new Double[]{1.5,22.32,95.21};
        
        
        printArray(s);
        printArray(i);
        printArray(b);
        printArray(c);
        
        print(d);
        print(c);
    }

    public static <T> void printArray(T[] vetor){
        
        for (T s : vetor) {
            System.out.print(s + " ");
        }
        System.out.println("");
    }
    
    public static void print(Object[] vt){
        
        for (Object vt1 : vt) {
            System.out.print(vt1 + ",");
        }
        System.out.println("");
        
    }
    
}
