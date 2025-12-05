
class Test {
    static int mark;

    void set_marks(int marks) {
        this.mark = marks;
    }
}

class index {
    public static void main(String[] args) {
        Test t = new Test();
        t.set_marks(98);

        System.out.println(Test.mark);
    }
}