import java.util.Scanner; 
public class Salario{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o numero do funcionário: ");
        int fNumber = scan.nextInt();
        System.out.println("Digite as horas trabalhadas: ");
        double fHoras = scan.nextDouble();
        System.out.println("Digite o valor da hora do funcionário: ");
        double sHora = scan.nextDouble();
        double sal= sHora*fHoras;
        System.out.println("NUMBER = "+fNumber);
        System.out.println("SALARY = U$ "+sal);
        scan.close();
    }
}