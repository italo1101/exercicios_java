import java.util.Scanner;
public class ex030
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double reta1, reta2, reta3;
		
		System.out.println("Digite o valor da primeira reta: ");
		reta1 = input.nextDouble();
		System.out.println("Digite o valor da segunda reta: ");
		reta2 = input.nextDouble();
		System.out.println("DIgite o valor da terceira reta: ");
		reta3 = input.nextDouble();
		
		if(reta1 + reta2 > reta3 && reta1 + reta3 > reta2 && reta2 + reta3 > reta1){
		    System.out.println("É possível formar um triângulo, agora vamos ver de qual tipo...");
		
		
		if(reta1 == reta2 && reta3 == reta1){
		    System.out.println("O triângulo é EQUILÁTERO!");
		}else if(reta1 == reta2 || reta3 == reta1 || reta2 == reta3){
		    System.out.println("O triângulo é ISÓSCELES!");
		}else{
		    System.out.println("O triângulo é ESCALENO");
		}
	    
	    } else{
	        System.out.println("Não forma um triângulo!");
	    }
        
        input.close();
	}
}
