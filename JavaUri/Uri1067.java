import java.util.Scanner;
public class Uri1067{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
         
        int     contador, num, numImpar, restoNum;

        contador = 0;
        numImpar = 0;
        num = teclado.nextInt();
        
        while (contador <= num){
            restoNum = contador % 2;

            if (restoNum == 0){
                contador++;
            }
            else{
                numImpar = contador;
                System.out.println(numImpar); 
                contador++;
            }
        }     
    }
}