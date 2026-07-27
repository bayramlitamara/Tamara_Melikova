package Exception;
import java.util.ArrayList;
public class tapsiriq5 {

    public static void main(String[] args) {

        ArrayList<String>musteriNovbesi = new ArrayList<>();

        // Novbeye 4 musteri elave edirik
        musteriNovbesi.add("Tamara");
        musteriNovbesi.add("Vugar");
        musteriNovbesi.add("Mira");
        musteriNovbesi.add("Medine");

        // VIP musterini novbenin evveline elave edirik
        musteriNovbesi.add(0,"Ali");

        // Konkret adin siyahida olub-olmadigin yoxlayiriq
        String axtarilanAd = "Mira";

        if (musteriNovbesi.contains(axtarilanAd)) {
            System.out.println(axtarilanAd + " novbededir");
        } else {
            System.out.println(axtarilanAd + " novbede deyil");
        }
        // Novbedeki bir adi basqa adla evez edirik
        musteriNovbesi.set(3, "Leman");

        // Siyahidaki indeks ve ad formatinda cap edirik
        for (int i = 0; i < musteriNovbesi.size(); i++) {
            System.out.println(i + ": " + musteriNovbesi.get(i));
        }
    }
}
