import java.util.Scanner; 
public class Consumo{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a distancia percorrida: ");
        double distancia = scan.nextDouble();
        System.out.println("Digite quantos litros de gasolina foram gastos: ");
        double gasolina = scan.nextDouble();
        System.out.printf("%.3f KM/l",distancia/gasolina);
        scan.close();
    }
}
