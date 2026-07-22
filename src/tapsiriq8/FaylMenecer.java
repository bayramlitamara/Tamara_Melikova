package tapsiriq8;

public class FaylMenecer implements Yuklene, Endirile{

    @Override
    public void yukle() {
        System.out.println("Fayl yuklendi");

        }
    @Override
    public void endir() {
        System.out.println("Fayl endirildi");
    }
}
