public class CountingMethods {

    public double addition(double a, double b) {
        return a + b;
    }

    public double subtraction(double a, double b) {
        return a - b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        return a / b;
    }


    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 6;

        CountingMethods count = new CountingMethods();

        System.out.println(count.multiplication(a, b));
        System.out.println(count.division(c, b));
    }
}