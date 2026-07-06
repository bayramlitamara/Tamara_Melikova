package HomeworkConditionals;
import java.util.Scanner;
public class Tapsiriq10 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("1 - Balansi yoxla");
    System.out.println("2 - Pul yatir");
    System.out.println("1 - Pul cixar");
    System.out.println("1 - Cixis");

    System.out.print("Seciminizi daxil edin (1-4): ");
    int secim = sc.nextInt();

    switch (secim)  {
        case 1:
            System.out.println("Balansiniz 1250 AZN");
            break;
        case 2:
            System.out.println("Pul yatirma emeliyyati secildi");
            break;
        case 3:
            System.out.println("Pul cixarma emeliyyati secildi");
            break;
        case 4:
            System.out.println("Cixis edildi");
            break;
        default:
            System.out.println("Yanlis secim");

            // Istifadecinin secimine uygun bank menyusunu gosterir
    }
}
}
