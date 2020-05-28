import java.util.Scanner;
public class Uri1066{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
         
        int     contador, contadorPar, contadorImpar, contadorPositivo, contadorNegativo, num, restoNum;

        contador = 0;
        contadorPar = 0;
        contadorImpar = 0;
        contadorPositivo = 0;
        contadorNegativo = 0;
        
        while (contador < 5){
            num = teclado.nextInt();
            restoNum = num % 2;

            if (restoNum == 0){
                contadorPar++;
                contador++;
            }
            else{
                contadorImpar++;
                contador++;
            }

            if  (num == 0){
                contador = contador;
            }
            else if (num > 0){
                contadorPositivo++;
            }
            else{
                contadorNegativo++;
            }
        }   
        System.out.println(contadorPar + " valor(es) par(es)"); 
        System.out.println(contadorImpar + " valor(es) impar(es)"); 
        System.out.println(contadorPositivo + " valor(es) positivo(s)"); 
        System.out.println(contadorNegativo + " valor(es) negativo(s)");     
    }
}