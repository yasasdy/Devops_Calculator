package calculator;

public class Main {

    public static void main(String[] args){
        System.out.println("4 + 5 = " + add(4, 5));
        System.out.println("4 - 5 = " + subtract(4, 5));
        System.out.println("4 * 5 = " + multiply(4, 5));
        System.out.println("4 / 5 = " + divide(4, 5));
    }

    public static int add(int a, int b) {
        return a + b;
    }
    
    public static int subtract(int a, int b) {
        return a - b;
    }

    public static long multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        double result;
        if (b == 0) {
            throw new IllegalArgumentException("You cannot divide by zero");
        } else {
            result = Double.valueOf(a)/Double.valueOf(b);
        }
        return result;
    }
}