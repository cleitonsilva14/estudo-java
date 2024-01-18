package testes;

public class Main {
    
    public static class Matematica{
        
        public double raiz(double value){
            
            return Math.pow(value, 0.5);
        }
        
        public double potencia(double n1,double n2){
            return Math.pow(n2, n1);
        }
        
        public double maiorValor(double ...n){
            
            double maior = 0;
            int cont = 0;
            
            for(double valor:n){
                System.out.println("Cont: " + cont + " --> " + valor + ", ");
                if(cont == 0 || valor > maior){
                    maior = valor;
                }
                cont++;
            }
            System.out.println("Valor do contador: " + cont);
            return maior;
        }
        
        public double menorValor(double ...n){
            
            double menor = 0;
            int cont = 0;
            
            for(double valor:n){
                if (cont == 0 || valor < menor) {
                    menor = valor;
                }
                cont++;
            }
            
            return menor;
        }
    }
        
        

    public static void main(String[] args) {
        
        Matematica m = new Matematica();
        
        System.out.println("Raíz de 25:  " + m.raiz(25));
        System.out.println("Potência de 2 , 2 : " + m.potencia(2, 2));
        System.out.println("Maior valor: " + m.maiorValor(207,11456,3 ,-0.3,32,0.354,2030.1,302145));
        System.out.println("Menor valor: " + m.menorValor(-9853,25,3,5,-325));
        System.out.println("-> " + Math.max(-250.3,3.25));
        
        
    }
}
