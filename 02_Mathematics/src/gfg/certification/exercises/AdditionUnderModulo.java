package gfg.certification.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Addition Under Modulo
 * You are given two numbers a and b. You need to find the sum of a and b under modulo M (M = 109+7)
 *
 * Example 1:
 *
 * Input:
 * a = 9223372036854775807
 * b = 9223372036854775807
 * Output: 582344006
 * Explanation: 9223372036854775807 +
 * 9223372036854775807 =
 * 18446744073709551614.
 * Now do (18446744073709551614) mod (10^9+7)
 * = 582344006
 * Example 2:
 *
 * Input:
 * a = 1000000007
 * b = 1000000007
 * Output: 0
 * Explanation: 1000000007 + 1000000007  =
 * (2000000014)mod(10^9+7) = 0
 *
 * Expected Time Complexity : O(1)
 * Expected Auxilliary Space :  O(1)
 *
 * Constraints:
 * 1 <= a,b <= 2^63-1
 */

public class AdditionUnderModulo {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while(t-- > 0){
            String[] str = read.readLine().trim().split(" ");
            Long a = Long.parseLong(str[0]);
            Long b = Long.parseLong(str[1]);

            System.out.println(new AdditionUnderModulo().sumUnderModulo(a,b));
        }
    }
    //( a + b ) % c = ( ( a % c ) + ( b % c ) ) % c
    //( a * b ) % c = ( ( a % c ) * ( b % c ) ) % c
    //( a – b ) % c = ( ( a % c ) – ( b % c ) ) % c
    public static long sumUnderModulo(long a, long b){
        int M = 1000000007;
        return ((a % M) + (b % M)) % M;
    }
}
