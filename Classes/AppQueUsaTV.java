import java.util.Scanner;
public class AppQueUsaTV{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);

        String  controle;
        int     fechar;
        
        fechar = 0;

        Televisao t  = new Televisao("Samsung", 60, 110, "Smart 4k");
        Televisao t2 = new Televisao("LG", 55, 110, "Smart 4k");

        while(fechar != 1){
            controle = teclado.nextLine();
            switch (controle){
                case "1": t.ligar(); break;
                case "+": t.volumeMais(); break;
                case "-": t.volumeMenos(); break;
                case "m": t.mute(); break;
                case "c+": t.canalMais(); break;
                case "c-": t.canalMenos(); break;
                case "0": fechar = 1; t.ligar(); System.out.println("Bye!");break;
                default: System.out.println("Opcao invalida!");break;
            }
        }
    }
}