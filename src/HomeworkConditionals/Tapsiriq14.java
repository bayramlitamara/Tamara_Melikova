package HomeworkConditionals;
import java.util.Scanner;
public class Tapsiriq14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ay daxil edin: ");
        int ay = sc.nextInt();

        switch (ay)  {
            case 1:
            case 2:
            case 3:
                System.out.print("I rub");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("II rub");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("III rub");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("IV rub");
                break;
            default:
                System.out.println("Yanlis ay nomresi");

                // Ay nömrəsinə görə hansi rüb oldugunu tapiriq.
                }


        }
    }

