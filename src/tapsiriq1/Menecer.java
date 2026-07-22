package tapsiriq1;

public class Menecer extends  Isci{
    int komandaSayi;

    public Menecer (String ad, int komandaSayi) {
        super (ad);
        this.komandaSayi = komandaSayi;
    }

    public void  melumatGoster() {
        System.out.println("Menecerin adi: " + ad);
        System.out.println("Komanda sayi: " + komandaSayi);
    }
}
