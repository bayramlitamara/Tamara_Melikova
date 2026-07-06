package HomeworkConditionals;
import java.util.Scanner;
public class Tapsiriq8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Birinci tərəfi daxil edin: ");
        int a = sc.nextInt();

        System.out.print("İkinci tərəfi daxil edin: ");
        int b = sc.nextInt();

        System.out.print("Üçüncü tərəfi daxil edin: ");
        int c = sc.nextInt();

        // Üçbucağın mövcud olub-olmadığını yoxlamaq ucun
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Belə üçbucaq mövcud deyil.");
        }


        else if (a == b && b == c) {
            System.out.println("Bərabərtərəfli");
        }


        else if (a == b || a == c || b == c) {
            System.out.println("Bərabəryanlı");
        }


        else {
            System.out.println("Müxtəliftərəfli");

            // Ucbucagin mumkun olub olmadigini ve novunu mueyyen edir
        }
        }
    }

