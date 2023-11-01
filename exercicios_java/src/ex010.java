import java.util.Scanner;
public class ex010 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
            double largura, altura, area, tinta;

            System.out.println("Digite a largura da parede: ");
            largura = input.nextDouble();
            System.out.println("Digite a altura da parede: "); 
            altura = input.nextDouble();

            area = largura * altura;
            tinta = area * 2;

            double areaAoQuadrado = Math.pow(area, 2);

            System.out.println("A area da parede é: " + areaAoQuadrado + " portanto é necessário " + tinta  + " litros de tinta");
        input.close();
    }
}
