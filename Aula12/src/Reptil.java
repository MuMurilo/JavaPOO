public class Reptil extends Animal {

    protected String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Réptil");
    }

    @Override
    public void alimentar() {
        System.out.println("Insetos");
    }
}
