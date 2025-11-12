
import java.util.Locale;
import java.util.Scanner;

public class ExeQuatro {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int numFunc;
        double numHrTrab;
        double salPorHora;
        double salTotal;

        numFunc = sc.nextInt();
        sc.nextLine();
        numHrTrab = sc.nextDouble();
        sc.nextLine();
        salPorHora = sc.nextDouble();
        sc.nextLine();


        salTotal = numHrTrab * salPorHora;

        System.out.println("NUMBER = "+numFunc);
        System.out.printf("SALARY = U$ %.2f",salTotal);

        sc.close();
    }
}
