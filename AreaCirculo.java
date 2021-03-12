import java.util.Scanner; 

public class AreaCirculo{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor do raio: ");
        double raio = scan.nextDouble();
        double area = Math.pow(raio,2) * 3.14159;
        System.out.println("Área = "+area);
        scan.close();
    }
}