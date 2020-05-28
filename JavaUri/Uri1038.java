import java.util.Scanner;
public class Uri1038{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
        
        int     codProduto,qtdProduto; 
        Float   preco,valorPedido;
        
        codProduto = teclado.nextInt();
        qtdProduto = teclado.nextInt();

        if ( codProduto == 1 ){
            valorPedido = qtdProduto * 4.0f;
            System.out.printf("Total: R$ %.2f\n",valorPedido);
        }
        else {
            if ( codProduto == 2){
                valorPedido = qtdProduto * 4.5f;
                System.out.printf("Total: R$ %.2f\n",valorPedido);
            }
            else {
                if ( codProduto == 3){
                    valorPedido = qtdProduto * 5.0f;
                    System.out.printf("Total: R$ %.2f\n",valorPedido);
                }
                else {
                    if ( codProduto == 4){
                        valorPedido = qtdProduto * 2.0f;
                        System.out.printf("Total: R$ %.2f\n",valorPedido);
                    }
                    else{
                        if ( codProduto == 5){
                            valorPedido = qtdProduto * 1.5f;
                            System.out.printf("Total: R$ %.2f\n",valorPedido);
                        }
                        System.out.printf("Produto nao cadastrado\n");
                    }
                }
            }
        }

    }
}