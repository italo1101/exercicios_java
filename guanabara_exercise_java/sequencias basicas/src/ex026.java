import java.util.Scanner;
public class ex026
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numero1, numero2;
		
		System.out.println("Digite o primeiro número: ");
		numero1 = input.nextInt();
		
		System.out.println("Digite o segundo número: ");
		numero2 = input.nextInt();
		
		if(numero1 > numero2){
		    System.out.println("O número 1 é maior!");
		}else if(numero2 > numero1){
		    System.out.println("O número 2 é maior!");
		}else{
		    System.out.println("Os número são iguais!");
		}

        input.close();
	}
}