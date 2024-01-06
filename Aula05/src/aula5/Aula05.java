package aula5;

public class Aula05 {
    public static void main(String[] args) {
        Conta c1= new Conta(0f,false);
        c1.abrirConta("CP");
        c1.setDono("Murilo Santos");
        c1.setNumConta("153.15");
        c1.depositar(15f);
        c1.dadosConta();

    }
}