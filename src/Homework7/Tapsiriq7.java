package Homework7;
import java.util.Scanner;
public class Tapsiriq7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int gizliKod = 275;
        int cehd = 0;

        while (true)  {
            System.out.println("Texmin et: ");
            int texmin = sc.nextInt();
            cehd = cehd + 1;

            if (texmin < gizliKod) {
                System.out.println("Kicikdir");
            } else if (texmin > gizliKod)  {
                System.out.println("Boyukdur");
            } else  {

                System.out.println("Seyf acildi");
                break;
            }

        }
        System.out.println("Cehd sayi: " + cehd);
    }
}
