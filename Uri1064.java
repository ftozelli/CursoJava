import java.util.Scanner;
public class Uri1064{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
         
        int     contador, contadorPositivo;
        Float   num, numSoma, media;

        contador = 0;
        contadorPositivo = 0;
        media = 0.0f;
        numSoma = 0.0f;
        
        while (contador < 6){
            num = teclado.nextFloat();

            if  (num == 0){
                contador = contador;
            }
            else if (num > 0){
                contadorPositivo = contadorPositivo + 1;
                contador = contador + 1;
                numSoma = numSoma + num;
                media = numSoma / contadorPositivo;
            }
            else{
                contador = contador + 1;
            }
        }   
        System.out.println(contadorPositivo + " valores positivos");
        System.out.printf("%.1f\n",media);     
    }
}