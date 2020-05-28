import java.util.Scanner;
public class Leitura{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
        int a;
        float b;

        System.out.println("Digita um int ae");
        a = teclado.nextInt();
        System.out.println("Digita um float ae");
        b = teclado.nextFloat();   
        
        System.out.println("Voce digitou isso aqui: " + a + " e isso aqui: " + b);
    }
}