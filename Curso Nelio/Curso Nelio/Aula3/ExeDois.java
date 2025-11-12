
import java.util.Scanner;

public class ExeDois {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A;
        double B;

        A = sc.nextInt();
        B = A%2;
        
        if (B!=0){

            System.out.println("IMPAR");
        } else{
            System.out.println("PAR");
        }



        sc.close();

    }
}
