package inheritance;

public class MainHesab {

    public static void main(String[] args) {
        EmanetHesabi hesab = new EmanetHesabi("Vugar", 1000, 0.05);

        System.out.println("İlkin balans: " + hesab.getBalans());

        hesab.balansArtir(200);
        System.out.println("Mədaxildən sonra balans: " + hesab.getBalans());

        hesab.faiziTetbiqEt();
        System.out.println("Son balans: " + hesab.getBalans());
    }

}
