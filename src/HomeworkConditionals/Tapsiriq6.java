package HomeworkConditionals;
import java.util.Scanner;
public class Tapsiriq6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Birinci ededi daxil edin: ");
        double eded1 = sc.nextDouble();

        System.out.print("Ikinci ededi daxil edin: ");
        double eded2 = sc.nextDouble();

        System.out.print("Emeliyyati daxil edin (+, -, *, /): ");
        String emeliyyat = sc.next();

        switch (emeliyyat) {
            case "+":
                System.out.println("Netice: " + (eded1 + eded2));
                break;
            case "-":
                System.out.println("Netice: " + (eded1 - eded2));
                break;
            case "*":
                System.out.println("Netice:" + (eded1 * eded2));
                break;
            case "/":
                if (eded2 == 0) {
                    System.out.println("0-a bolmek olmaz");
                } else {
                    System.out.println("Netice: " + eded1 / eded2);
                }
                break;
            default:
                System.out.println("Yanlis emeliyyat");

        }
// switch istifade ederek sade kalkulyator emeliyyatlari icra edildi
    }
}

