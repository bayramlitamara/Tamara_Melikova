package HomeworkConditionals;
import java.util.Scanner;
public class Tapsiriq1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print( "Tam eded daxil edin: ");
        int eded = sc.nextInt();

        // cut ve ya tek oldugunu yoxlayir
        if (eded % 2 == 0) {
            System.out.println("Eded cutdur.");
        } else {
            System.out.println("Eded tekdir. ");
        }

        // Musbet, menfi ve ya sifir oldugunu yoxlayir
        if (eded > 0) {
            System.out.println("Eded musbetdir. ");
        } else if (eded < 0) {
            System.out.println("Eded menfidir. ");
        } else {
            System.out.println("Eded sifirdir. ");

        }
    }
}
