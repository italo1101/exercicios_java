import java.util.Scanner;
public class ex029
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nome;
		double salario, novoSalario, percentualAumento, aumento;
		int anoTrabalho;
		
		
		System.out.println("Digite o nome do funcionário: ");
		nome = input.nextLine();
		
		System.out.println("Digite o salário atual do funcionário: ");
		salario = input.nextDouble();
		
		System.out.println("Digite o tempo do funcionário na empresa: ");
		anoTrabalho = input.nextInt();
		
		if(anoTrabalho <= 3){
		    percentualAumento = 3;
		    aumento = salario * percentualAumento / 100;
		    novoSalario = salario + aumento;
		    System.out.println("O funcionário " + nome + " teve um aumento de " + aumento + " no seu salario atual, ficando com o total de R$" + novoSalario);
		}else if(anoTrabalho > 3 && anoTrabalho <= 10){
		    percentualAumento = 12.5;
		    aumento = salario * percentualAumento / 100;
		    novoSalario = salario + aumento;
		    
		    System.out.println("O funcionário " + nome + " teve um aumento de " + aumento + " no seu salario atual, ficando com o total de R$" + novoSalario);
		}else{
		    percentualAumento = 20;
		    aumento = salario * percentualAumento / 100;
		    novoSalario = salario + aumento;
		    System.out.println("O funcionário " + nome + " teve um aumento de " + aumento + " no seu salario atual, ficando com o total de R$" + novoSalario);
		    
		}
        
        input.close();
	}

}