package Homework4;
import java.util.Scanner;
public class Tapsiriq8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Celcius derecesini daxil edin: ");
        int c = sc.nextInt();

        double f1 = c * 9 / 5 + 32;
        double f2 = c* 9.0 / 5 +32;

        System.out.println("Int bolme ile : " + f1);
        System.out.println("Double bolme ile : " + f2);

        // 9 / 5 = 1 (int bolme)
        // 9.0 / 5 = 1.8 (double bolme)
        // Buna gore ikinci variant duzgun netice verir.
    }
}
