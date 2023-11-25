import java.util.Random;
public class ex050 {
    public static void main(String[] args) {
       Random random = new Random();
       int numero, contador = 1, maior5 = 0, div3 = 0;
       

       System.out.println("Os número sorteados foram: ");

       while(contador <= 20){
            numero = random.nextInt(20);
            System.out.print(numero); 

            if(numero > 5){
                maior5 += 1;
            }

            if(numero % 3 == 0){
                div3 += 1;
            }

            if(contador < 20){
                System.out.print(", ");
            }

            
           contador++;
       }

       System.out.println(" A quantidade de número maior que 5 é: " + maior5);

       System.out.println(" A quantidade de número divisivel por 3 é: " + div3);
    }
}
