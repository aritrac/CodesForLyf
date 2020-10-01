package gfg.certification.exercises;

/**
 * Given two numbers M and N. The task is to find the position of the rightmost different bit in the binary
 * representation of numbers.
 *
 * Example 1:
 *
 * Input: M = 11, N = 9
 * Output: 2
 * Explanation: Binary representation of the given
 * numbers are: 1011 and 1001,
 * 2nd bit from right is different.
 *
 * Example 2:
 *
 * Input: M = 52, N = 4
 * Output: 5
 * Explanation: Binary representation of the given
 * numbers are: 110100â€¬ and 0100,
 * 5th-bit from right is different.
 * User Task:
 * The task is to complete the function posOfRightMostDiffBit() which takes two arguments m and n and returns
 * the position of first different bits in m and n. If both m and n are the same then return -1 in this case.
 *
 * Expected Time Complexity: O(max(log m, log n)).
 * Expected Auxiliary Space: O(1).
 *
 * Constraints:
 * 1 <= M <= 103
 * 1 <= N <= 103
 */
public class RightmostDifferentBit {
    public static void main(String[] args) {
        System.out.println("Position of the rightmost differing bit in 11 and 9 is " + posOfRightMostDiffBit(11,9));
        System.out.println("Position of the rightmost differing bit in 52 and 4 is " + posOfRightMostDiffBit(52,4));
    }

    public static int posOfRightMostDiffBit(int m, int n){
        int xor = m ^ n; //this result will have the right most bit set, where both the numbers differ
        int count = 0;
        while(xor > 0){
            if((xor & 1) > 0)
                return count + 1;
            xor = xor >> 1;
            count++;
        }
        return -1;
    }
}
