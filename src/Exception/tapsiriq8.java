package Exception;

import java.util.HashMap;
import java.util.Map;

public class tapsiriq8 {

    public static void main(String[] args) {

        HashMap<String, Integer> filiallar = new HashMap<>();

        filiallar.put("Xalqlar dostlugu", 120);
        filiallar.put("Ahmedli", 90);
        filiallar.put("Yasamal", 150);
        filiallar.put("Xetai", 75);

        System.out.println("Filial sayi: " + filiallar.size());

        for (Map.Entry<String, Integer> filial : filiallar.entrySet()) {
            System.out.println(filial.getKey() + "->" + filial.getValue());

        }
        filiallar.remove("Xetai");
        System.out.println("Baglanmadan sonra filial sayi: " + filiallar.size());
    }
}
