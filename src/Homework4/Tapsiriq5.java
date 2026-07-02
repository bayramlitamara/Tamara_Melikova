package Homework4;
import java.util.Scanner;
public class Tapsiriq5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Bir int eded daxil edin: ");
        int a = sc.nextInt();

        double b = a;

        System.out.println("Widening neticesi: " + b);

        System.out.print("Bir double eded daxil edin: ");
        double c = sc.nextDouble();

        int d = (int) c;

        System.out.println("Narrowing neticesi: " + d);

        // (int) casting ondalıq hissəni yuvarlaqlaşdırmır, sadəcə kəsir.



    }
}
