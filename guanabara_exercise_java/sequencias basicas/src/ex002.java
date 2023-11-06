import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String nome;
        System.out.println("Qual é o seu nome?");
        nome = input.nextLine();

        System.out.println("Olá " + nome + ", é um prazer te conhecer!");

        input.close();
    }
}
