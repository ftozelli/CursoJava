import java.util.Scanner;
public class Isidro1020{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
        
        int     sexo;
        Float   altura, peso;
        
        System.out.println("Informe seu sexo. 0 para Masculino e 1 para Feminino");
        sexo = teclado.nextInt();
        System.out.println("Informe sua altura");
        altura = teclado.nextFloat();

        if ( sexo == 0){
            peso = (72.7f * altura) - 58.0f;
            System.out.printf("Seu peso ideal eh de: %.2f Kg\n",peso);
            System.out.printf("Sim... Voce ta gordo, mano! E sim, eu sei que bacon eh uma delicia!\n");
        }
        else {
            peso = (62.1f * altura) - 44.7f;
            System.out.printf("Seu peso ideal eh de: %.2f Kg\n",peso);
        }

    }
}