public class Aula13 {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        Lobo l = new Lobo();
        Mamifero m = new Mamifero();

        l.emitirSom();
        System.out.println("--------------------------------");
        c.emitirSom();
        System.out.println("--------------------------------");
        m.emitirSom();

        System.out.println("--------------------------------");
        c.reagir("Olá!");
        c.reagir("Vai Apanhar");
        System.out.println("--------------------------------");
        c.reagir(11,45);
        c.reagir(21,18);
        System.out.println("--------------------------------");
        c.reagir(true);
        c.reagir(false);
        System.out.println("--------------------------------");
        c.reagir(2,12.5f);
        c.reagir(17, 4.5f);
        System.out.println("--------------------------------");
        c.reagir(15,45);
        System.out.println("ultimo inserido horass");
    }
}