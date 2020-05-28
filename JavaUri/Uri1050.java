import java.util.Scanner;
public class Uri1050{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
         
        int     ddd;
        String  cidade;
        
        ddd = teclado.nextInt();

        //definição da cidade
        switch (ddd){
            case 61:
                cidade = "Brasilia";
            break;
            case 71:
                cidade = "Salvador";
            break;
            case 11:
                cidade = "Sao Paulo";
            break;
            case 21:
                cidade = "Rio de Janeiro";
            break;
            case 32:
                cidade = "Juiz de Fora";
            break;
            case 19:
                cidade = "Campinas";
            break;
            case 27:
                cidade = "Vitoria";
            break;
            case 31:
                cidade = "Belo Horizonte";
            break;
            default:
                cidade = "DDD nao cadastrado";
        }
        System.out.println(cidade);
    }
}