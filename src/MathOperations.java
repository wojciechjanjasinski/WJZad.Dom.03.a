import javax.swing.*;

import static java.lang.Math.pow;

class MathOperations {
    public static void main(String[] args) {
        double x = 7;
        double y = 8;
        double sum = x + y;
        if (x % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
        double d = Math.PI * x + pow(x, 2);
        System.out.println(d);
        double e = pow(y, 2);
        System.out.println(e);


    }
}