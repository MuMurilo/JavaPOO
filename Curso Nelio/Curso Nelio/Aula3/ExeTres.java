
import java.util.Scanner;

public class ExeTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A;
        double B;
        double C;

        A = sc.nextInt();
        B = sc.nextInt();

        if (A>B){
            C = A%B;
            if (C == 0.0){
                System.out.println("São multiplos!");
            }else{
                System.out.println("Não são multiplos!");
            }
        } else{
            C = B%A;
            if (C == 0.0 ){
                System.out.println("São multiplos!");
            }else{
                System.out.println("Não são multiplos!");
            
        }





        sc.close();
    }
    }
}
