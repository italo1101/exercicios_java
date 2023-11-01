import java.util.Scanner;
public class ex003 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String nome;
        double salario;
        System.out.println("Digite o seu nome: ");
        nome = input.nextLine();
        System.out.println("Digite o seu salário: ");
        salario = input.nextDouble();
        System.out.println("O funcionário(a), " + nome + " tem um salário de R$ " + salario + " em junho");

        input.close();
    }
}
