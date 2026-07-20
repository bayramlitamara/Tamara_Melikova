package inheritance;

public class MainIsci {

    public static void main(String[] args) {
        Menecer menecer = new Menecer("Tamara");
        menecer.ozunuTeqdimEt();
        menecer.komandaniIdareEt();

        System.out.println("-----");

        Developer developer = new Developer("Vugar");
        developer.ozunuTeqdimEt();
        developer.kodYaz();
    }
}

