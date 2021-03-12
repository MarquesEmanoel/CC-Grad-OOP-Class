import java.util.Scanner; 
public class NotaAluno{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o Valor da nota 1: ");
        double n1 = scan.nextDouble();
        System.out.println("Digite o Valor da nota 2: ");
        double n2 = scan.nextDouble();
        double media= ((n1*0.35)+(n2*0.75));
        if(media < 10)
            System.out.println("Media = "+media);
        else
            System.out.println("Media = 10");
        scan.close();
    }
}
