package gfg.certification.exercises;

/**
 * You are given two numbers A and B. The task is to count the number of bits needed to be flipped to convert A to B.
 *
 * Example 1:
 *
 * Input: A = 10, B = 20
 * Output: 4
 * Explanation:
 * A  = 01010
 * B  = 10100
 * As we can see, the bits of A that need
 * to be flipped are 01010. If we flip
 * these bits, we get 10100, which is B.
 *
 * Example 2:
 *
 * Input: A = 20, B = 25
 * Output: 3
 * Explanation:
 * A  = 10100
 * B  = 11001
 * As we can see, the bits of A that need
 * to be flipped are 10100. If we flip
 * these bits, we get 11001, which is B.
 *
 * Your Task: The task is to complete the function countBitsFlip() that takes A and B as parameters and returns the
 * count of the number of bits to be flipped to convert A to B.
 *
 * Expected Time Complexity: O(log N).
 * Expected Auxiliary Space: O(1).
 *
 * Constraints:
 * 1 ≤ A, B ≤ 10^6
 */
public class BitDifference {
    public static void main(String[] args) {
        System.out.println("The number of differing bits in 10 and 20 = " + countBitsFlip(10,20));
    }

    public static int countBitsFlip(int a,int b){
        int xor = a ^ b;
        int count = 0;
        while(xor > 0){
            count++;
            xor = xor&(xor-1);
        }
        return count;
    }
}
