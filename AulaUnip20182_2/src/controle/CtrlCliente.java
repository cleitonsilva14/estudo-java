package controle;
import dao.DaoCliente;
import modelo.ModeloCliente;

public class CtrlCliente {
    
    public int incluirCtrl(ModeloCliente cliente){
        
        return new DaoCliente().incluirDao(cliente);
        
    }
    
    public int excluirCtrl(int codigo){
        return new DaoCliente().excluirDao(codigo);
    }
}
