import java.util.Scanner;
public class ex033 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double valorCasa, salarioComprador, prestacao, limiteSalarial;
        int anosPrestacao;

        System.out.println("Digite o valor da casa que deseja comprar: ");
        valorCasa = input.nextInt();

        System.out.println("Digite o seu salário mensal: ");
        salarioComprador = input.nextInt();

        System.out.println("Digite em quantos anos você pretende pagar: ");
        anosPrestacao = input.nextInt();

        prestacao = valorCasa / anosPrestacao;

        limiteSalarial = salarioComprador * 30/100;

        if(prestacao < limiteSalarial){
            System.out.println("Parabéns, seu crédito foi aprovado!");
        }else{
            System.out.println("Sinto muito mas seu crédito foi negado!");
        }


        input.close();
    }
}
