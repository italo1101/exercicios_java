import java.util.Scanner;
public class ex021 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int ano;
        System.out.println("Digite um ano: ");
        ano = input.nextInt();
        
        if(ano % 2 == 0){
            System.out.println("O ano é bissexto");
        } else{
            System.out.println("O ano não é bissexto");
        }
        input.close();
    }
}