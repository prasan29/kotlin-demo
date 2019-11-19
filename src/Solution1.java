class Sample1 {
    private static Sample1 mInstance;

    private Sample1() {
        System.out.println("Sample1");
    }

    static Sample1 getInsance() {
        if (mInstance == null) {
            mInstance = new Sample1();
        }

        return mInstance;
    }

    void printValue() {
        System.out.println("Hello");
    }
}

public class Solution1 {
    public static void main(String[] args) {
        Sample1.getInsance().printValue();
    }
}
