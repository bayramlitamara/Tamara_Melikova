package inheritance;

public class Hesab {
    private String sahibAdi;
    private double balans;

    public Hesab(String sahibiAdi, double balans) {
        this.sahibAdi = sahibiAdi;
        this.balans = balans;
    }

    public void balansArtir(double mebleg) {
        if (mebleg > 0) {
            balans += mebleg;
        } else {
            System.out.println("Xəta: Artırılan məbləğ müsbət olmalıdır!");
        }
    }

    public double getBalans() {
        return balans;
    }
    public String getSahibAdi() {
        return sahibAdi;
    }
}
