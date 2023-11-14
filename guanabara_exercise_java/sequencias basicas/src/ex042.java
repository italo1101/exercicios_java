import java.util.Scanner;
public class ex042 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int numero, contador = 0;
    System.out.println("Digite um número para contar");
    numero = input.nextInt();

    while(contador <= numero){
      System.out.println(contador);
      contador++;
    }
    System.out.println("Acabou agora!");



    input.close();
  }
}
