package Homework8;
import java.util.Scanner;
public class Tapsiriq7 {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

        int[] ededler = {7,12,5,20,33,46,9};

        int say = 0;

        for (int eded : ededler) {

            if (eded % 2 == 0)  {
                say++;
            }

        }
        System.out.println("Cut ededlerin sayi: " + say);
    }
}
