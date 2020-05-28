import java.util.Scanner;
public class Uri1060{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
         
        int     contador,contadorPositivo;
        Float   num;

        contador = 0;
        contadorPositivo = 0;
        
        while (contador < 6){
            num = teclado.nextFloat();

            if  (num == 0){
                contador = contador;
            }
            else if (num > 0){
                contadorPositivo = contadorPositivo + 1;
                contador = contador + 1;
            }
            else{
                contador = contador + 1;
            }
        }   
        System.out.println(contadorPositivo + " valores positivos");     
    }
}