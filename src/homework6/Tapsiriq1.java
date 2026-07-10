package homework6;
import java.util.Scanner;
public class Tapsiriq1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Bali daxil edin (1-100): ");
        int bal = sc.nextInt();

         if (bal >= 90 && bal <= 100)     {
             System.out.println("Bal: " +bal + "-> Qiymet: Ela");
         } else if (bal >=70 && bal <= 89)  {
             System.out.println("Bal: " +bal + "-> Qiymet: Yaxsi");
         } else if (bal >= 50 && bal <= 69)  {
             System.out.println("Bal: " +bal + "-> Qiymet: Kafi");
         } else if (bal >= 1 && bal <= 49)  {
             System.out.println("Bal: " +bal + "-> Qiymet: Qeyri-kafi");
         } else {
             System.out.println("Yanlis bal daxil edilib");
         }
    }
}
