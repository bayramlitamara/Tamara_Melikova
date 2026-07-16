package Homework8;
import java.util.Scanner;
public class Tapsiriq3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int eded;

        do {
            System.out.print("Eded daxil et: ");
            eded = sc.nextInt();

            if (eded <= 0)  {
                System.out.println("Yeniden daxil et: ");
        }

        }  while (eded <= 0);
        System.out.println("Qebul edildi: " + eded);
    }
}
