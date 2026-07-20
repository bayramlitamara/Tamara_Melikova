package polymorphism;

public class PushBildiris extends Bildiris {

    @Override
    public void mesajGonder(String mesaj) {
        System.out.println("Push bildirişi vasitəsilə göndərildi: " + mesaj);
    }
}

