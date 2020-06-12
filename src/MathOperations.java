import static java.lang.Math.pow;

class MathOperations {

    boolean isEven(int x) {
        return x % 2 == 0;
    }

    boolean isOdd(int x) {
        return x % 2 == 1;
    }

    double circleField(double a) {
        return Math.PI * a + pow(a, 2);
    }

    double power(double a) {
        return pow(a, 2);
    }
}