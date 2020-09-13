package gfg.certification.exercises;

import java.util.Scanner;

/**
 * Primality Test
 * For a given number N check if it is prime or not. A prime number is a number which is only
 * divisible by 1 and itself.
 *
 * Example 1:
 *
 * Input:
 * N = 5
 * Output: Yes
 * Explanation: 5 is a prime number.
 * Example 2:
 *
 * Input:
 * N = 4
 * Output: No
 * Explanation: 4 is not a prime number.
 *
 * Expected Time Complexity : O(N^1/2)
 * Expected Auxilliary Space :  O(1)
 *
 * Constraints:
 * 1 <= N <= 10^9
 */
public class PrimeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            PrimeTest obj = new PrimeTest();
            int N;
            N = sc.nextInt();
            if(obj.isPrime(N))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
    public boolean isPrime(int N){
        if(N >= 1 && N <= 1000000000){
            if(N == 2 || N == 3)
                return true;
            if(N % 2 == 0 || N % 3 == 0)
                return false;
            for(int i = 5; i*i <= N; i+=6){
                if(N % i == 0 || N % (i+2) == 0)
                    return false;
            }
        }
        return true;
    }
}
