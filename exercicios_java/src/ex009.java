import java.util.Scanner;
public class ex009 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        double real, dolares;
        System.out.println("Digite quanto dinheiro em reais você tem: ");
        real = input.nextDouble();
        dolares = real / 3.45;
        System.out.println("A quantidade em dolares do valor R$" + real + " é: " + " US$ " + dolares); 
        input.close();
    }
}
