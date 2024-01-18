package tratamentodeexecaopropria;

public class TratamentoDeExecaoPropria {
    public static void main(String[] args){

        // aula 52
        int[] numeros = {4,8,5,16,32,21,64,128};
        int[] denom = {2,0,4,8,0,2,4};
        
        for (int i = 0; i < numeros.length; i++) {
            try{
                if (numeros[i] % 2 != 0) {
                    //lançar exception aqui
                    throw new Exception("Número impar,divisão não exata");
                    
                }
                System.out.println(numeros[i] + "/" + denom[i] + 
                " = " + (numeros[i]/denom[i]));
            
            }catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
                System.out.println("Ocorreu um erro: " + e);
            
            }catch(Exception e){
                System.out.println("Aconteceu um erro");
                System.out.println(e.getMessage());
            }
            
        }
    }
}
