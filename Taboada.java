import java.util.Scanner;
public class Taboada{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
         
        int     num, contador;
        
        System.out.println("Qual tabuada?");
        num = teclado.nextInt();

        contador = 1;
        while (contador <= 10){
            System.out.println(num + " x " + contador + " = " + (num*contador));
            contador = contador + 1;
        }        
    }
}