import java.util.Scanner; 
public class ProdutoSimples{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o Valor de A: ");
        int a = scan.nextInt();
        System.out.println("Digite o Valor de B: ");
        int b = scan.nextInt();
        int prod= a*b;
        System.out.println("PROD= "+prod);
        scan.close();
    }
}
