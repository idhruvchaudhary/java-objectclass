import java.util.*;

class student {
    int roll;
    String name;
    static String college = "gecm";

    static void change() {
        college = "ms";
    }

    student(int r, String n) {
        name = n;
        roll = r;

    }

    void display() {
        System.out.println(roll + " " + name + " " + college);
    }
}

public class staticword1 {
    public static void main(String args[]) {
        student s1 = new student(1, "dhruv");
        student s2 = new student(2, "hiya");
        student s3 = new student(3, "jiya");

        s1.display();
        s2.display();
        s3.display();

    }

}
