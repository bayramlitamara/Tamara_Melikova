package polymorphism;

public class MainKalkulyator {

    public static void main(String[] args) {
        Kalkulyator kalkulyator = new Kalkulyator();

        int neticeIki = kalkulyator.vur(4, 5);
        System.out.println("İki tam ədəd hasili: " + neticeIki);

        int neticeUc = kalkulyator.vur(2, 3, 4);
        System.out.println("Üç tam ədəd hasili: " + neticeUc);

        double neticeKesr = kalkulyator.vur(2.5, 3.2);
        System.out.println("İki kəsr ədəd hasili: " + neticeKesr);
    }
}

