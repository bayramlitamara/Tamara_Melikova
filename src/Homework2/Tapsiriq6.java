package Homework2;

public class Tapsiriq6 {
    public static void main(String[] args) {
        final double PI = 3.14159;
        final int MAX_DENEME = 3;
        final String BANK_KODU = "ABB01";

        System.out.println("PI = " + PI);
        System.out.println("MAX_DENEME = " + MAX_DENEME);
        System.out.println("BANK_KODU = " + BANK_KODU);

       // PI = 3.14; // Error: Cannot assign a value to final variable 'PI'
       // MAX_DENEME = 5; // Error: Cannot assign a value to final variable 'MAX_DENEME'
        // BANK_KODU = "ACD05"; // Error: Cannot assign a value to final variable 'BANK_KODU'
    }
}
