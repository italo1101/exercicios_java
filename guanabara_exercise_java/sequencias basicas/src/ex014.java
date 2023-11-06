import java.util.Scanner;
public class ex014
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double kmPercorridos, totalKmPercorridos, precoTotal;
		int quantidadeDias, totalDias;
		System.out.println("Quantos km o carro percorreu?");
		kmPercorridos = input.nextDouble();
		System.out.println("Quantos dias você ficou com o carro?");
		quantidadeDias = input.nextInt();
		
		totalKmPercorridos = kmPercorridos * 0.20;
		totalDias = quantidadeDias * 90;
		
		precoTotal = totalDias + totalKmPercorridos;
		
		System.out.println("O preço total que voce ira pagar pelo aluguel do carro e de: R$" + precoTotal);
		
        input.close();
	}
}
