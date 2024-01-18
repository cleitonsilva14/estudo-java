package aula05exemplopratico;

public class ExemploPratico {

    public static void main(String[] args) {
         
        ContaBanco conta = new ContaBanco();
        
        
        conta.abrirConta("CC");
        conta.setNumConta(895);
        conta.setDono("Arnaldo");
        conta.depositar(18000f);
        conta.estadoAtual();
    }
    
}
