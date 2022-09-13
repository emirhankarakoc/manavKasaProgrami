import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
/*
Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
 */
        double gecici;
        //kusurat oldugu icin hepsini double aciyorum.
        double armutTutar = 2.14,
                elmaTutar = 3.67,
                domatesTutar = 1.11,
                muzTutar = 0.95,
                patlicanTutar = 5;

        double toplamTutar=0;

        System.out.println("Kac kilo armut aldin?");
        gecici = scanner.nextDouble();
        toplamTutar = toplamTutar + (gecici*armutTutar);

        System.out.println("Kac kilo elma aldin?");
        gecici = scanner.nextDouble();
        toplamTutar = toplamTutar + (gecici*elmaTutar);

        System.out.println("Kac kilo domates aldin?");
        gecici = scanner.nextDouble();
        toplamTutar = toplamTutar + (gecici*domatesTutar);

        System.out.println("Kac kilo muz aldin?");
        gecici = scanner.nextDouble();
        toplamTutar = toplamTutar + (gecici*muzTutar);

        System.out.println("Kac kilo patlican aldin?");
        gecici = scanner.nextDouble();
        toplamTutar = toplamTutar + (gecici*patlicanTutar);

        System.out.println("gecmis olsun, odemen gereken miktar = "+toplamTutar+"dir.");

    }
}

