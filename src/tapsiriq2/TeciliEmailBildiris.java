package tapsiriq2;

public class TeciliEmailBildiris extends EmailBildiris{

    @Override
    public void gonder() {
        super.gonder();
        System.out.println("Tecili email bildirisi gonderildi");
    }
}
