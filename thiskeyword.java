import java.util.*;

class detail {
    int roll;
    String name;

    detail(int roll, String name) {
        this.roll = roll;
        this.name = name;

    }

    void display() {
        System.out.println(roll + " " + name);
    }
}

public class thiskeyword {

    public static void main(String args[]) {
        detail s1 = new detail(1, "dhruv");
        detail s2 = new detail(2, "hiya");

        s1.display();
        s2.display();
    }

}
