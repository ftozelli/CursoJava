import java.util.Scanner;
public class Uri1043{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
         
        Float   a, b, c, resultado;
        String  formato;
        
        a = teclado.nextFloat();
        b = teclado.nextFloat();
        c = teclado.nextFloat();
        /*
        Verifica o formato da forma
        */
        if ((a + b) > c && (a + c) > b && (c + b) > a){
            formato = "Triangulo";
        }
        else{
            formato = "Trapezio";
        }
        
        /*
        Verifica a area ou o perimetro
        */
        if (formato == "Triangulo"){
            resultado = a + b + c;
            System.out.printf("Perimetro = %.1f\n",resultado);
        }
        else{
            resultado = ((a + b) * c) / 2.0f;
            System.out.printf("Area = %.1f\n",resultado);
        }
    }
}