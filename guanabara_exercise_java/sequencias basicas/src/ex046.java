import java.util.Scanner;
public class ex046 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        int contador = 6, resultado;

        while(contador <= 100){
            System.out.print(contador +  "+");
            contador += 2;
            resultado = contador + contador;
        }
        System.out.println("O resultado da soma" + resultado);
        input.close();
  }
}
