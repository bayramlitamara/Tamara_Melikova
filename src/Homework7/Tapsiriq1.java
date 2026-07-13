package Homework7;
import java.util.Scanner;
public class Tapsiriq1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Havanin tempraturunu daxil et: ");
        int derece = sc.nextInt();
        String status;
        if (derece > 25) {
            status = "Isti";
        } else if (derece >= 15 && derece <= 25) {
            status = "Mulayim";;
        } else if (derece <= 0 && derece <= 14) {
            status = "Soyuq";;
        } else {
            status = "Shaxta";;
        }

        System.out.println("Tempratur: " + derece + "C-> Status: " + status);
       }
    }

