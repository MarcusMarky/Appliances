package test;

public class TestApp {
    public static void main(String[] args) {
        Test hTest = new HeatingTest();
        hTest.test();
        Test sTest = new SpinningTest();
        sTest.test();
    }
}
