import java.io.*;

class number {
    static int num = 0;

    number() {
        num++;
        System.out.println(num);
    }
}

public class statickeyword2 {
    public static void main(String args[]) {
        number n1 = new number();
        number n2 = new number();
        number n3 = new number();
        number n4 = new number();
    }

}
