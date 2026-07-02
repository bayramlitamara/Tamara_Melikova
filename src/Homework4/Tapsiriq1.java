package Homework4;
import java.util.Scanner;
public class Tapsiriq1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Birinci ededi daxil edin: ");
        int a = sc.nextInt();

        System.out.print("Ikinci ededi daxil edin: ");
        int b = sc.nextInt();

        System.out.println("Toplama: " + (a + b));
        System.out.println("Cixma: " + (a - b));
        System.out.println("Vurma: " + (a * b));
        System.out.println("Bolme: " + (a / b));
        System.out.println("Qaliq: " + (a % b));

        // int / int = int oldugu ucun kesr hissesi silinir.


    }
}
