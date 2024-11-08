import java.util.Scanner;

public class Segundo {
  public static void main(String args[]){
    float d1,d2,d3;

    Scanner ler=new Scanner(System.in);

    d1=ler.nextFloat();
    d2=ler.nextFloat();
    d3=ler.nextFloat();

    if(d1 < d2 + d3 && d2 <d1 + d3 && d3 < d1 + d2){
        System.out.println("É um triangulo");

           if(d1 == d2 && d2 == d3){
                System.out.println("Equilatero");
           }
             else if(d1 != d2 && d2 != d3 && d1 != d3){
                System.out.println("Escaleno");
             }
              else{
                System.out.println("Isosceles");
              }
    }else{
        System.out.println("Triangulo porra nenhuma");
    }
    ler.close();
  }
    
}
