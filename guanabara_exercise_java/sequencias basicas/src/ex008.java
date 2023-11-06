import java.util.Scanner;
public class ex008 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        double distM, distKm, distHm, distDam, distDm, distCm, distMm;
        System.out.println("Digite uma distância em metros: ");
        distM = input.nextDouble();

        distKm = distM / 1000;
        distHm = distM / 100;
        distDam = distM / 10;
        distDm = distM * 10;
        distCm = distM * 100;
        distMm = distM * 1000;

        System.out.println("A distância de " + distM + " corresponde a: ");
        System.out.println(distKm + "KM");
        System.out.println(distHm + "Hm");
        System.out.println(distDam + "Dam");
        System.out.println(distDm + "Dm");
        System.out.println(distCm + "Cm");
        System.out.println(distMm + "Mm");

        input.close();
    }
}
