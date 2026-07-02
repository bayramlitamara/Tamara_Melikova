package Homework4;
import java.util.Scanner;
public class Tapsiriq7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Double eded daxil edin: ");
        double eded = sc.nextDouble();

        int casting = (int) eded;
        long yuvarlaq = Math.round(eded);

        System.out.println("(int) casting: " +casting);
        System.out.println("Math.round(): " + yuvarlaq);




    }
}
