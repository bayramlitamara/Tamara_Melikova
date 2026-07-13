package Homework7;
import java.util.Scanner;
public class Tapsiriq2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("1-ci gunun satisi: ");
        double gun1 = sc.nextDouble();
        System.out.print("2-ci gunun satisi: ");
        double gun2 = sc.nextDouble();
        System.out.print("3-cu gunun satisi: ");
        double gun3 = sc.nextDouble();

        double umumiMebleg = gun1 + gun2 + gun3;
        double ortaSatis = umumiMebleg / 3;

         System.out.println("Umumi satis: " + umumiMebleg+ " AZN");
         System.out.println("Orta gundelik satis: " + ortaSatis + " AZN");

        if (ortaSatis > 500) {
             System.out.println("Hefte ugurludur");
         } else {
             System.out.println("Satisi artirmaq lazimdir");
         }
    }
}
