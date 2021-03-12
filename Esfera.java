import java.util.Scanner; 
public class Esfera{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite valor do raio: ");
        double raio = scan.nextDouble();
        double volume= ((4.0/3.0)*3.14159)*Math.pow(raio,3);
        System.out.printf("VOLUME = %.3f",volume);
        scan.close();
    }
}