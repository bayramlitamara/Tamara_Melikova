package Homework7;
import java.util.Scanner;
public class Tapsiriq3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int stok = 200;

        while (true)  {
            System.out.println(" Emeliyyati daxil et: ");
            int emeliyyat = sc.nextInt();

            if (emeliyyat == 0)  {
                break;
            }
            stok = stok + emeliyyat;
            System.out.println("Yeni stok: " + stok);
        }
    }
}
