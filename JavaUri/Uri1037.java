import java.util.Scanner;
public class Uri1037{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
        
        Float   valor;
        
        valor = teclado.nextFloat();

        if ( valor >= 0 && valor <= 25.0f ){
            System.out.printf("Intervalo [0,25]\n");
        }
        else {
            if ( valor >= 25.0f  &&  valor <= 50.0f){
                System.out.printf("Intervalo (25,50]\n");
            }
            else {
                if ( valor >= 50.0f &&  valor <= 75.0f){
                    System.out.printf("Intervalo (50,75]\n");
                }
                else {
                    if ( valor >= 75.0f &&  valor <= 100.0f){
                        System.out.printf("Intervalo (75,100]\n");
                    }
                    else{
                        System.out.printf("Fora de intervalo\n");
                    }
                }
            }
        }

    }
}