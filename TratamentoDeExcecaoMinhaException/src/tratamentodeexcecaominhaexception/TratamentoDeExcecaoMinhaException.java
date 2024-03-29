package tratamentodeexcecaominhaexception;

public class TratamentoDeExcecaoMinhaException {
    // aula 51
    public static void main(String[] args) {
        
       try{
           teste();
       }catch( DivisaoNaoExata e){
           e.printStackTrace();
       }
    }
    
    public static void teste() throws DivisaoNaoExata{
        int[] numeros = {4,8,5,16,32,21,64,128};
        int[] denom = {2,0,4,8,0,2,4};
        
        for (int i = 0; i < numeros.length; i++) {
            try{
                if (numeros[i] % 2 != 0) {
                    //lançar exception aqui
                    throw new DivisaoNaoExata(numeros[i],denom[i]);
                    
                }
                System.out.println(numeros[i] + "/" + denom[i] + 
                " = " + (numeros[i]/denom[i]));
            
            }catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
                System.out.println("Ocorreu um erro: " + e);
                e.printStackTrace();
            }
        }
    }
}