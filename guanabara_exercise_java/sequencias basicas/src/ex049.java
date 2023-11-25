import java.util.Scanner;
public class ex049 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero = 0, contador = 1, numeroPar = 0, numeroImpar = 0;

        while(contador <= 6){
            System.out.println("Digite o numero " + contador + ": ");
            numero = input.nextInt();
            contador++;
            if(numero % 2 == 0){
                numeroPar += 1;
            }else{
               numeroImpar += 1;
            }
        }

        System.out.println("Foram digitados " + numeroPar + " numeros pares");
        System.out.println("Foram digitados " + numeroImpar + " numeros impar");

        


        input.close();
    }
}
