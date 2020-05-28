import java.util.Scanner;
public class Uri1019{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
        
        int sec, Hora, Minuto, Segundo, Resto;

        sec = teclado.nextInt();  
        Hora = sec / 3600;
        Resto = sec % 3600;
        Minuto = Resto / 60;
        Segundo = Resto % 60;

        System.out.println(Hora + ":" + Minuto + ":" + Segundo);
    }
}