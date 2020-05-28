import java.util.Scanner;
public class Uri1070{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
         
        int     contador, num, numImpar, restoNum, contadorInterno;

        contador = 0;
        numImpar = 0;
        num = teclado.nextInt();
        contadorInterno = num;
        
        while (contador < 6){
            restoNum = contadorInterno % 2;

            if (restoNum == 0){
                contadorInterno++;
            }
            else{
                numImpar = contadorInterno;
                System.out.println(numImpar); 
                contador++;
                contadorInterno++;
            }
        }     
    }
}