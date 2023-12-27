package pacote01;

public class Sentimento {

        String tipo;
        String intensidade;
        String motivo;
        boolean ativo;

        void status(){
            System.out.println("Tipo do Sentimento: "+this.tipo);
            System.out.println("Qual é a Intenside? "+this.intensidade);
            System.out.println("Por qual Motivo? "+this.motivo);
            System.out.println("Está sentido isso Agora?"+this.ativo);
        }

        void sentir(){
            this.ativo = true;
        }

        void naoSentir(){
            this.ativo = false;
        }
    }

