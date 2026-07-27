package Exception;

public class tapsiriq4 {

    public static void nagdCixar (double mebleg)
        throws LimitKecildiException {

        double limit = 2000;

        if (mebleg > limit) {
            throw new LimitKecildiException(
                    "Gundelik nagd cixarma limiti kecildi"
            );
        }
        System.out.println("Nagd cixarildi: " + mebleg + " AZN");
    }
    public static void main (String[] args) {

        try {
            nagdCixar(1500);
            nagdCixar(2500);
        } catch (LimitKecildiException e) {
            System.out.println("Xeta: " + e.getMessage());
        }
    }
}
