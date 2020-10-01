package gfg.certification.exercises;

/**
 * Find first set bit
 * Given an integer an N. The task is to return the position of first set bit found from the right side in the binary
 * representation of the number.
 * Note: If there is no set bit in the integer N, then return 0 from the function.
 *
 * Example 1:
 *
 * Input: N = 18
 * Output: 2
 * Explanation: Binary representation of 18 is 010010,
 * the first set bit from the right side is at position 2.
 *
 * Example 2:
 *
 * Input: N = 12
 * Output: 3
 * Explanation: Binary representation of  12 is 1100,
 * the first set bit from the right side is at position 3.
 * Your Task:
 * The task is to complete the function getFirstSetBit() that takes an integer n as a parameter and returns
 * the position of first set bit.
 *
 * Expected Time Complexity: O(log N).
 * Expected Auxiliary Space: O(1).
 *
 * Constraints:
 * 0 <= N <= 106
 * 010010 18
 * 010001 17
 * 101110 ~17
 * 000010 18&~17 (will get the rightmost set bit)
 */
public class FindFirstSetBit {
    public static void main(String[] args) {
        System.out.println("The first set bit in 18 = " + findFirstSetBit(18));
        System.out.println("The first set bit in 12 = " + findFirstSetBit(12));
    }

    public static int findFirstSetBit(int n){
        int res = n & ~(n-1);
        int count = 0;
        while(res > 0){
            count++;
            res = res >> 1;
        }
        return count;
    }
}
