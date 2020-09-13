package gfg.certification.exercises;

import java.util.Scanner;

/**
 * Factorial Of Number
 * Given a positive integer N. The task is to find factorial of N.
 *
 * Example 1:
 *
 * Input:
 * N = 4
 * Output: 24
 * Explanation: 4! = 4 * 3 * 2 * 1 = 24
 * Example 2:
 *
 * Input:
 * N = 13
 * Output: 6227020800
 * Explanation:
 * 13! = 13 * 12 * .. * 1 = 6227020800
 * Your Task:
 * You don't need to read input or print anything. Your task is to complete the function factorial() that takes N as parameter and returns factorial of N.
 *
 * Expected Time Complexity : O(N)
 * Expected Auxilliary Space : O(1)
 *
 * Constraints:
 * 0 <= N <= 18
 */

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            FactorialOfNumber obj = new FactorialOfNumber();
            int N;
            N = sc.nextInt();
            System.out.println(obj.factorial(N));
        }
    }

    public long factorial(int N){
        if(N < 0 || N > 18)
            return -1;
        long result = 1;
        while(N > 0) {
            result = result * N;
            N--;
        }
        return result;
    }
}
