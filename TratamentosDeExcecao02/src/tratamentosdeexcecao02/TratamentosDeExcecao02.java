package tratamentosdeexcecao02;

public class TratamentosDeExcecao02 {

    public static void main(String[] args) {
        
    /*
        try{
            //bloco que é monitorado para erros
        }catch(TipoDaException exception){
            //tratamento do erro
        }
    */
    
    /* Não tratar erros fazem a execução do programa terminar
     * Tratar erros:
     * Permitem que o programa execute uma determinada lógica
     * caso o erro ocorra.
     * Permiterm que o programa continue a execução.
     */
        
    try{
        int[] vetor = new int[10];
        System.out.println("Antes da Exception");
        vetor[10] = 1;
        System.out.println("Esse texto não será impresso");
    
    }catch(ArrayIndexOutOfBoundsException exception){
        System.out.println("Exceção ao acessar um índice do vetor que não existe");
    }
    
    System.out.println("Esse texto será impresso após a exception");
        
    }
}
