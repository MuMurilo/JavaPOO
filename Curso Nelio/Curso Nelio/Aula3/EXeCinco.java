import java.util.Scanner;

public class EXeCinco {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int item; 
        double preco = 0;
        int quantidade;
        double total;

        item = sc.nextInt();
        quantidade = sc.nextInt();

        if (item == 1){
            preco = 4.00;
        } else if (item == 2){
            preco = 4.50;
        } else if (item == 3){
            preco = 5.00;
        } else if (item == 4){
            preco = 2.00;
        } else if (item == 5){
            preco = 1.50;
        } else {
            System.out.println("Item não encontrado");
        }
        total = preco * quantidade;

        System.out.printf("Total: R$  %.2f",total);




        sc.close();
    }
}
