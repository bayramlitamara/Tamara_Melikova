package HomeworkConditionals;
import java.util.Scanner;
public class Tapsiriq3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Imtahan balini daxil edin. ");
        int bal = sc.nextInt();

        if (bal >= 90 && bal <= 100) {
            System.out.println(" Ela (5)");
        } else if (bal >= 80 && bal <= 89) {
            System.out.println("Cox yaxsi (4)");
        } else if (bal >= 70 && bal <= 79) {
            System.out.println("Yaxsi (3 ");
        } else if (bal >= 60 && bal <= 69) {
            System.out.println(" Kafi (2)");
        } else if (bal >= 0 && bal <= 59) {
            System.out.println(" Qeyri kafi (1)");
        } else {
            System.out.println(" Yanlis bal");
        }
        // Bir nece sert odedndiyi ucuc else if sertinden istifade edilir.
    }
}
