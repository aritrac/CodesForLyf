package gfg.certification.examples;

/**
 * Our task is to do sum of first n natural numbers
 */
public class SumOfFirstNNaturalNumbers {
    public static void main(String[] args) {
        System.out.println("Sum of first 5 natural numbers = " + sumOfFirstNNaturalNumbers(5));
        System.out.println("Sum of first 4 natural numbers = " + sumOfFirstNNaturalNumbersUsingFormula(4));
    }

    static int sumOfFirstNNaturalNumbers(int n){
        if(n <= 1)
            return n;
        return n + sumOfFirstNNaturalNumbers(n-1);
    }

    static int sumOfFirstNNaturalNumbersUsingFormula(int n){
        return (n*(n+1))/2;
    }
}
