import java.util.Scanner;
public class Uri1014{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
        
        int X;
        float Y, Consumo;

        X = teclado.nextInt();  
        Y = teclado.nextFloat();  
        Consumo = X / Y;

        System.out.printf("%.3f  km/l\n",Consumo);
    }
}