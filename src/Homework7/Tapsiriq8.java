package Homework7;
import java.util.Scanner;
public class Tapsiriq8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Yasi daxil et: ");
        int yas = sc.nextInt();
        int qiymet;

        if (yas >= 0 && yas <= 6) {
            qiymet = 0;
        } else if (yas >= 7 && yas <= 17) {
            qiymet = 2;
        } else if (yas >= 18 && yas <= 60) {
            qiymet = 5;
        } else {
            qiymet = 3;
        }
        System.out.println("Bir biletin qiymeti: " + qiymet + "AZN");

        System.out.print("Nece bilet alacaqsiniz?");
        int biletSayi = sc.nextInt();

        int umumiMebleg = qiymet * biletSayi;
        System.out.println("Umumi mebleg: " + umumiMebleg + "AZN");
    }
}
