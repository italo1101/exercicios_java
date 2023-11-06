import java.util.Scanner;
public class ex016
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double salarioFuncionario, salarioPorHora;
		int diaTrabalhado;
		
		System.out.println("Digite quantos dias o funcionario trabalhou: ");
		diaTrabalhado = input.nextInt();
		System.out.println("Digite quanto o funcionario ganha por hora: ");
		salarioPorHora = input.nextDouble();
		
		salarioFuncionario = diaTrabalhado * salarioPorHora;
		
		System.out.println("O funcionario recebeu R$" + salarioFuncionario);
		
		input.close();
		
	}
}