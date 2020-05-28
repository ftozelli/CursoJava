import java.util.Scanner;
public class Uri1142{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
         
        int     contador, contadorInterno, num, contadorTemp;
        String  resultado;

        contador = 1;
        contadorInterno = 1;
        contadorTemp = 4;
        num = teclado.nextInt();
        
        while (contador <= num){
            while (contadorInterno <= contadorTemp){

                if(contadorInterno < contadorTemp){
                    System.out.printf(contadorInterno+" ");
                }
                else{
                    System.out.printf("PUM\n");
                }
                contadorInterno++;
            } 
            contadorTemp = contadorTemp + 4;
            contador++;
        }     
    }
}