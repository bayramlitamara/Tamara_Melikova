public class tapsiriq17 {
    public static void main(String[] args) {

        String s1 = "test";
        String s2 = "test";
        String s3 = "TEST";

        System.out.println(s1.equals(s2));              // true
        System.out.println(s1.equals(s3));              // false
        System.out.println(s1.equalsIgnoreCase(s3));    // true
        System.out.println(s1.equals(" test ".trim())); // true

        String s4 = new String("test");

        System.out.println(s1 == s2); // true
        System.out.println(s1 == s4); // false

        // equals() mətni müqayisə edir.
        // == yaddaşı müqayisə edir.
    }
}