import java.util.Scanner;
public class Uri1046{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
         
        int     horaI, horaF, horaT;
        
        horaI = teclado.nextInt();
        horaF = teclado.nextInt();
        
        if (horaI > horaF){
            horaT = (24 - horaI) + horaF;
        }
        else if(horaI == horaF){
            horaT = 24;
        }
        else{
            horaT = horaF - horaI;
        }
        
        System.out.println("O JOGO DUROU " + horaT + " HORA(S)");
    }
}