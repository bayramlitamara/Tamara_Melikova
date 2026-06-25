package Homework2;

public class Tapsiriq3 {
    public static void main(String[] args) {
        int     a = 8,  b = 3;
        boolean p = true, q = false;
        String  s = "QA";

        System.out.println(a + b);           // 11
        System.out.println(a - b * 2);      // 2
        System.out.println(a / b);           // 2
        System.out.println(a % b);           // 2
        System.out.println(p && q);          // false
        System.out.println(p || q);          // true
        System.out.println(!p && !q);        // false
        System.out.println(a > 5 || b > 5);  // true
        System.out.println(s + a + b);       // QA83
        System.out.println(a + b + s);       // 11QA


        // s + a + b → əvvəl String gəldiyi üçün 8 və 3 mətn kimi birləşir: QA83
        // a + b + s → əvvəl 8 + 3 hesablanır, sonra s ilə birləşir: 11QA
    }
}
