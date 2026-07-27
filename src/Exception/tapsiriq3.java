package Exception;

public class tapsiriq3 {

    public static void kocurmeEt(double mebleg)  {

        if (mebleg <= 0) {
            throw new IllegalArgumentException(
                    "Mebleg sifir ve ya menfi ola bilmez"
            ) ;
        }
        System.out.println("kocuruldu: " + mebleg + " AZN");
    }

    public static void main (String[] args) {

        try {
            kocurmeEt(500);
            kocurmeEt(-100);
        } catch (IllegalArgumentException e) {
            System.out.println("Xeta: " + e.getMessage());
        }
    }
}
