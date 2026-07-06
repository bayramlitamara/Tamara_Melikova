package HomeworkConditionals;
import java.util.Scanner;
public class Tapsiriq5 {
    public static void main(String[] args) {

        // Gün nömrəsinə əsasən günün adını və həftə sonu olub-olmadığını göstərir.

        Scanner sc = new Scanner(System.in);

        System.out.print("1-7 arası gün nömrəsini daxil edin: ");
        int gun = sc.nextInt();

        switch (gun) {
            case 1:
                System.out.println("Bazar ertəsi");
                break;

            case 2:
                System.out.println("Çərşənbə axşamı");
                break;

            case 3:
                System.out.println("Çərşənbə");
                break;

            case 4:
                System.out.println("Cümə axşamı");
                break;

            case 5:
                System.out.println("Cümə");
                break;

            case 6:
                System.out.println("Şənbə");
                System.out.println("Həftə sonu!");

            case 7:
                System.out.println("Bazar");
                System.out.println("Həftə sonu!");
                break;

            default:
                System.out.println("Yanlış gün nömrəsi!");

                // 6 və 7-ci günler ucun fall-through tetbiq edilerek hefte sonu mesaji gosterildi
        }


    }
}
