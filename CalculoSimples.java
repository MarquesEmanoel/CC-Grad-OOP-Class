import java.util.Scanner; 
public class CalculoSimples{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o código da peça 1: ");
        int cod1 = scan.nextInt();
        System.out.println("Digite a quantidade da peça 1: ");
        int qtd1 = scan.nextInt();
        System.out.println("Digite o valor da peça 1: ");
        double prec1 = scan.nextDouble();
        System.out.println("Digite o código da peça 2: ");
        int cod2 = scan.nextInt();
        System.out.println("Digite a quantidade da peça 2: ");
        int qtd2 = scan.nextInt();
        System.out.println("Digite o valor da peça 2: ");
        double prec2 = scan.nextDouble();
        double total= (qtd1*prec1)+(qtd2*prec2);
        System.out.println("VALOR A PAGAR = R$ "+total);
        scan.close();
    }
}