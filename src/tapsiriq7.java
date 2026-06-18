public class tapsiriq7 {
    public static void main(String[] args) {
        double mebleg = 8000.0;
        double faiz = 15.0;
        int muddet = 12;
        double umumiFaiz = mebleg * (faiz/ 100);
        double umumiOdenis = mebleg + umumiFaiz;
        double ayliqOdenis = umumiOdenis / muddet;

        System.out.println("Ümumi faiz: " + umumiFaiz);
        System.out.println("Ümumi odenis: " + umumiOdenis);
        System.out.println("Aylıq ödəniş: " + ayliqOdenis);
    }
}
