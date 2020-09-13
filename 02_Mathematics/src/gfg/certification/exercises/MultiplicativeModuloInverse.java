package gfg.certification.exercises;

import java.util.Scanner;

/**
 * Modular Multiplicative Inverse
 * Given two integers ‘a’ and ‘m’. The task is to find modular multiplicative inverse of ‘a’ under modulo ‘m’.
 * Note: Print the smallest modular multiplicative inverse.
 *
 * Example 1:
 *
 * Input:
 * a = 3
 * m = 11
 * Output: 4
 * Explanation: Since (4*3) mod 11 = 1, 4
 * is modulo inverse of 3. One might think,
 * 15 also as a valid output as "(15*3)
 * mod 11"  is also 1, but 15 is not in
 * ring {0, 1, 2, ... 10}, so not valid.
 * Example 2:
 *
 * Input:
 * a = 10
 * m = 17
 * Output: 12
 * Explanation: Since (12*10) mod 17 = 1,
 * 12 is the modulo inverse of 10.
 *
 * Expected Time Complexity : O(m)
 * Expected Auxilliary Space : O(1)
 *
 * Constraints:
 * 1 <= a <= 10^4
 * 1 <= m <= 10^4
 */

public class MultiplicativeModuloInverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            MultiplicativeModuloInverse obj = new MultiplicativeModuloInverse();
            int a,m;
            a = sc.nextInt();
            m = sc.nextInt();

            System.out.println(obj.modInverse(a,m));
        }
    }

    static int modInverse(int a, int m)
    {
        a = a % m;
        for (int x = 1; x < m; x++)
            if ((a * x) % m == 1)
                return x;
        return -1;
    }
}
