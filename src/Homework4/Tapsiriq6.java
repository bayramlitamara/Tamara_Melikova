package Homework4;
import java.util.Scanner;
public class Tapsiriq6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ededi daxil edin: ");
        String ededMetn = sc.next();

        int eded = Integer.parseInt(ededMetn);
        eded= eded +24;

        String netice = String.valueOf(eded);

        System.out.println("Yeni eded: " + netice);
        System.out.println("Uzunlugu: " + netice.length());






     }

    }
