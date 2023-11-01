import java.util.Scanner;
public class ex023 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String nomeCliente;
        char sexo;
        double valorCompra, totalDesconto, desconto;

        System.out.println("Digite o nome do cliente: ");
        nomeCliente = input.nextLine();
        System.out.println("Coloque o sexo do cliente: \nf.Feminino\nm.Masculino");
        sexo = input.next().charAt(0);
        System.out.println("Qual o valor da compra? ");
        valorCompra = input.nextDouble();

        if(sexo == 'h'){
            desconto = valorCompra * 5/100;
            totalDesconto = valorCompra - desconto;
            System.out.println("O valor da compra de R$" + valorCompra + " do cliente " + nomeCliente +  " com o desconto de R$" + desconto + " ficou por: R$" + totalDesconto);
        }else{
            desconto = valorCompra * 15/100;
            totalDesconto = valorCompra - desconto;
            System.out.println("O valor da compra de R$" + valorCompra + " do cliente " + nomeCliente +  " com o desconto de R$" + desconto + " ficou por: R$" + totalDesconto);
        }

        input.close();
    }
}
