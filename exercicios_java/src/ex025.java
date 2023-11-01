import java.util.Scanner;
public class ex025{
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int linhaA, linhaB, linhaC;

        System.out.println("Digite o valor da primeira linha: ");
        linhaA = input.nextInt();
        System.out.println("Digite o valor da segunda linha: ");
        linhaB = input.nextInt();
        System.out.println("Digite o valor da terceira linha: ");
        linhaC = input.nextInt();

        if((linhaA + linhaB < linhaC) || (linhaC + linhaB < linhaA) || (linhaA + linhaC < linhaB)){
            System.out.println("As linhas A, B e C não formam um triângulo");
        }else{
            System.out.println("As linhas A, B e C formam um triângulo ");
            
        }

        input.close();
    }
}
