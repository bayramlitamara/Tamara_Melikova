package Exception;
import java.util.HashMap;
import java.util.Scanner;
public class tapsiriq7 {

    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> musteriler = new HashMap<>();

        musteriler.put("M001", "Tamara");
        musteriler.put("M002", "Vugar");
        musteriler.put("M003", "Mira");
        musteriler.put("M004", "Medine");

        System.out.print("Musteri kodunu daxil edin: ");
        String kod = scanner.nextLine();

        if (musteriler.containsKey(kod)) {
            System.out.println("Musteri adi: " + musteriler.get(kod));
        } else {
            System.out.println("Bele musteri tapilmadi");
        }
    }
}
