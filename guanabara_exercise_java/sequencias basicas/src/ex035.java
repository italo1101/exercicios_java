import java.util.Scanner;
public class ex035 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String tipoCarro;
        int diasDeUso;
        double kmPercorrido, valorKm, diaria, valorTotal;

        System.out.println("Digite qual o tipo de carro foi alugado: luxo | popular");
        tipoCarro = input.nextLine();
        System.out.println("Quantos dias o carro foi usado? ");
        diasDeUso = input.nextInt();
        System.out.println("Quantos km foram percorridos com o carro? ");
        kmPercorrido = input.nextDouble();

        if(tipoCarro.equals ("luxo") && kmPercorrido <= 100){
            valorKm = kmPercorrido * 0.20;
            diaria = diasDeUso * 150;
            valorTotal = diaria + valorKm;
            System.out.println("O total a ser pago pelo carro com diaria de R$" + diaria + " e com " + kmPercorrido + "km vai ser de: " + valorTotal);
        }else if(tipoCarro.equals("luxo") && kmPercorrido > 100){
            valorKm = kmPercorrido * 0.10;
            diaria = diasDeUso * 150;
            valorTotal = diaria + valorKm;
            System.out.println("O total a ser pago pelo carro com diaria de R$" + diaria + " e com " + kmPercorrido + "km vai ser de: " + valorTotal); 
        }else if(tipoCarro.equals("popular") && kmPercorrido <= 200){
            valorKm = kmPercorrido * 0.30;
            diaria = diasDeUso * 90;
            valorTotal = diaria + valorKm;
            System.out.println("O total a ser pago pelo carro com diaria de R$" + diaria + " e com " + kmPercorrido + "km vai ser de: " + valorTotal);
        }else if(tipoCarro.equals("popular") && kmPercorrido > 200){
            valorKm = kmPercorrido * 0.25;
            diaria = diasDeUso * 90;
            valorTotal = diaria + valorKm;
            System.out.println("O total a ser pago pelo carro com diaria de R$" + diaria + " e com " + kmPercorrido + "km vai ser de: " + valorTotal);
        }




        input.close();
    }
}
