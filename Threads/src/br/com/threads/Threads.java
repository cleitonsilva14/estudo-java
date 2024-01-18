package br.com.threads;

public class Threads extends Thread{

    public static void main(String[] args) {

        int v[] = new int[10];
        int j[] = {2,3,5,4,9,7,8,9,2,0,-63};
        
        for(int n : j){
            System.out.println(n);
            dormir();
        }
      
        
    }
    
    //método para cochilar
    private static void dormir(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println("Erro " + ex.getMessage());
        }
    }
    
}
