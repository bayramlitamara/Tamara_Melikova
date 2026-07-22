package tapsiriq5;

public class main {
    public static void main(String[] args) {

        Depozit depozit = new Depozit();
        Kredit kredit = new Kredit();

        System.out.println("Depozit hesabi: ");
        depozit.balansGoster();
        depozit.faizHesabla();

        System.out.println();

        System.out.println("Kredit hesabi: ");
        kredit.balansGoster();
        kredit.faizHesabla();

    }
}
