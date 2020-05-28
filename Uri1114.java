import java.util.Scanner;
public class Uri1114{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);

        int senha, senhaCorreta;

        senha = 1;
        senhaCorreta = 2002;
        
        while (senha != senhaCorreta){
            senha = teclado.nextInt();
            if (senha != senhaCorreta) {
                System.out.println("Senha Invalida");
            }
            else{
                System.out.println("Acesso Permitido");
            }
        }
    }
}