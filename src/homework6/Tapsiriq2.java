package homework6;
import java.util.Scanner;
public class Tapsiriq2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cem = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ". telebenin balini daxil edin: ");
            int bal = sc.nextInt();
            cem = cem + bal;
        }

            double ortaBal = (double) cem / 10;

            System.out.println("Cem: " + cem);
            System.out.println("Orta bal: " + ortaBal);

            if (ortaBal > 70) {
                System.out.println("Sinif ugurludur");
            } else {
                System.out.println("Elave ise ehtiyac var");
        }
    }
}
