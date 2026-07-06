package HomeworkConditionals;
import java.util.Scanner;
public class Tapsiriq4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ili daxil edin. ");
        int il = sc.nextInt();
        boolean sert = (il % 4 == 0 && il % 100 != 0) || (il % 400 == 0);
        System.out.println(sert ? "Uygun ildir. " : "Uygun il deyil. ");

        //Daxil edilen ilin uygun olub olmadigini mueyyen edir
    }
}
