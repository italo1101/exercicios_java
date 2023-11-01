import java.util.Scanner;
public class ex005 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        double nota1, nota2, media;

        System.out.println("Digite a primeira nota: ");
        nota1 = input.nextDouble();
        System.out.println("Digite a segunda nota: " );
        nota2 = input.nextDouble();
        media = (nota1 + nota2) / 2;
        System.out.println("A media entre " + nota1 + " e " + nota2 + " é igual a " + media);
        input.close();
    }
}
