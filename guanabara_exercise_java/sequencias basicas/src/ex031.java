import java.util.Scanner;
public class ex031
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int player1, player2;
		
		
		System.out.println("-------------Jokenpo---------------");
		System.out.println("número 1 ---------- PEDRA");
		System.out.println("número 2 ---------- PAPEL");
		System.out.println("número 3 ---------- TESOURA");
		
		System.out.println("Player1, Digite um número: ");
		player1 = input.nextInt();
        
        System.out.println("Player2, Digite um número: ");
        player2 = input.nextInt();
        
        if(player1 == 1 && player2 == 2){
            System.out.println("player2 Venceu");
        }else if(player1 == 1 && player2 == 3){
            System.out.println("Player1 Venceu");
        }else if(player1 == 2 && player2 == 1){
            System.out.println("Player1 Venceu");
        }else if(player1 == 2 && player2 == 3){
            System.out.println("Player2 Venceu");
        }else if(player1 == 3 && player2 == 1){
            System.out.println("Player2 Venceu");
        }else if(player1 == 3 && player2 == 2){
            System.out.println("player1 Venceu");
        }else{
            System.out.println("O jogo deu empate");
        }

        input.close();
	}
}
