package Homework4;
import java.util.Scanner;
public class Tapsiriq4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Birinci ededi daxil edin: ");
        int a = sc.nextInt();

        System.out.print("Ikinci ededi daxil edin: ");
        int b = sc.nextInt();

        System.out.println("Evvel:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a + b;
        System.out.println("1-ci addimdan sonra: a = " + a + ", b = " + b);

        b = a - b;
        System.out.println("2-ci addimdan sonra: a = " + a + ", b = " + b);

        a = a - b;
        System.out.println("3-cu addimdan sonra: a = " + a + ", b = " + b);

        System.out.println("Netice:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
