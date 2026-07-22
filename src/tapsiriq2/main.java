package tapsiriq2;

public class main {
    public static  void main(String[] args) {
        Bildiris bildiris = new Bildiris();
        EmailBildiris emailBildiris = new EmailBildiris();
        TeciliEmailBildiris teciliEmailBildiris = new TeciliEmailBildiris();

        System.out.println("Bildiris: ");
        bildiris.gonder();

        System.out.println();

        System.out.println("Email bildirisi: ");
        emailBildiris.gonder();

        System.out.println();

        System.out.println("Tecili email bildirisi: ");
        teciliEmailBildiris.gonder();
    }
}
