import java.util.Scanner;
import java.util.Random;
public class ex032
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		int userNumber, randomNumber;
		randomNumber = 5;
		int int_random = rand.nextInt(randomNumber);
		
		System.out.println("Digite um número de 0 a 5 e veja se consegue acertar!");
		userNumber = input.nextInt();
		
	
		
		if(userNumber == int_random){
		    System.out.println("Você acertou!");
		}else{
		    System.out.println("Você errou! :(");
		}
	
	    System.out.println("Inteiro aleatório entre 0 e " + (randomNumber) + " : " + int_random);
	
        input.close();
    } 

   
}
