package Homework8;
import java.util.Scanner;
public class Tapsiriq9 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int[] reqemler = new int[8];

        for (int i = 0; i < reqemler.length; i++) {
            reqemler[i] = (i + 1) * 10;
        }
        for (int reqem : reqemler) {
            System.out.print(reqem + " ");
        }
    }
}
