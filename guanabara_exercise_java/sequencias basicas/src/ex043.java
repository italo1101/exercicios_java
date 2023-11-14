public class ex043 {
  public static void main(String[] args) {
    int contador = 30;


    while(contador > 0){
      if (contador % 4 == 0){
        System.out.println("[" + contador + "]");
      }
      System.out.println(contador);
      contador--;
    }
  }
}
