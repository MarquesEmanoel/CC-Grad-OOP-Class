import java.util.Scanner; 
public class SomaSimples{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o Valor de A: ");
        int a = scan.nextInt();
        System.out.println("Digite o Valor de B: ");
        int b = scan.nextInt();
        int soma = a+b;
        System.out.println("SOMA = "+soma);
        scan.close();
    }
}
