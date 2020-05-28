import java.util.Scanner;
public class Uri1051{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
         
        Float     salario, salarioRestante,imposto;
        
        salario = teclado.nextFloat();
        
        if (salario > 0 $$ salario <= 2000.0f){
            imposto = 0;
        }
        else{
            imposto = 0;
        }
        
        if (imposto > 0.0f){
            System.out.printf("R$ %.2f\n",imposto);
        }
        else{
            System.out.println("Isento");
        }
    }
}