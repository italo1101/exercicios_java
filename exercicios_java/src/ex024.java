import java.util.Scanner;
public class ex024 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
            double distancia, totalViagemCurta, totalViagemLonga;

            System.out.println("Digite a disância da sua viagem: ");
            distancia = input.nextDouble();

            if(distancia <= 200){
                totalViagemCurta = distancia * 0.50;
                System.out.println("O total da viagem que você deve pagar é: " + totalViagemCurta + ", pois sua viagem foi menor que 200km");
            }else{
                totalViagemLonga = distancia * 0.45;
                System.out.println("O total da viagem que você deve pagar é: " + totalViagemLonga + ", pois sua viagem foi maior que 200km");
            }
        input.close();
    }
}