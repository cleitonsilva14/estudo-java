
package tratamentodeexcecaomultiploscatch;

public class TratamentoDeExcecaoMultiplosCatch {

    public static void main(String[] args) {
        
        /* 
            try{
                //bloco que é monitorado para erros
            }catch(TipoDaException1 exception){
                //tratamento do erro 1
            }catch(TipoDaException2 exception){
                //tratamento do erro 2
            }
        */
            
        int[] numeros = {4,8,16,32,64,128};
        int[] denom = {2,0,4,8,0};
        
        
        for (int i = 0; i < numeros.length; i++) {
            try{
                System.out.println(numeros[i] + "/" + denom[i] + 
                " = " + (numeros[i]/denom[i]));
            
            }catch(ArithmeticException e1){
                System.out.println("Erro ao dividir por 0.");
            
            }catch(ArrayIndexOutOfBoundsException e2){
                System.out.println("Posição do Array inválida.");
            }
        }
    }
}
