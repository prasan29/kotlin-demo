package kotlindemo;

public class Main {
    static Main mMain = new Main();

    public static void main(String[] args) {
        Main main = new Main();
        main.method();

//        mMain.method();
    }

    private void method() {
        method1();
    }

    private static void method1() {
        Main main = new Main();
        main.method();

        mMain.method();
    }

}
