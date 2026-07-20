package encapsulation;

public class mainTelefon {

    public static void main (String[] args) {

        Telefon telefon = new Telefon(50);
        System.out.println("İlkin faiz: " + telefon.getBatareyaFaizi());

        telefon.setBatareyaFaizi(75);
        System.out.println("Yeni faiz: " + telefon.getBatareyaFaizi());

        telefon.setBatareyaFaizi(-10);
        System.out.println("Cari faiz: " + telefon.getBatareyaFaizi());

        telefon.setBatareyaFaizi(150);
        System.out.println("Cari faiz: " + telefon.getBatareyaFaizi());

        telefon.setBatareyaFaizi(100);
        System.out.println("Son faiz: " + telefon.getBatareyaFaizi());
    }
}




