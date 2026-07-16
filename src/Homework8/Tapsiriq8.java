package Homework8;
import java.util.Scanner;
public class Tapsiriq8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] ballar = {67,91,54,88,73};

        int enBoyuk = ballar [0];

        for (int bal : ballar) {
            if (bal > enBoyuk) {
            enBoyuk = bal;
        }
    }
    System.out.println ("En boyuk bal: " + enBoyuk);

      }
}
