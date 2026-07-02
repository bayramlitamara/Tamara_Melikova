package Homework4;
import java.util.Scanner;
public class Tapsiriq2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Kredit meblegini daxil edin: ");
        double mebleg = sc.nextDouble();

        System.out.print("Illik faizi daxil edin: ");
        double faiz = sc.nextDouble();

        System.out.print("Müddəti (ay) daxil edin: ");
        int muddet = sc.nextInt();

        double umumiFaiz = mebleg * (faiz / 100);
        double umumiOdenis = mebleg + umumiFaiz;
        double ayliqOdenis = umumiOdenis / muddet;

        System.out.println("Ümumi faiz: " + umumiFaiz);
        System.out.println("Ümumi ödəniş: " + umumiOdenis );
        System.out.println("Aylıq ödəniş: " + ayliqOdenis );



    }
}
