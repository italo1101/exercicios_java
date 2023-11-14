import java.util.Scanner;
public class ex044 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
      int inicio, fim, incremento;
      System.out.println("Digite o inicio: ");
      inicio = input.nextInt();

      System.out.println("Digite o fim: ");
      fim = input.nextInt();

      System.out.println("Digite o incremento: ");
      incremento = input.nextInt();

      while(inicio <= fim){
        System.out.println();
        incremento++;
      }
    input.close();
  }
}
