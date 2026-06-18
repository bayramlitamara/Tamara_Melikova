public class tapsiriq12 {
    public static void main(String[] args) {

        boolean a = true, b = false, c = true;

        System.out.println("a && b = " + (a && b));
        System.out.println("a && c = " + (a && c));
        System.out.println("a || b = " + (a || b));
        System.out.println("b || b = " + (b || b));
        System.out.println("!a = " + (!a));
        System.out.println("!b = " + (!b));
        System.out.println("a && !b = " + (a && !b));
        System.out.println("!a || b = " + (!a || b));
        System.out.println("(a || b) && c = " + ((a || b) && c));
        System.out.println("!(a && c) = " + (!(a && c)));
    }
}
