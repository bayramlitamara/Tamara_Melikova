package polymorphism;

public class MainBildiris {

    public static void main(String[] args) {
        Bildiris[] bildirisler = new Bildiris[3];
        bildirisler[0] = new EmailBildiris();
        bildirisler[1] = new SmsBildiris();
        bildirisler[2] = new PushBildiris();

        for (Bildiris bildiris : bildirisler) {
            bildiris.mesajGonder("Sabahki toplantı saat 10:00-dadır.");
        }
    }
}
