import java.util.Scanner; 
public class SalarioBonus{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome do vendedor: ");
        String nome = scan.nextLine();
        System.out.println("Digite o salario base do vendedor: ");
        double base = scan.nextDouble();
        System.out.println("Digite o total de vendas mensal: ");
        double vendas = scan.nextDouble();
        double sal= base+(vendas*0.15);
        System.out.println("TOTAL = R$ "+sal);
        scan.close();
    }
}