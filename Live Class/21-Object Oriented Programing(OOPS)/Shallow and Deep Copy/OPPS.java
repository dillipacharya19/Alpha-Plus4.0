public class OPPS {
    public static void main(String[] args) {
        // Create first student object using default constructor
        student s1 = new student();
        s1.roll = 455;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        // Create second student object using copy constructor (deep copy)
        student s2 = new student(s1);

        // Change s2 password (does not affect s1)
        s2.password = "xyz";

        // Change s1 marks (does not affect s2 because of deep copy)
        s1.marks[2] = 100;

        // Print s2 marks
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class student {
    int roll;
    String password;
    int marks[];

    // default constructor
    student() {
        marks = new int[3];
        System.out.println("constructor called....");
    }

    // parameterized constructor
    student(int roll, String password, int marks[]) {
        this.roll = roll;
        this.password = password;
        this.marks = marks;
    }

    // copy constructor (deep copy)
    student(student s) {
        marks = new int[3];
        this.roll = s.roll;
        this.password = s.password;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s.marks[i];
        }
    }
}