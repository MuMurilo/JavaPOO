
import java.util.Scanner;

public class ExeUm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A;
        A = sc.nextInt();

        if (A>=0){
            System.out.println("Numero digitado não é negativo!");
        } else {
            System.out.println("Numero digitado é negativo!");
        }


        sc.close();
    }
}
