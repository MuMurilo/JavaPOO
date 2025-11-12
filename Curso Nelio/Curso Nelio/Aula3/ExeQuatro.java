
import java.util.Scanner;

public class ExeQuatro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A;
        int B;
        int C;

        A = sc.nextInt();
        B = sc.nextInt();

        if (B<A){
            B = B+24;
            C = B-A;
            System.out.printf("Jogo Durou %d Horas", C);
        } 
        else {
            if(A==B){
                C = 24;
                System.out.printf("Jogo Durou %d Horas", C);
            }
        } 

            C = B-A;
            System.out.printf("Jogo Durou %d Horas", C);
            sc.close();
        }

    }



