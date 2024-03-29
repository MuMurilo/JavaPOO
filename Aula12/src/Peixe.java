public class Peixe extends Animal{

    protected String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    public void soltarBolha(){
        System.out.println("Soltou uma bolha");
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo susbtâncias");
    }
}
