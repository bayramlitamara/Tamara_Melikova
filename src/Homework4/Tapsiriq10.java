package Homework4;
import java.util.Scanner;
public class Tapsiriq10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ad ve soyad daxil edin: ");
        String adSoyad = sc. nextLine();


        System.out.print("Yasi daxil edin: ");
        int yas = sc.nextInt();

        sc.nextLine();

        System.out.print("Illik geliri daxil edin: ");
        String gelirMetn = sc.nextLine();

        double gelir = Double.parseDouble(gelirMetn);

        boolean adDuzgundur = adSoyad.contains(" ") && adSoyad.length() > 5;
        boolean yasDuzgundur = yas >= 18 && yas <= 70;
        boolean gelirDuzgundur = gelir >= 3000;

        boolean netice = adDuzgundur && yasDuzgundur && gelirDuzgundur;

        System.out.printf("Ad-Soyad: %s%n", adSoyad.toUpperCase());
        System.out.printf("Yas: %d%n", yas);
        System.out.printf("Illik gelir: %.2f%n", gelir);
        System.out.printf("Muraciet neticesi: %b%n", netice);

        }

    }

