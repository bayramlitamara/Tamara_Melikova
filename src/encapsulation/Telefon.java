package encapsulation;

public class Telefon {
    private  int batareyaFaizi;

    public Telefon(int batareyaFaizi) {
        setBatareyaFaizi(batareyaFaizi);
    }

    public void setBatareyaFaizi(int faiz) {
        if (faiz >= 0 && faiz <= 100) {
            this.batareyaFaizi = faiz;
        } else {
            System.out.println("Xəta: Batareya faizi 0-100 aralığında olmalıdır! Daxil edilən dəyər: " + faiz);
        }
    }
    public int getBatareyaFaizi() {
        return batareyaFaizi;
    }
}