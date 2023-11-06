import java.util.Scanner;
public class ex012
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
	    double produto, precoPromocional, desconto, percentualDesconto;
	    System.out.println("Digite o preço do produto que deseja comprar");
	    produto = input.nextDouble();
	    System.out.println("Digite o percentual de desconto");
	    percentualDesconto = input.nextDouble();
	    
	    desconto = produto * percentualDesconto/100;
	    precoPromocional = produto - desconto;
	    System.out.println("O produto com o desconto é igual a: " + precoPromocional);
	    
        input.close();
	}
}
