import java.util.Scanner;
public class Uri1008{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
        
        int fun;
        
        float hora, valorH, total;
        
        fun = teclado.nextInt();  
        hora = teclado.nextFloat();  
        valorH = teclado.nextFloat();  
        total = hora * valorH;  
        
        System.out.println("NUMBER = " + fun);
        System.out.printf("SALARY = U$ %.2f\n",total);
    }
}