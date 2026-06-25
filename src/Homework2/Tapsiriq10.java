package Homework2;

public class Tapsiriq10 {
    public static void main(String[] args) {
        int    meblеg = 5000;
        int    faiz   = 15;
        double faizMeblegi = meblеg * faiz / 100;

        System.out.println("Faiz məbləği: " + faizMeblegi);
// Gözlənilən: 750.0   Əsl çıxış: double faizMeblegi = mebleg * faiz / 100.0;
    }
}
