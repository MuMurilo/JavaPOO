package pacote01;

public class Aula02 {
    public static void main(String[] args) {

      Caneta c1  = new Caneta();
      c1.cor = "Azul";
      c1.ponta = 0.5f;
      c1.tampada = false;
      c1.tampar();
      c1.status();
      c1.rabiscar();

        Caneta c2 = new Caneta();
        c2.modelo = "Compactor";
        c2.cor = "Preto";
        c2.ponta = 0.7f;
        c2.carga = 90;
        c2.tampada = true;

        c2.status();
        c2.rabiscar();

        Sentimento s1 = new Sentimento();
        s1.tipo = "Amor";
        s1.intensidade = "Forte";
        s1.motivo = "Porque ela é 10/10";
        s1.ativo = false;
        s1.sentir();
        s1.status();
    }
}
