
class Test {
    static int a = 10;
    static int b = 20;

    void changeB() {
        b = a * 3;
    }
}

class index {
    public static void main(String[] args) {
        Test t = new Test();
        t.changeB();
        System.out.println(Test.a + Test.b);
    }
}