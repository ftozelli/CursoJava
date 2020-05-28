import java.util.Scanner;
public class Uri1065{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
         
        int     contador, contadorPar, num, restoNum;

        contador = 0;
        contadorPar = 0;
        
        while (contador < 5){
            num = teclado.nextInt();
            restoNum = num % 2;

            if (restoNum == 0){
                contadorPar = contadorPar + 1;
                contador = contador + 1;
            }
            else{
                contador = contador + 1;
            }
        }   
        System.out.println(contadorPar + " valores pares");     
    }
}