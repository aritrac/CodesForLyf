package gfg.certification.exercises;

import java.util.Arrays;
import java.util.Scanner;

/**
 *Exactly 3 Divisors
 * Given a positive integer value N. The task is to find how many numbers less than or equal to N
 * have numbers of divisors exactly equal to 3.
 *
 * Example 1:
 *
 * Input:
 * N = 6
 * Output: 1
 * Explanation: The only number with
 * 3 divisor is 4.
 * Example 2:
 *
 * Input:
 * N = 10
 * Output: 2
 * Explanation: 4 and 9 have 3 divisors.
 *
 * Expected Time Complexity : O(N^1/2 * N^1/4)
 * Expected Auxilliary Space :  O(1)
 *
 * Constraints :
 * 1 <= N <= 10^9
 */
public class Exactly3Divisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            Exactly3Divisors obj = new Exactly3Divisors();
            int N;
            N=sc.nextInt();
            System.out.println(obj.exactly3Divisors(N));
        }
    }
    //Basically we have to find all the prime numbers squares from 1 to N, so the factors would be of
    //such a number, [1,number itself, square root of the number]
    //So we will use sieve of eratosthenes to solve this
    public int exactly3Divisors(int N)
    {
        if(N <1 && N > 1000000000)
            return -1;
        boolean[] prime = new boolean[(int)Math.sqrt(N) + 1];
        Arrays.fill(prime,true);
        int count = 0;
        for(long i = 2; i * i <= N; i++) {
            if (prime[(int)i]) {
                count++;
                //set all multiples of i
                for (long j = i * 2; j * j <= N; j += i) {
                    prime[(int)j] = false;

                }
            }
        }
        return count;
    }
}
