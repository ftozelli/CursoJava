import java.util.Scanner;
public class Uri1144{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
         
        int     contador, num, n2, n3;
        String  resultado;

        contador = 1;
        num = teclado.nextInt();
        
        while (contador <= num){
            n2 = contador * contador;
            n3 = n2 * contador;
            System.out.printf(contador+" "+n2+" "+n3+"\n");
            n2++;
            n3++;
            System.out.printf(contador+" "+n2+" "+n3+"\n");
            contador++;   
        }     
    }
}