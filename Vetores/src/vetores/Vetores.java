package vetores;
public class Vetores {
    
    static int len(String []l){
        int t;
        t = l.length;
        return t;
    }
    
    public static void main(String[] args) {

        String []linguagens = {"Assembly",
            "C","C++","C#","Python","PHP",
            "Java","Ruby","Visual Basic"};
        
        int t = len(linguagens);
        System.out.println("Tamanho do vetor: " + t);
        
        
        
        System.out.println(!!true^!false); //v  //v
        System.out.println(true && false ? 1 : 0);
        
    }
}
