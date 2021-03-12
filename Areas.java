import java.util.Scanner; 
public class Areas{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite valor a: ");
        double a = scan.nextDouble();
        System.out.println("Digite valor b: ");
        double b = scan.nextDouble();
        System.out.println("Digite valor c: ");
        double c = scan.nextDouble();
        double quadrado = Math.pow(b,2);
        double triangulo = (a*c)/2;
        double circulo = (Math.pow(c,2)*3.14159);
        double trapezio = ((a+b)*c)/2 ;
        double retangulo = a*b;

        System.out.printf("TRIANGULO = %.3f\n",triangulo);
        System.out.printf("CIRCULO = %.3f\n",circulo);
        System.out.printf("TRAPEZIO = %.3f\n",trapezio);
        System.out.printf("QUADRADO = %.3f\n",quadrado);
        System.out.printf("RETANGULO = %.3f\n",retangulo);
        scan.close();
    }
}