package inheritance;

public class EmanetHesabi extends Hesab{

    private double faizDereceesi;

    public EmanetHesabi(String sahibiAdi, double balans, double faizDereceesi) {
        super(sahibiAdi, balans);
        this.faizDereceesi = faizDereceesi;
    }

    public void faiziTetbiqEt() {
        double faiz = getBalans() * faizDereceesi;
        balansArtir(faiz);
        System.out.println("Tətbiq olunan faiz: " + faiz);
    }
}

