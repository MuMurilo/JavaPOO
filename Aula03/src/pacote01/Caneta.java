package pacote01;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: "+ this.cor);
        System.out.println("Ponta: "+ this.ponta);
        System.out.println("Carga: "+ this.carga+"%.");
        System.out.println("Está Tampada? "+ this.tampada);
    }

    public void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERRO! Não Posso rabiscar");
        } else{
            System.out.println("Pronta para Rabiscar");
        }

    }
    private void tampar(){
        this.tampada = true;
    }
    private void destampar(){
        this.tampada = false;
    }


}
