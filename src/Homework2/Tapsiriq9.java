package Homework2;

public class Tapsiriq9 {
    public static void main(String[] args) {

        String kod = "  abb-2024  ";

        System.out.println(kod.length());                    // 10 Boşluqlar da simvol sayılır
        System.out.println(kod.contains("ABB"));              // false  contains() böyük və kiçik hərfi fərqli qəbul edir.
        System.out.println(kod.trim() == "abb-2024");         // true String müqayisəsi üçün equals() istifadə olunur, == yox
        System.out.println(kod.toUpperCase().contains("ABB")); // true toUpperCase() bütün hərfləri böyük edir.
    }
}
