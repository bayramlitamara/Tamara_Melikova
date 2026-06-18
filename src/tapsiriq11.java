public class tapsiriq11 {
    public static void main(String[] args) {

        int x = 18, y = 18, z = 25;

        boolean beraber = x == y;
        boolean beraber2 = x == z;
        boolean beraberDeyil = x != z;
        boolean boyuk = z > x;
        boolean boyukBeraber = x >= y;
        boolean kicikBeraber = y <= z;

        System.out.println("x == y -> " + (x == y));
        System.out.println("x == z -> " + (x == z));
        System.out.println("x != z -> " + (x != z));
        System.out.println("z > x -> " + (z > x));
        System.out.println("x >= y -> " + (x >= y));
        System.out.println("y <= z -> " + (y <= z));
    }
}
