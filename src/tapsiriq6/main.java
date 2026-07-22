package tapsiriq6;

public class main {
    public static void main(String[] args) {

        PDFSened pdfSened = new PDFSened("Muqavile");
        pdfSened.capEt();

        System.out.println();

        WordSened wordSened = new WordSened("Hesabat");
        wordSened.capEt();
    }
}
