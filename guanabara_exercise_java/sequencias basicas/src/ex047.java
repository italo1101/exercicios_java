public class ex047 {
  public static void main(String[] args) {
        int contador = 450, resultado = 0;

        while(contador >= 0){
            System.out.print(contador);
            contador -= 50;

            if (contador > 0) {
                System.out.print(" + ");
            }

            resultado += contador;
        }
        
        System.out.println(" O resultado da soma " + resultado);
  }
}