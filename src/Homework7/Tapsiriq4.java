package Homework7;
import java.util.Scanner;
public class Tapsiriq4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("1-ci qaciscinin vaxti: ");
        int vaxt1 = sc.nextInt();
        System.out.print("2-ci qaciscinin vaxti: ");
        int vaxt2 = sc.nextInt();
        System.out.print("3-cu qaciscinin vaxti: ");
        int vaxt3 = sc.nextInt();

        int enAzVaxt = vaxt1;
        int qacisNomresi = 1;

        if (vaxt2 < enAzVaxt)  {
            enAzVaxt = vaxt2;
            qacisNomresi = 2;
        }
        if (vaxt3 < enAzVaxt)  {
            enAzVaxt = vaxt3;
            qacisNomresi = 3;
        }
        System.out.println("En suretli qacisci: "+ qacisNomresi);
        System.out.println("Vaxti: " + enAzVaxt + "saniye");
    }
}
