package inheritance;

public class Developer extends Isci {

    public Developer(String ad) {
        super(ad);
    }

    public void kodYaz() {
        System.out.println(getAd() + " kod yazır və proqram hazırlayır.");
    }
}

