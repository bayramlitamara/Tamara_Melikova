package inheritance;

public class Menecer extends Isci {

    public Menecer(String ad) {
        super(ad);
    }

    public void komandaniIdareEt() {
        System.out.println(getAd() + " komandanı idarə edir və tapşırıqları bölüşdürür.");
    }
}
