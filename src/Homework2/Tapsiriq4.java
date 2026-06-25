package Homework2;

public class Tapsiriq4 {
    public static void main(String[] args) {
        int a = 15;
        int b = 40;

        System.out.println("Əvvəl: a=" + a + ", b=" + b);

        int temp = a;


        a = b;


        b = temp;

        System.out.println("Sonra: a=" + a + ", b=" + b);
    }
}
