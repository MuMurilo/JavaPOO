public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Pessoa p1 = new Pessoa();
        Visitante v1 = new Visitante();
        Aluno a1 = new  Aluno();
        Bolsista b1 = new Bolsista();

        a1.setNome("Murilo");
        a1.setIdade(32);
        a1.setSexo("Masculino");

        b1.setNome("Lionel");
        b1.setMatricula("235689");
        b1.renovarBolsa();
        b1.pagarMensalidade();

        a1.pagarMensalidade();
        b1.renovarBolsa();
        System.out.println(a1.toString());
        System.out.println(b1.toString());

    }
}