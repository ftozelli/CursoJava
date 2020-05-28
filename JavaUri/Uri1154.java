import java.util.Scanner;
public class Uri1154{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
         
        int   idade, close, soma, divisor;
        Float media;
        
        close = 0;
        soma = 0;
        divisor = 0;

        while (close == 0){
            idade = teclado.nextInt();
            if (idade < 0){
                close++;
            }
            else{
                soma = soma + idade;
                divisor++;
            }
        }
        media = (float) soma / divisor;
        System.out.printf("%.2f\n",media);
    }
}