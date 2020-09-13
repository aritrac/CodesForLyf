package gfg.certification.examples;

public class FactorialOfANumber {
    public static void main(String[] args) {
        System.out.println("Factorial of 5 = " + factorial(5));
        System.out.println("Factorial of 5 = " + factorialRecursive(5));
    }

    static int factorial(int n){
        int result = 1;
        while(n > 0) {
            result = result * n;
            n--;
        }
        return result;
    }

    static int factorialRecursive(int n) {
        if (n == 0)
            return 1;
        return n * factorialRecursive(n-1);
    }
}
