package aula05exemplopratico;

public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //Métodos Personalizados
    public void estadoAtual(){
        System.out.println("==================================");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: R$ " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        
        if(t.equals("CC")){
            this.setSaldo(50);
        
        }else if(t.equals("CP")){
            this.setSaldo(150);
        }
        System.out.println("Conta Aberta com sucesso!");
    }
    
    public void fecharConta(){
        if(this.getSaldo()>0){
            System.out.println("A conta não pode ser fechada porque ainda tem dinheiro.");
        
        }else if(this.getSaldo() < 0){
            System.out.println("A conta não pode ser fechada porque tem débito.");
        
        }else{
            this.setStatus(false);
        }
    }
    
    public void depositar(float v){
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta de " + this.getDono());
        } else {
            System.out.println("Impossível depositar em uma conta fechada.");
        }
    }
    
    public void pagarMensal(){
        int v = 0;
        if(this.getTipo().equals("CC")){
            v = 12;
        
        }else if(this.getTipo()=="CP"){
            v = 20;
        }
        if(this.getStatus()){
            this.setSaldo(this.getSaldo()-v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        }else{
            System.out.println("Impossível depositar em uma conta fechada.");
        }
    }
    
    //Método Construtor
    public ContaBanco(){
        this.saldo = 0;
        this.status = false;
    }
    //Métodos Acessores

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
