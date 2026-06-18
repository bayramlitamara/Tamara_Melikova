public class tapsiriq14 {
    public static void main(String[] args) {

        int n = 84;

        boolean cutdur = n % 2 == 0;
        boolean musbetdir = n > 0;
        boolean bolunur3 = n % 3 == 0;
        boolean bolunur7 = n % 7 == 0;
        boolean hem3hem7 = (n % 3 ==0) && (n % 7 == 0);
        boolean araliqdadir = (n > 10) && (n < 100);

        System.out.println("Cütdür: " + cutdur);
        System.out.println("Müsbətdir: " + musbetdir);
        System.out.println("3-ə bölünür: " + bolunur3);
        System.out.println("7-ə bölünür: " + bolunur7);
        System.out.println("Həm 3-ə, həm 7-ə bölünür: " + hem3hem7);
        System.out.println("10-dan böyük, 100-dən kiçikdir: " + araliqdadir);

    }
}
