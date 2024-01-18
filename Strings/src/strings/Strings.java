package strings;

public class Strings {

    public static void main(String[] args) {
        
        long tStart = System.currentTimeMillis();
        String c = "a";
        for (int i = 0; i < 10000; i++) {
            c+="a";
        }
        long tEnd = System.currentTimeMillis();
        
        System.out.println(tEnd - tStart + "ms");
        StringBuilder strB = new StringBuilder();
        long tIn = System.currentTimeMillis();
        String v = "c";
        for (int i = 0; i < 10000; i++) {
            strB.append("c");
        }
        long tF = System.currentTimeMillis();
        System.out.println(tF - tIn + "ms");
        
    }
}
