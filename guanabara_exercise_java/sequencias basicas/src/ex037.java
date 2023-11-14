import java.util.Scanner;
public class ex037
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String genero;
		int tempoEmpresa;
		double salarioAtual, novoSalario, aumento, percentual;
		
		System.out.println("Digite o salario atual do funcionário");
		salarioAtual = input.nextDouble();
		
		System.out.println("Digite o genero do funcionário");
		genero = input.next();
		
		System.out.println("Quanto tempo de empresa o funcionário tem?");
		tempoEmpresa = input.nextInt();
		
		
		
		if(genero.equals("mulher") && tempoEmpresa <= 15){
		    percentual = 5;
		    aumento = salarioAtual * (percentual/100);
		    novoSalario = aumento + salarioAtual;
		    System.out.println("O salário atualizado do funcionário é de R$" + novoSalario);
		    
		}else if(genero.equals("mulher") && tempoEmpresa > 15 && tempoEmpresa <= 20){
		    percentual = 12;
		    aumento = salarioAtual * (percentual/100);
		    novoSalario = aumento + salarioAtual;
		    System.out.println("O slário atualizado do funcionário é de R$" + novoSalario);
		}else if(genero.equals("mulher") && tempoEmpresa > 20){
		    percentual = 23;
		    aumento = salarioAtual * (percentual/100);
		    novoSalario = aumento + salarioAtual;
		    System.out.println("O salário atualizado do funcionário é de r$ " + novoSalario);
		}else if(genero.equals("homem") && tempoEmpresa <= 15){
		    percentual = 3;
		    aumento = salarioAtual * (percentual/100);
		    novoSalario = aumento + salarioAtual;
		    System.out.println("O salário atualizado do funcionário é de R$ " + novoSalario);
		}else if(genero.equals("homem") && tempoEmpresa > 15 && tempoEmpresa <= 20){
		    percentual = 13;
		    aumento = salarioAtual * (percentual/100);
		    novoSalario = aumento + salarioAtual;
		    System.out.println("O salário atualizado do funcionário é de r$ " + novoSalario);
		}else if(genero.equals("homem") && tempoEmpresa > 20){
		    percentual = 20;
		    aumento = salarioAtual * (percentual/100);
		    novoSalario = aumento + salarioAtual;
		    System.out.println("O salário atualizado do funcionário é de " + novoSalario);
		}

        input.close();
	}
}
