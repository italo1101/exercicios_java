import java.util.Scanner;
public class ex011
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    double a, b, c, delta;
		
		System.out.println("Digite o primeiro número: ");
		a = input.nextInt();
		System.out.println("Digite o segundo número: ");
		b = input.nextInt();
		System.out.println("Digite o terceiro número: ");
		c = input.nextInt();
		
		delta = (b*b) - 4*a*c;
		
		System.out.println("O valor de delta com os número " + a + "," + b + " e " + c + " é igual a: " + delta);
        input.close();
	}
}