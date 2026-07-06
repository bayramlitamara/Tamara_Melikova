package HomeworkConditionals;
import java.util.Scanner;
public class Tapsiriq11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Bir herf daxil edin: ");
        char herf = sc.next().charAt(0);

        switch (herf)  {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'İ':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                System.out.println("Sait");
                break;
            default:
                System.out.println("Samit");

                // Daxil edilen herfin sait ve ya samit oldugunu mueyyen edirik

        }
    }
}
