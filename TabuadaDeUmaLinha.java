import java.util.Scanner;
public class TabuadaDeUmaLinha{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
        for (int cont=0, num=teclado.nextInt(); cont<=10; System.out.println(num+" x "+cont+" = "+(num*cont++)));
    }
}