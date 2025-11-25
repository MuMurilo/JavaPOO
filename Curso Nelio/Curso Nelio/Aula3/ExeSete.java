
import java.util.Scanner;

public class ExeSete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x;
        double y;

        x = sc.nextDouble();
        y = sc.nextDouble();

        if(x==0 && y == 0){
            System.out.println("O ponto esta Na origem");
        } else if (x != 0 && y == 0){
            System.out.println("O ponto está no eixo X");
        } else if (x == 0 && y != 0){
            System.out.println("O ponto está no eixo Y");
        } else if (x > 0 && y > 0){
            System.out.println("O ponto está no Q1");
        } else if (x < 0 && y > 0){
            System.out.println("O ponto está no Q2");
        } else if (x < 0 && y < 0){
            System.out.println("O ponto está no Q3");
        } else if (x > 0 && y < 0){
            System.out.println("O ponto está no Q4");
        }



        sc.close();
    }
}
