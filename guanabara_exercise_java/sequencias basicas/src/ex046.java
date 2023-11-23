public class ex046 {
  public static void main(String[] args) {
        int contador = 6, resultado = 0;

        while(contador <= 100){
            System.out.print(contador);
            resultado += contador;
            
            if(contador < 100){
              System.out.print(" + ");
            }
            
            contador += 2;
        }
        System.out.println(" O resultado da soma " + resultado);
  }
}
