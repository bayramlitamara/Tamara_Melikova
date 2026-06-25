package Homework2;

public class Tapsiriq8 {
    public static void main(String[] args) {
        int yas = 25;
        double gelir = 1200.0;
        boolean tarix = true;

// Kredit şərti: yaş 21-65, gəlir 800-dən çox, tarix true olmalı

        boolean yasUygun  = yas > 21 && yas < 65;   // ① nəticə: false — düzdürmü?
        boolean gelirUygun = gelir > 800;              // ② nəticə: true  — düzdürmü?
        boolean uygun      = yasUygun || gelirUygun || tarix; // ③ düzdürmü?

        System.out.println("Yaş uyğun:   " + yasUygun);
        System.out.println("Gəlir uyğun: " + gelirUygun);
        System.out.println("Kredit:      " + uygun);

      //  boolean yasUygun = yas >= 21 && yas <= 65; // 21 və 65 yaş da qəbul olunmalıdır.
        // boolean uygun = yasUygun && gelirUygun && tarix; // Kredit üçün bütün şərtlər eyni anda ödənməlidir, ona görə && istifadə olunur.
    }
}
