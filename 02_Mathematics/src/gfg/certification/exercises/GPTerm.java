package gfg.certification.exercises;

import java.util.Scanner;

/**
 * GP Term
 * Given the first 2 terms A and B of a Geometric Series. The task is to find the Nth term of the series.
 *
 * Example 1:
 *
 * Input:
 * A = 2
 * B = 3
 * N = 1
 * Output: 2
 * Explanation: The first term is already
 * given in the input as 2
 * Example 2:
 *
 * Input:
 * A = 1
 * B = 2
 * N = 1
 * Output: 2
 * Explanation: Common ratio = 2,
 * Hence second term is 2.
 *
 * Expected Time Complexity : O(logN)
 * Expected Auxilliary Space : O(1)
 *
 * Constraints:
 * -100 <= A <= 100
 * -100 <= B <= 100
 * 1 <= N <= 5
 */

public class GPTerm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            GPTerm obj = new GPTerm();
            int A,B;
            A=sc.nextInt();
            B=sc.nextInt();
            int N;
            N=sc.nextInt();
            System.out.println((int)Math.floor(obj.termOfGP(A,B,N)));
        }
    }
    public double termOfGP(int A,int B,int N)
    {
        if(A>= -100 && A <= 100 && B >=-100 && B <= 100){
            if(N >=1 && N <=5){
                if(N == 1)
                    return A;
                if(N == 2)
                    return B;
                return A * Math.pow((double)B/A,N-1);
            }
        }
        return 0.0d;
    }
}
