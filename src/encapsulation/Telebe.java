package encapsulation;

public class Telebe {
    private String ad;
    private int bal;

    public Telebe(String ad, int bal) {
        this.ad = ad;
        setBal(bal);
    }
    public void setBal (int bal) {
        if (bal >= 0 && bal <= 100) {
            this.bal = bal;
        } else {
            System.out.println("Xeta: Bal 0-100 araliginda olmalidir! Daxil edilen deyer: " + bal);
        }
    }
    public int getBal() {
        return bal;
    }
    public String getAd() {
        return ad;
    }
    public String getQiymet() {
        if (bal >= 90) {
            return "Ela";
        } else if (bal >= 70) {
            return  "Yaxsi";
        } else if (bal >=50) {
            return  "Kafi";
        } else {
            return  "Qeyri-kafi";
        }
    }
    public  String melumatGoster() {
        return "Ad: " + ad + ", Bal: " + bal + ", Qiymet: " + getQiymet();
    }
}
