package polymorphism;

public class EmailBildiris extends Bildiris{

    @Override
    public void mesajGonder(String mesaj) {
        System.out.println("Email vasitəsilə göndərildi: " + mesaj);
    }
}

