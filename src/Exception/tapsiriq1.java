package Exception;
import java.util.Scanner;
public class tapsiriq1 {

    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);

        int umumiXerc = 1240;
        System.out.print("Emeliyyat sayini daxil edin: ");
        int emeliyyatSayi = scanner.nextInt();

        try {
            int ortaMebleg = umumiXerc / emeliyyatSayi;
            System.out.println("Orta emeliyyat meblegi: " + ortaMebleg + " AZN");
        } catch (ArithmeticException e) {
            System.out.println("Emeliyyat sayi sifir ola bilmez");
        } catch (Exception e) {
            System.out.println("Gozlenilmez xeta bas verdi");
        } finally {
            System.out.println("Hesabat tamamlandi");
        }
    }
}
