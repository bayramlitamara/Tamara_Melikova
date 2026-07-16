package Homework8;
import java.util.Scanner;
public class Tapsiriq10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] ballar = {45,78,92,30,65,88};

        int min = ballar[0];
        int minIndex = 0;

        for (int i = 1; i < ballar.length; i++) {
            if (ballar[i] < min) {
                min = ballar[i];
                minIndex = i;
            }
        }
        System.out.println("En kicik bal: " + min);
        System.out.println("Indeksi: " + minIndex);
    }
}
