public class Aula12 {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        Cachorro c = new Cachorro();
        Canguru k = new Canguru();

        // a.emitirSom();
        m.setPeso(84.4f);
        m.setIdade(2);
        m.setMembros(4);
        m.locomover();
        m.emitirSom();
        m.alimentar();
        System.out.println("------------------------------------");
        k.setIdade(3);
        k.setPeso(55.3f);
        k.setMembros(4);
        k.locomover();
        k.alimentar();
        k.emitirSom();
        k.usarBolsa();
    }
}