import java.util.Locale;
import java.util.Scanner;

public class ExeCinco {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        int codPecaUm;
        int qtdPecaUm;
        double valorPecaUm;
        int codPecaDois;
        int qtdPecaDois;
        double valorPecaDois;
        double total;

        codPecaUm = sc.nextInt();
        qtdPecaUm = sc.nextInt();
        valorPecaUm = sc.nextDouble();
        sc.nextLine();
        codPecaDois = sc.nextInt();
        qtdPecaDois = sc.nextInt();
        valorPecaDois = sc.nextDouble();
        
        total = ((qtdPecaUm * valorPecaUm)+ (qtdPecaDois * valorPecaDois));

        System.out.printf("VALOR A PAGAR: R$ %.2f", total);



        sc.close();
    }
}
