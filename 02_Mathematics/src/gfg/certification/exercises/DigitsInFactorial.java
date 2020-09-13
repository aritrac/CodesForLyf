package gfg.certification.exercises;

import java.util.Scanner;

/**
 * Digits In Factorial
 * Given an integer N. The task is to find the number of digits that appear in its factorial,
 * where factorial is defined as, factorial(n) = 1*2*3*4……..*N and factorial(0) = 1.
 *
 * Example 1:
 *
 * Input:
 * N = 5
 * Output: 3
 * Explanation: Factorial of 5 is 120.
 * Number of digits in 120 is 3 (1, 2, and 0)
 * Example 2:
 *
 * Input:
 * N = 120
 * Output: 199
 * Explanation: The number of digits in
 * 200! is 199
 *
 * Expected Time Complexity : O(N)
 * Expected Auxilliary Space : O(1)
 *
 * Constraints:
 * 1 ≤ N ≤ 104
 */
public class DigitsInFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            DigitsInFactorial obj = new DigitsInFactorial();
            int N;
            N = sc.nextInt();
            System.out.println(obj.digitsInFactorial(N));
        }
    }
    public int digitsInFactorial(int N)
    {
        if(N < 0)
            return -1;
        if(N < 1)
            return 1;
        double digits = 0;
        if(N >= 1 && N <= 10000){
            for(int i = 2; i <= N; i++){
                digits += Math.log10(i);
            }
        }
        return (int)Math.floor(digits + 1);
    }
}
