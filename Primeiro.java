import java.util.Scanner;

public class Primeiro {
    public static void main(String[] args){
        float quantidade, total;
            Scanner read = new Scanner(System.in);

        quantidade = read.nextInt();

        if(quantidade <= 12){
            total = quantidade * 1.30f;
            System.out.printf("Total: R$%.2f ",total);
        }

         else{
            total = quantidade * 1.00f;
            System.out.printf("Total: R$%.2f ",total);
         }

        read.close();
}
}