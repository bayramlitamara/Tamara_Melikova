package Homework2;

public class Tapsiriq11 {
    public static void main(String[] args) {


        String parol = "Abb@2024";

        boolean uzunluq = parol.length() > 8;
        boolean xarakterVar = parol.contains("@");
        boolean abbIleBaslayir = parol.toUpperCase().startsWith("ABB");
        boolean reqemVar = parol.contains("2024");

        boolean gucluParol = uzunluq && xarakterVar && abbIleBaslayir && reqemVar;

        System.out.println("Uzunluq 8-dən çoxdur: " + uzunluq);
        System.out.println("@ simvolu var: " + xarakterVar);
        System.out.println("ABB ilə başlayır: " + abbIleBaslayir);
        System.out.println("2024 hissəsi var: " + reqemVar);
        System.out.println("Parol güclüdür: " + gucluParol);

        // Abb@2024 uzunluğu 8 simvoldur. o false olduğu üçün hamısı false olur
    }
}