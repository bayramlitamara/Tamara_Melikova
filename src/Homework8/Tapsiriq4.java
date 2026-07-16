package Homework8;
import java.util.Scanner;
public class Tapsiriq4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int eded;
        int cem = 0;

        do {
            System.out.print("Eded daxil et: ");
            eded = sc.nextInt();

            cem = cem + eded;

        } while (eded != 0);
                System.out.println("Cem: " + cem);


        }
}
