import java.util.Scanner;
public class ex022 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int anoNascimento, idade, anoAtual, diferencaIdade;

        System.out.println("Digite o ano em que você nasceu: ");
        anoNascimento = input.nextInt();
        System.out.println("Digite o ano atual");
        anoAtual = input.nextInt();

        idade = anoAtual - anoNascimento;
        diferencaIdade = idade - 18;

        if(idade >= 18 ){
            System.out.println("Você já pode servir!");
            System.out.println("já se passaram " + diferencaIdade + " anos para se alistar");
        } else {
            System.out.println("Você ainda não pode se alistar!");
            System.out.println("ainda faltam" + diferencaIdade + " anos para se alistar");
        }

        input.close();
    }
}