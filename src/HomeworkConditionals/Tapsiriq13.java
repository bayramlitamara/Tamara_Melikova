package HomeworkConditionals;
import java.util.Scanner;
public class Tapsiriq13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Cekinizi daxil edin: ");
        double ceki = sc.nextDouble();

        System.out.print("Boyunuzu daxil edin: ");
        double boy = sc.nextDouble();

        double bmi = ceki / (boy * boy);
                System.out.println("BMI = " + bmi);

        if (bmi < 18.5) {
            System.out.println("Ariq");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Normal");
        } else if (bmi >= 25 && bmi <= 29.9)  {
            System.out.println("Artiq cekili");
        } else {
            System.out.println("Piylenme");

            //BMI-ni hesablayib hansi kateqoriyay aid oldugunu tapiriq.
        }
    }
}

