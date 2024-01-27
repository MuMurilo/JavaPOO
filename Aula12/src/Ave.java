public class Ave extends Animal{

    protected String corPena;

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    public void fazerNinho(){
        System.out.println("Fez Ninho");
    }

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Ave");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Insetos e frutas");
    }
}
