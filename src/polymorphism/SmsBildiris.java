package polymorphism;

public class SmsBildiris extends Bildiris {

    @Override
    public void mesajGonder(String mesaj) {
        System.out.println("SMS vasitəsilə göndərildi: " + mesaj);
    }
}

