import java.util.Scanner;
public class Uri1134{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
         
        int     contador, num, conAlcool, conGasolina, conDiesel;
        
        conAlcool = 0;
        conGasolina = 0;
        conDiesel = 0;
        num = 0;

        while (num != 4){
            num = teclado.nextInt();
            switch (num){
                case 1: conAlcool++; break;
                case 2: conGasolina++; break;
                case 3: conDiesel++; break;
                case 4: break;
                default: num = 0; break;
            }
        }     
        
        System.out.printf("MUITO OBRIGADO\n");
        System.out.printf("Alcool: "+conAlcool+"\n");
        System.out.printf("Gasolina: "+conGasolina+"\n");
        System.out.printf("Diesel: "+conDiesel+"\n");
    }
}