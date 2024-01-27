package aula04;

public class Caneta {

    public Caneta(String m,String c,float p) { //Este é o método Construtor
        this.modelo = m;
        this.tampar();
        this.cor = c;
        this.ponta = p;
    }

    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;
    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }

    public void status() {
        System.out.println("SOBRE A CANETA: ");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: "+this.cor);
        System.out.println("No Momento ela está Tampada " + this.tampada);
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }

    
}
