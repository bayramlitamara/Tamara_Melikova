package Homework8;
import java.util.Scanner;
public class Tapsiriq11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] orijinal = {5, 10, 15, 20};

        int[] c = new int[orijinal.length];
        for (int i = 0; i < orijinal.length; i++) {
            c[i] = orijinal[i];
        }
        c[0] = 99;
        System.out.print("Original massiv: ");
        for (int eded : orijinal) {
            System.out.print(eded + " ");
        }
        System.out.println();
        System.out.print("Kopya massiv: ");
        for (int eded : c) {
            System.out.print(eded + " ");

        }
    }
}
