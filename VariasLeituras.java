import java.util.Scanner;
public class VariasLeituras{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
        
        int     numero;
        Float   salario;
        String  txtNumero, txtSalario, nome, validador;

        System.out.println("Digite seu Numero:");
        txtNumero = teclado.nextLine();
        numero = Integer.parseInt(txtNumero);
        System.out.println("Digite seu Nome:");
        nome = teclado.nextLine();
        System.out.println("Digite seu Salario:");
        txtSalario = teclado.nextLine();
        salario = Float.parseFloat(txtSalario);

        System.out.println("Seu numero /nome digitado foram:\n" + numero + " / " + nome + " / R$ " + salario + "\nConfirmar? (S / N)");
        validador = teclado.nextLine();

        if (validador == "S" || validador == "s"){
            System.out.println("Ta beleza!");
        }
        else {
            System.out.println("Nao Sabe o proprio nome? Seu burro!");
        }
        System.out.println("Acabooou");

    }
}