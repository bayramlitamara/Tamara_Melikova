package tapsiriq4;

public class main {
    public static void main(String[] args) {

        Test[] testler = {
                new UITest(),
                new APITest(),
                new DBTest()
        };
        for (Test test : testler) {
            test.IcraEt();
        }
    }
}
