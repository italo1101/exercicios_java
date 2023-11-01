import java.util.Scanner;
public class ex020 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int numero;
           System.out.println("Digite um número para saber se é par ou impar!");
           numero = input.nextInt();

           if(numero % 2 == 0){
                System.out.println("O número é par!");
           } else{
             System.out.println("o número é impar");
           }
           
        input.close();
    }
}