import java.util.Scanner;
public class Uri1020{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
        
        int  diasJuliana, ano, meses, dias, rest;

        diasJuliana = teclado.nextInt();  
        ano = diasJuliana / 365;
        rest = diasJuliana % 365;
        meses = rest / 30;
        dias = rest % 30;

        System.out.println(ano + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");
    }
}