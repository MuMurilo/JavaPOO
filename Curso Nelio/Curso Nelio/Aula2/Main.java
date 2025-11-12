
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A;
        int B;
        int C;
        int D;
        int dif;

        A = sc.nextInt();
        sc.nextLine();
        B = sc.nextInt();
        sc.nextLine();
        C = sc.nextInt();
        sc.nextLine();
        D = sc.nextInt();
        sc.nextLine();

        dif = (A * B - C * D);

        System.out.println("DIFERENCA = " + dif);


 }
}
