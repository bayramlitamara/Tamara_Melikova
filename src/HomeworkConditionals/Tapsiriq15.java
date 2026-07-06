package HomeworkConditionals;
import java.util.Scanner;
public class Tapsiriq15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Parolu daxil edin: ");
        String parol = sc.nextLine();

        int uzunluq = parol.length();

        if (uzunluq == 0)  {
            System.out.println("Parol bos ola bilmez");
        } else if (uzunluq < 6) {
            System.out.println("Zeif");
        } else if (uzunluq >= 6 && uzunluq <= 9 ) {
            System.out.println("Orta");
        } else {
            System.out.println("Guclu");
            // Parolun uzunlugunu yoxlayaraq onun zeif, orta ve ya guclu oldugunu tapiriq
        }
    }
}
