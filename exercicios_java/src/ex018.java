import java.util.Scanner;
public class ex018
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int nascimento, idade, anoAtual;
		
		System.out.println("Digite o ano do seu nascimento: ");
		nascimento = input.nextInt();
		System.out.println("Digite o ano atual: ");
		anoAtual = input.nextInt();
		
		idade = anoAtual - nascimento;
		
		if(idade >= 18){
		   System.out.println("Voce pode votar");
		}else{
		    System.out.println("Voce não pode votar");
		}

        input.close();
	}
}