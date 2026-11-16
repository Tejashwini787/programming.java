class Calculator {

    int calculate(int a, int b) {
        return a + b;
    }


    double calculate(double a, double b) {
        return a * b;
    }


    int calculate(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }


    double calculate(int a, double b) {
        return a - b;
    }
}

public class calmain {
    public static void main(String[] args) {
        Calculator calc = new Calculator();


        System.out.println("Sum of 5 and 10: " + calc.calculate(5, 10));
        System.out.println("Product of 2.5 and 4.0: " + calc.calculate(2.5, 4.0));
        System.out.println("Largest of 12, 45, and 23: " + calc.calculate(12, 45, 23));
        System.out.println("Difference of 20 and 5.5: " + calc.calculate(20, 5.5));
    }
}
