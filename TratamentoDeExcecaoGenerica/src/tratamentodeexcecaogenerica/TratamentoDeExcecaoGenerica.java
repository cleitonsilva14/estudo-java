package tratamentodeexcecaogenerica;

public class TratamentoDeExcecaoGenerica {

    public static void main(String[] args) {
        
        /* Capturando Exception Genérica
         * >> Classe Throwable é a superclasse de 
         * todas as todas as exceções e erros no Java.
         * 
         */
  
        int[] numeros = {4,8,16,32,64,128};
        int[] denom = {2,0,4,8,0};
        
        
        for (int i = 0; i < numeros.length; i++) {
            try{
                System.out.println(numeros[i] + "/" + denom[i] + 
                " = " + (numeros[i]/denom[i]));
            
            }catch(ArithmeticException e1){
                System.out.println("Erro ao dividir por 0.");
            
            }catch(Throwable e){
                System.out.println("Ocorreu um erro.");
            }
        }
    }
}
