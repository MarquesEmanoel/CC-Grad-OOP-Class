import java.util.Scanner; 
public class MediaPonderada{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o Valor da nota A: ");
        double n1 = scan.nextDouble();
        System.out.println("Digite o Valor da nota B: ");
        double n2 = scan.nextDouble();
        System.out.println("Digite o Valor da nota C: ");
        double n3 = scan.nextDouble();
        double media= ((n1*2)+(n2*3)+(n3*5))/10;
        System.out.println("Media = "+media);
        scan.close();
    }
}
