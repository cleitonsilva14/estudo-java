package tratamentodeexcecaofinally;

public class TratamentoDeExcecaoFinally {

    public static void main(String[] args) {
        
        // aula 49
        /*
        try{
          // bloco que é monitorado para erros  
        }catch(){
          // tratamento de erro 1
        }catch(){
          // tratamento do erro 2  
        }
        finally{
           // executado após o try ou cath
        }
        
        -> abrir arquivo
        -> realiza leitura
        -> ocorre erro
        -> fecha arquivo no finally 
        
        */
     
        int[] numeros = {4,8,16,32,64,128};
        int[] denom = {2,0,4,8,0};
        
        for (int i = 0; i < numeros.length; i++) {
            try{
                System.out.println(numeros[i] + "/" + denom[i] + 
                " = " + (numeros[i]/denom[i]));
            
            }catch(ArithmeticException e){
                System.out.println("Ocorreu um erro: " + e);
                System.exit(0);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Posição do Array inválida");
                System.exit(0);
            }
            finally{
                System.out.println("Essa linha é impressa sempre após o try e o catch");
            }
        }
        /* System.exit(0)
           Ao terminar a execução do programa dentro do try ou catch,
           o finally NÃO é executado.
        */
        
    }
}
