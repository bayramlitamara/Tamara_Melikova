public class tapsiriq9 {
    public static void main(String[] args) {

        int sayi = 583;

        int yuzler = sayi / 100;
        int onlar = (sayi % 100) / 10;
        int birler = sayi % 10;

        int cem = yuzler + onlar + birler;

        System.out.println("Yüzlər : " + yuzler);
        System.out.println("Onlar : " + onlar);
        System.out.println("Birlər : " + birler);
        System.out.println("Cəm : " + cem);

    }
}
