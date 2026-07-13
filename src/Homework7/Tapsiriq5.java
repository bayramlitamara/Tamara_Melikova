package Homework7;
import java.util.Scanner;
public class Tapsiriq5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double qiymet = 1000;
        double faiz = 8;
        int il = 0;

        while (qiymet < qiymet* 2)  {
            qiymet = qiymet + qiymet * 8 / 100;
            il = il + 1;
            System.out.println("Il " + il + " : " + qiymet + " AZN");
        }
        System.out.println("Qiymetin ikiqatina catmasi ucun: " + il + "il lazim oldu");
    }
}
