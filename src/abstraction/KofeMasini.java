package abstraction;

public class KofeMasini {

    public void kofeHazirla() {
        suQizdir();
        kofeTok();
        fincaniDoldur();
        System.out.println("Kofeniz hazırdır, nuş olsun!");
    }

    private void suQizdir() {
        System.out.println("Su qızdırılır");
    }

    private void kofeTok() {
        System.out.println("Kofe tökülür");
    }

    private void fincaniDoldur() {
        System.out.println("Fincan doldurulur");
    }
}

