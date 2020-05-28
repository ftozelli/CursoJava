import java.util.Scanner;
public class Uri1003{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
        int a, b, SOMA;
                                    
        a = teclado.nextInt();  
        b = teclado.nextInt();  
        SOMA = a + b;  
        
        System.out.println("SOMA = " + SOMA);
    }
}