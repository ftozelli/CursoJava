import java.util.Scanner;
public class Uri1047{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
         
        int     horaI, horaF, horaT, minI, minF, minT;
        
        horaI = teclado.nextInt();
        minI = teclado.nextInt();
        horaF = teclado.nextInt();
        minF = teclado.nextInt();

        horaI = (horaI * 60) + minI;   
        horaF = (horaF * 60) + minF;  

        
        if (horaI > horaF){
            horaT = (1440 - horaI) + horaF;
            minT = 0;
        }
        else if(horaI == horaF){
            horaT = 1440;
            minT = 0;
        }
        else{
            horaT = horaF - horaI;
            minT = 0;
        }
        
        minT = horaT % 60;
        horaT = horaT / 60;

        System.out.println("O JOGO DUROU " + horaT + " HORA(S) E " + minT + " MINUTO(S)");
    }
}