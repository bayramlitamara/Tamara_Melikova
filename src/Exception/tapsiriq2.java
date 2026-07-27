package Exception;

public class tapsiriq2 {

    public static void main(String[] args)  {

        String kartSahibi = null;

        try {
            int simvolSayi = kartSahibi.length();
            System.out.println("Kart sahibinin adindaki simvol sayi: " + simvolSayi);
        } catch (NullPointerException e) {
            System.out.println("Kart melumati tapilmadi");
        } finally {
            System.out.println("Sessiya baglandi");
        }

        System.out.println("----------------");

        kartSahibi = "Tamara Melikova";

        try {
            int simvolSayi = kartSahibi.length();
            System.out.println("Kart sahibinin adindaki simvol sayi: " + simvolSayi);
        } catch (NullPointerException e) {
            System.out.println("Kart melumati tapilmadi");
        } finally {
            System.out.println("Sessiya baglandi");
        }
    }
}
