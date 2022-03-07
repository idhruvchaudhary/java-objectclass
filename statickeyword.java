import java.io.*;

class student {

    int roll;
    String name;
    static String college;

    student(int r, String n) {
        roll = r;
        name = n;
    }

    void display() {
        System.out.println(roll + " " + name + " " + college);
    }
}

public class statickeyword {

    public static void main(String args[]) {

        student s1 = new student(1, "dhruv");
        student s2 = new student(2, "hiya");

        s1.display();
        s2.display();

    }

}
