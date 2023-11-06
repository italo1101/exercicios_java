import java.util.Scanner;
public class ex028
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		    double largura, comprimento, area;
		    System.out.println("DIgite a largura do terreno: ");
		    largura = input.nextDouble();
		    System.out.println("Digite o comprimento do terreno: ");
		    comprimento = input.nextDouble();
		    
		    area = largura * comprimento;
		    
		    if(area <= 100){
		        System.out.println("De acordo com a area de " + area + "m2 o terreno é popular");
		    }else if(area > 100 && area < 500){
		        System.out.println("De acordo com a area de " + area + " m2 o terreno é master");
		    }else{
		        System.out.println("De acordo com a area de " + area  + "m2 o terreno é vip");
		    }
		    
		input.close();
	}
}