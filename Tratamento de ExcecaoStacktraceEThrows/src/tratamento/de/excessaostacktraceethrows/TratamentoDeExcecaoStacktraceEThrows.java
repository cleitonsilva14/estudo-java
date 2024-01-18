package tratamento.de.excessaostacktraceethrows;

public class TratamentoDeExcecaoStacktraceEThrows {

    public static void main(String[] args) {
        
        // aula 50
        
        /*
            Classe Throuable
            -> classe mãe de todas as exceptions
            -> Possui métodos úteis
            Método      |   Descrição
            
            getMessage() -> retorna a descrição do erro.        
            printStackTrace() -> imprime o stack trace do erro.
        
        */
        
        
        int[] numeros = {4,8,16,32,64,128};
        int[] denom = {2,0,4,8,0};
        
        /*
            Error: Resulta na finalização do programa.
            Exception: possível tratar o erro e continuar a execução
            do programa.
        */
        
        
        for (int i = 0; i < numeros.length; i++) {
            try{
                System.out.println(numeros[i] + "/" + denom[i] + 
                " = " + (numeros[i]/denom[i]));
            
            }catch(Exception e){
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
        
    }
}
