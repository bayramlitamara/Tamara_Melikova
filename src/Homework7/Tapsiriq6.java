package Homework7;
import java.util.Scanner;
public class Tapsiriq6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ucus kodunu daxil et: ");
        String kod = sc.nextLine();

        switch (kod)  {
            case "AZ":
                System.out.println("Azerbaijan Airlines");
                break;
            case "TK:":
                System.out.println("Turkish Airlines");
                break;
            case "QR":
                System.out.println("Qatar Airways");
                break;
            default:
                System.out.println("Kod tapilmadi");
        }

    }
}
