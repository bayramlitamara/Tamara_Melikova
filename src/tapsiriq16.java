public class tapsiriq16 {
    public static void main(String[] args) {

        String metn = " Salam, ABB Bank! ";

        System.out.println("Uzunluq: " + metn.length());

        System.out.println("Trim sonra uzunluq: " + metn.trim().length());

        System.out.println("Boyuk herfle: " + metn.toUpperCase());

        System.out.println("Kicik herfle: " + metn.toLowerCase());

        System.out.println("ABB var? " + metn.contains("ABB"));

        System.out.println("bank var? " + metn.contains("bank"));

        System.out.println("Bank yerine Kredit: " +
                metn.replace("Bank", "Kredit"));

        System.out.println("Salam ile baslayir? " +
                metn.trim().startsWith("Salam"));
    }
}