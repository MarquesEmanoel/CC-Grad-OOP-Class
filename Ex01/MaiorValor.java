import java.util.Scanner; 
public class MaiorValor{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o Valor A: ");
        int a = scan.nextInt();
        System.out.println("Digite o Valor B: ");
        int b = scan.nextInt();
        System.out.println("Digite o Valor C: ");
        int c = scan.nextInt();
        if(Math.abs(a)>=Math.abs(b) && Math.abs(a)>=Math.abs(c))
            System.out.printf("%d eh o maior",a);
        else if(Math.abs(b)>=Math.abs(a) && Math.abs(b)>=Math.abs(c))
            System.out.printf("%d eh o maior",b);
        else
            System.out.printf("%d eh o maior",c);
        scan.close();
    }
}
