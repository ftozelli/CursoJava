import java.util.Scanner;
public class Uri1041{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
         
        Float   x,y;
        
        x = teclado.nextFloat();
        y = teclado.nextFloat();

        if (x == 0.0f || y == 0.0f){
            if(x == 0.0f && y != 0.0f){
                System.out.println("Eixo Y"); 
            }
            else{
                if(x != 0.0f && y == 0.0f){
                    System.out.println("Eixo X"); 
                }
                else{
                    System.out.println("Origem");
                }
            }
        }
        else{
            if ( x > 0.0f ){
                if ( y > 0.0f ){
                    System.out.println("Q1");
                }
                else{
                    System.out.println("Q4");
                }
            }
            else {
                if ( y > 0.0f ){
                    System.out.println("Q2");
                }
                else{
                    System.out.println("Q3");
                }
            }
        }
    }
}