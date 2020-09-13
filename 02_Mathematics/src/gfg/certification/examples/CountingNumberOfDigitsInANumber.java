package gfg.certification.examples;
/*
Count the number of digits in a number using various approaches
 */

public class CountingNumberOfDigitsInANumber {
    //Iterative Solution
    static int countDigit(long n){
        int count = 0;
        while(n != 0){
            n = n/10;
            ++count;
        }
        return count;
    }

    //Recursive Solution
    static int countDigitRecursive(long n){
        if(n == 0)
            return 0;
        return 1 + countDigitRecursive(n/10);
    }

    //Logarithmic solution
    static int countDigitLogarithmic(long n){
        return (int) Math.floor(Math.log10(n) + 1);
    }

    public static void main(String[] args) {
        long n = 123;
        System.out.println(countDigit(n));
        System.out.println(countDigitRecursive(n));
        System.out.println(countDigitLogarithmic(n));
    }
}
