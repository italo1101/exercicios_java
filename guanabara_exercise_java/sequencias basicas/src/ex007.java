import java.util.Scanner;
public class ex007 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        double numero, dobro, terca;
        System.out.println("Digite um número: ");
        numero = input.nextDouble();
        dobro = numero * 2;
        terca = numero / 3;
        System.out.println("O dobro de " + 3.5 + " é " + dobro);
        System.out.println("A terça parte de " + numero + " é " + terca);
        input.close();
    }
}
