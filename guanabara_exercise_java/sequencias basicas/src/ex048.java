import java.util.Scanner;
public class ex048 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero, soma = 0, cont = 1;

        while(cont <= 7){
            System.out.println("Digite o numero " + cont);
            numero = input.nextInt();

            soma += numero;
            cont += 1;
        }

        System.out.println("A soma dos números digitador é: " + soma);
        input.close();
    }
}
