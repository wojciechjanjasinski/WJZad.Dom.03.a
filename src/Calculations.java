import javax.swing.*;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

class Calculations {
    public static void main(String[] args) {
        MathOperations math1 = new MathOperations();
        math1.x = 7;
        boolean isEven = math1.isEven(2001);
        System.out.println(isEven);
        boolean isOdd = math1.isOdd(2001);
        System.out.println(isOdd);

        double d = Math.PI * math1.x + pow(math1.x, 2);
        System.out.println(d);

        double e = pow(math1.x, 2);
        System.out.println(e);

    }
}

