package gfg.certification.examples;

/**
 * Finding out the nth fibonacci number
 */
public class NthFibonacciNumber {
    public static void main(String[] args) {
        System.out.println("The 5th Fibonacci number is " + fib(7));
    }

    static int fib(int n){
        if(n <= 1)
            return n;
        return fib(n-1) + fib(n-2);
    }
}
