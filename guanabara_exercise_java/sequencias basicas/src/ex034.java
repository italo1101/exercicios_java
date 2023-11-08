import java.util.Scanner;
public class ex034 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double peso, altura, imc;

        System.out.println("Digite o seu peso:");
        peso = input.nextDouble();

        System.out.println("Digite a sua altura em metros: (exemplo: 1,62)" );
        altura = input.nextDouble();
        
        imc = peso / (altura * altura);


        System.out.println("Seu IMC é: " + imc);

        if(imc <= 18.5){
            System.out.println("Abaixo do peso");
        }else if(imc >= 18.5 && imc <= 25){
            System.out.println("Peso Ideal");
        }else if(imc >= 25 && imc <= 30){
            System.out.println("Sobrepeso");
        }else if(imc >= 30 && imc <= 40){
            System.out.println("Obesidade");
        }else{
            System.out.println("Obesidade mórbida");
        }

        input.close();
    }

}
