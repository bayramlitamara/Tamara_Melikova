package tapsiriq6;

public class PDFSened extends Sened{

    public PDFSened(String basliq) {
        super(basliq);
    }
    @Override
    public void capEt() {
        System.out.println(basliq + " PDF formatinda cap edildi");
    }
}
