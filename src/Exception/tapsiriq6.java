package Exception;

import java.util.ArrayList;

public class tapsiriq6 {

    public static void main(String[] args) {

        ArrayList<Integer> emeliyyatlar = new ArrayList<>();

        emeliyyatlar .add(500);
        emeliyyatlar .add(200);
        emeliyyatlar .add(1000);
        emeliyyatlar .add(2500);
        emeliyyatlar .add(600);

        int cem = 0;

        for (int mebleg : emeliyyatlar) {
            cem = cem + mebleg;
        }
        System.out.println("Emeliyyatlarin umumi cemi: " + cem + " AZN");

        emeliyyatlar.clear();

        System.out.println("Siyahi bosdur: " + emeliyyatlar.isEmpty());

    }
}
