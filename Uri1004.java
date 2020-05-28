import java.util.Scanner;
public class Uri1004{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
        int a, b, PROD;

        a = teclado.nextInt();  
        b = teclado.nextInt();  
        PROD = a * b;  
        
        System.out.println("PROD = " + PROD);
    }
}