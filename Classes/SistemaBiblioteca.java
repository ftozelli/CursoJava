import java.util.Scanner;
public class SistemaBiblioteca{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);

        String  sistema;
        int     fechar;
        
        fechar = 0;

        Livro l1  = new Livro("TesteTit1", "TesteAut1", "TesteCat1", 2001, 1, 6);
        Livro l2  = new Livro("TesteTit2", "TesteAut2", "TesteCat2", 2002, 2, 7);
        Livro l3  = new Livro("TesteTit3", "TesteAut3", "TesteCat3", 2003, 3, 8);
        Livro l4  = new Livro("TesteTit4", "TesteAut4", "TesteCat4", 2004, 4, 9);
        Livro l5  = new Livro("TesteTit5", "TesteAut5", "TesteCat5", 2005, 5, 10);

        while(fechar != 1){
            sistema = teclado.nextLine();
            switch (sistema){
                case "e1": l1.emprestar(); break;
                case "a1": l1.avariado(); break;
                case "e2": l2.emprestar(); break;
                case "a2": l2.avariado(); break;
                case "e3": l3.emprestar(); break;
                case "a3": l3.avariado(); break;
                case "e4": l4.emprestar(); break;
                case "a4": l4.avariado(); break;
                case "e5": l5.emprestar(); break;
                case "a5": l5.avariado(); break;
                case "c1": l1.consulta(); break;
                case "c2": l2.consulta(); break;
                case "c3": l3.consulta(); break;
                case "c4": l4.consulta(); break;
                case "c5": l5.consulta(); break;
                case "0": fechar = 1; System.out.println("Bye!");break;
                default: System.out.println("Opcao invalida!");break;
            }
        }
    }
}