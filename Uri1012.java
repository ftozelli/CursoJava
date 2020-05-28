import java.util.Scanner;
public class Uri1012{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
        
        double A, B, C;
        double volTriangulo, volCirculo, volTrapezio, volQuadrado, volRetangulo;

        A = teclado.nextDouble();  
        B = teclado.nextDouble();  
        C = teclado.nextDouble();  
        volTriangulo = (A * C) / 2.0;
        volCirculo =  3.14159 * (C*C);
        volTrapezio = ((A+B)*C) / 2.0;
        volQuadrado = B * B;
        volRetangulo = A * B;

        System.out.printf("TRIANGULO: %.3f\n",volTriangulo);
        System.out.printf("CIRCULO: %.3f\n",volCirculo);
        System.out.printf("TRAPEZIO: %.3f\n",volTrapezio);
        System.out.printf("QUADRADO: %.3f\n",volQuadrado);
        System.out.printf("RETANGULO: %.3f\n",volRetangulo);
    }
}