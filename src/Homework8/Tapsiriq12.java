package Homework8;
import java.util.Scanner;
public class Tapsiriq12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] cedvel = {{3, 6, 9},
                         {12, 15, 18}};

        for (int i = 0; i < cedvel.length; i++)
        {
            for (int j = 0; j < cedvel[i].length; j++)
            {

                System.out.print(cedvel[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Setir sayi: " + cedvel.length);
        System.out.println("Sutun sayi: " + cedvel[0].length);

    }
}
