package HomeworkConditionals;
import java.util.Scanner;
public class Tapsiriq2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Birinci ededi daxil edin." );
        int a = sc.nextInt();
        System.out.print("Ikinci ededi daxil edin. ");
        int b = sc.nextInt();
        System.out.print("Ucuncu ededi daxil edin.");
        int c = sc.nextInt();

        int enBoyuk;
        int enKicik;

        // En boyuk ededi tapir

        if (a >= b && a >= c) {
            enBoyuk = a;
        } else if (b >= a && b>= c) {
            enBoyuk = b;
        } else {
            enBoyuk = c;
        }

        // En kicik ededi tapir
        if (a <= b && a <= c) {
            enKicik = a;
        } else if (b <= a && b <= c) {
            enKicik = b;
        } else {
            enKicik = c;
        }

        System.out.println(" En boyuk: " + enBoyuk);
        System.out.println(" En kicik: " + enKicik);

        //Uc eded arasindan en boyuk ve en kicik ededi mueyyen edir

    }
}
