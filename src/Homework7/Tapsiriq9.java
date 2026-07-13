package Homework7;
import java.util.Scanner;
public class Tapsiriq9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int secim = -1;

        while (secim != 0)  {
            System.out.println("1) Metr -> Fut");
            System.out.println("2) Kiloqram -> Funt");
            System.out.println("3) Selsi -> Fahrenheit");
            System.out.println("0) Cixis");

            System.out.print("Seciminizi daxil edin: ");
            secim = sc.nextInt();

            switch (secim) {
                case 1:
                    System.out.print("Metri daxil edin: ");
                    double metr = sc.nextDouble();
                    double fut = metr * 3.28084;
                    System.out.println("Netice: " + fut);
                    break;

                case 2:
                    System.out.print("Kiloqrami daxil edin: ");
                    double kiloqram = sc.nextDouble();
                    double funt = kiloqram * 2.20462;
                    System.out.println("Netice: " + funt);
                    break;

                case 3:
                    System.out.print("Selsini daxil edin: ");
                    double selsi = sc.nextDouble();
                    double fahrenheit = (selsi * 9 / 5) + 32;
                    System.out.println("Netice: " + fahrenheit);
                    break;

                case 0:
                    System.out.println("Cixis edildi");
                    break;

                default:
                    System.out.println("Yanlis secim");
            }

        }
    }
}
