import java.util.Scanner;
public class Uri1018{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
        
        int  montante, n100, n50, n20, n10, n5, n2 , n1, rest;

        montante = teclado.nextInt();  
        n100 = montante / 100;
        rest = montante % 100;
        n50 = rest / 50;
        rest = rest % 50;
        n20 = rest / 20;
        rest = rest % 20;
        n10 = rest / 10;
        rest = rest % 10;
        n5 = rest / 5;
        rest = rest % 5;
        n2 = rest / 2;
        rest = rest % 2;
        n1 = rest / 1;

        System.out.println(montante);
        System.out.println(n100 + " nota(s) de R$ 100,00");
        System.out.println( n50 + " nota(s) de R$ 50,00");
        System.out.println(n20 + " nota(s) de R$ 20,00");
        System.out.println(n10 + " nota(s) de R$ 10,00");
        System.out.println(n5 + " nota(s) de R$ 5,00");
        System.out.println(n2 + " nota(s) de R$ 2,00");
        System.out.println(n1 + " nota(s) de R$ 1,00");
    }
}