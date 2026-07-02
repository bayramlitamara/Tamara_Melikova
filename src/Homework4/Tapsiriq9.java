package Homework4;
import java.util.Scanner;
public class Tapsiriq9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Email daxil edin: " );
        String email = sc.next();

        boolean atVar = email.contains("@");
        boolean noqteVar = email.contains(".");
        boolean ikiSimvol = email.indexOf("@") >= 2;

        System.out.println("@ varmi: " + atVar);
        System.out.println(". varmi: " + noqteVar);
        System.out.println("@-den evvel en azi 2 simvol varmi: " + ikiSimvol);
       }
    }
