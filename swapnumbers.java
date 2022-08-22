import java.io.*;

public class swapnumbers {
    public static void main(String args[]) {
        int x = 10;
        int y = 20;

        // before
        System.out.println("Before: x = " + x + "\ty = " + y);

        // swap
        x = x + y;
        y = x - y;
        x = x - y;

        // after
        System.out.println("After: x = " + x + "\ty = " + y);
    }
}