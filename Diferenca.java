import java.util.Scanner; 
public class Diferenca{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor A: ");
        int a = scan.nextInt();
        System.out.println("Digite o valor B: ");
        int b = scan.nextInt();
        System.out.println("Digite o valor C: ");
        int c = scan.nextInt();
        System.out.println("Digite o valor D: ");
        int d = scan.nextInt();
        int dif= (a*b) - (c*d);
        System.out.println("DIFERENCA = "+dif);
        scan.close();
    }
}
