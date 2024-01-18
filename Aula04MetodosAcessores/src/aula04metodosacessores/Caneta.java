package aula04metodosacessores;

public class Caneta {
    
    private String modelo;
    private String cor;
    private float ponta;
    private boolean tampada;
    
    public Caneta(String m, String c, float p){
        this.modelo = m;
        this.cor = c;
        this.setPonta(p);
        this.tampar();
                
        
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
    
    public void status(){
        System.out.println("Sobre a Caneta ");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String m){
        this.modelo = m;
    }
    
    public String getCor(){
        return this.cor;
    }
    
    public void setCor(String c){
        this.cor = c;
    }
    
    public float getPonta(){
        return this.ponta;
    }
    
    public void setPonta(float p){
        this.ponta = p;
    }
    
    public void setTampada(boolean t){
        this.tampada = t;
    }
    
    public boolean getTampada(){
        return this.tampada;
    }
}
