import java.util.Scanner;
public class ex004 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int numeroA, numeroB, resp;
        System.out.println("Digite o primeiro número: ");
        numeroA = input.nextInt();
        System.out.println("Digite o segundo número: ");
        numeroB = input.nextInt();
        resp = numeroA + numeroB;
        System.out.println("A soma entre " + numeroA + " e " + numeroB + " é igual a: " + resp); 

        input.close();
    }
}
