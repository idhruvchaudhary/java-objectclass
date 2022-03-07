import java.io.*;

public class constructor1 {

    int id;
    String name;

    constructor1(int i, String n) {

        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String args[]) {
        constructor1 s1 = new constructor1(44, "dhruv");
        constructor1 s2 = new constructor1(45, "niraj");

        s1.display();
        s2.display();
    }

}
