package gfg.certification.exercises;

/**
 * Given a number N. The task is to find the length of the longest consecutive 1s in its binary representation.
 *
 * Example 1:
 *
 * Input: N = 14
 * Output: 3
 * Explanation: Binary representation of 14 is
 * 1110, in which 111 is the longest consecutive
 * set bits of length is 3.
 * Example 2:
 *
 * Input: N = 222
 * Output: 4
 * Explanation: Binary representation of 222 is
 * 11011110, in which 1111 is the longest
 * consecutive set bits of length 4.
 *
 * Your Task: The task is to complete the function maxConsecutiveOnes() which returns the length of the longest
 * consecutive 1s in the binary representation of given N.
 *
 * Expected Time Complexity: O(log N).
 * Expected Auxiliary Space: O(1).
 *
 * Constraints:
 * 1 <= N <= 10^6
 */
public class LongestConsecutiveOnes {
    public static void main(String[] args) {
        System.out.println("Longest consecutive ones in 14 = " + maxConsecutiveOnes(14));
        System.out.println("Longest consecutive ones in 222 = " + maxConsecutiveOnes(222));
        System.out.println("Longest consecutive ones in 21 = " + maxConsecutiveOnes(21));
        System.out.println("Longest consecutive ones in 85 = " + maxConsecutiveOnes(85));
        System.out.println("Longest consecutive ones in 778 = " + maxConsecutiveOnes(778));

    }

    public static int maxConsecutiveOnes(int x){
        int maxLength = -1;
        int currCount = 0;

        while(x > 0){
            if((x & 1) == 1){
                currCount++;
            }
            else if((x & 1) == 0){
                if(currCount > maxLength){
                    maxLength = currCount;
                }
                currCount = 0;
            }
            x = x >> 1;
        }
        if(currCount > maxLength)
            maxLength = currCount;
        return maxLength;
    }
}
