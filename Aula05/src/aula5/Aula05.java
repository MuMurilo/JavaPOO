package aula5;

public class Aula05 {
    public static void main(String[] args) {
        Conta c1= new Conta();
        c1.abrirConta("CP");
        c1.setDono("Murilo Santos");
        c1.setNumConta("153.15");
        c1.depositar(15f);
        c1.pagarMensalidade();
        c1.dadosConta();
        System.out.println("");

        Conta c2= new Conta();
        c2.abrirConta("CC");
        c2.setDono("Flavia nunes");
        c2.setNumConta("551.3213.23");
        c2.depositar(36);
        c2.pagarMensalidade();
        c2.dadosConta();
        System.out.println("");
        c2.sacar(12);
        c2.dadosConta();

    }
}