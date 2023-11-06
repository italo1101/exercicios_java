import java.util.Scanner;
public class ex015
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int cigarroDia, quantidadeDia, totalDiasPerdidos;
		System.out.println("Digite a quantidade de cigarro que voce fuma por dia: ");
		cigarroDia = input.nextInt();
		System.out.println("Digite quantos anos voce esta fumando: ");
		input.nextInt();
		
		quantidadeDia = cigarroDia * 10;
		totalDiasPerdidos = quantidadeDia * 24;
		
		System.out.println("De acordo com a quantidade de cigarro que voce fuma por dia, voce já perdeu: " + totalDiasPerdidos + " dias");

        input.close();
	}
}
