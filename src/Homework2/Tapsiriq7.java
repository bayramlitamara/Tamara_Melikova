package Homework2;

public class Tapsiriq7 {
    public static void main(String[] args) {
        double temp = 36.8;
        boolean temperaturNormaldir = temp > 36 && temp < 37.5;
        System.out.println(temperaturNormaldir);

        int suret = 95;
        int yanacaq = 0;
        boolean hereketEdeBiler = (suret > 0 && suret < 120) || (yanacaq > 0);
        System.out.println(hereketEdeBiler);

        boolean aktiv = false;
        double balans = -50.0;
        boolean hesabProblemlidir = !aktiv || balans < 0;
        System.out.println(hesabProblemlidir);

        String ad = "Anar";
        int yas = 22;
        boolean melumatDogrudur = ad.length() > 0 && yas > 18;
        System.out.println(melumatDogrudur);
    }
}
