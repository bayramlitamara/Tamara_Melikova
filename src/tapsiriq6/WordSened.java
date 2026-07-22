package tapsiriq6;

public class WordSened extends Sened{

    public WordSened(String basliq) {
        super(basliq);
    }
    @Override
    public void capEt() {
        System.out.println(basliq + "Word formatinda cap edildi");
    }
}
