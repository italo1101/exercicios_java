import java.util.Scanner;
public class ex013
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double salarioFuncionario, aumento, salarioAtualizado;
		int percentualAumento;
		
		System.out.println("Digite o valor do salario do funcionario: ");
		salarioFuncionario = input.nextDouble();
		System.out.println("Digite qual é o percentual do aumento: ");
		percentualAumento = input.nextInt();
		
		aumento = salarioFuncionario * percentualAumento/100;
		
		salarioAtualizado = salarioFuncionario + aumento;
		
		System.out.println("O salario atualizado do funcionario com o aumento de R$" + aumento + " é de: " + salarioAtualizado);

        input.close();
	}
}