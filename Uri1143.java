import java.util.Scanner;
public class Uri1143{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
         
        int     contador, num;
        String  resultado;

        contador = 1;
        num = teclado.nextInt();
        
        while (contador <= num){
            System.out.printf(contador+" ");
            System.out.printf((contador*contador)+" ");
            System.out.printf((contador*contador*contador)+"\n");
            contador++;
        }     
    }
}