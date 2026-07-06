package HomeworkConditionals;
import java.util.Scanner;
public class Tapsiriq7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Yasi daxil edin: ");
        int yas = sc.nextInt();

        System.out.print("Ayliq geliri daxil edin: ");
        double ayliqGelir = sc.nextDouble();

        System.out.print("Kredit meblegini daxil edin: ");
        double kreditMeblegi = sc.nextDouble();

        if (yas < 21 || yas > 65) {
            System.out.println("Rədd edildi: yaş uyğun deyil.");
        } else if (ayliqGelir <= 800) {
            System.out.println("Rədd edildi: gəlir uyğun deyil.");
        } else if (kreditMeblegi < 300 || kreditMeblegi > 50000) {
            System.out.println("Rədd edildi: kredit məbləği uyğun deyil.");
        } else {
            System.out.println("TƏSDİQ EDİLDİ");

            // Verilen sertlere esasen kreditin tesdiq ve ya redd edilmesini mueyyen edir
        }

            }
        }



