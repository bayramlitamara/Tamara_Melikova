package tapsiriq2;

public class EmailBildiris extends Bildiris{

    @Override
    public void gonder() {
        super.gonder();
        System.out.println("Email bildirisi gonderildi");
    }
}
