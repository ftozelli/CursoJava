import java.util.Scanner;
public class Uri1115{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
         
        int   x, y, close;
        
        close = 0;

        while (close == 0){

            x = teclado.nextInt();
            y = teclado.nextInt();

            if (x == 0 || y == 0){
                close++;
            }
            else{
                if ( x > 0 ){
                    if ( y > 0 ){
                        System.out.println("primeiro");
                    }
                    else{
                        System.out.println("quarto");
                    }
                }
                else {
                    if ( y > 0 ){
                        System.out.println("segundo");
                    }
                    else{
                        System.out.println("terceiro");
                    }
                }
            }
        }
    }
}