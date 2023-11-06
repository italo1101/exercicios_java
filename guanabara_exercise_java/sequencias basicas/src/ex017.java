import java.util.Scanner;
public class ex017
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int velocidadeCarro, valorMulta, diferencaVelocidade;
		
		System.out.println("Digite a valocidade do carro: ");
		velocidadeCarro = input.nextInt();
		
		if(velocidadeCarro > 80){
		    diferencaVelocidade = velocidadeCarro - 80;
		    valorMulta = diferencaVelocidade * 5;
		    System.out.println("Voce está acima da velocidade permita, portanto, voce sera multado em R$" + valorMulta);
		}else {
		    System.out.println("Voce está na velocidade permitida");
		}

        input.close();
	}
}