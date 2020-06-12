class Calculations {
    public static void main(String[] args) {
        MathOperations math1 = new MathOperations();


        boolean isEven = math1.isEven(2001);
        System.out.println(isEven);
        boolean isOdd = math1.isOdd(2001);
        System.out.println(isOdd);
        double circleField = math1.circleField(5);
        System.out.println(circleField);
        double power = math1.power(7);
        System.out.println(power);
    }
}

