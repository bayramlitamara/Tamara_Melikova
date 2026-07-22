package tapsiriq6;

public abstract class Sened {

    String basliq;

    public Sened(String basliq) {
        this.basliq = basliq;
        System.out.println("Sened yaradildi: " + basliq);
    }

    public abstract void capEt();

}
