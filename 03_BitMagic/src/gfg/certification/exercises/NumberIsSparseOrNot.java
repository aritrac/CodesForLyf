package gfg.certification.exercises;

/**
 * Given a number N. The task is to check whether it is sparse or not. A number is said to be a sparse number if no
 * two or more consecutive bits are set in the binary representation.
 *
 * Example 1:
 *
 * Input: N = 2
 * Output: true
 * Explanation: Binary Representation of 2 is 10,
 * which is not having consecutive set bits.
 * So, it is sparse number.
 * Example 2:
 *
 * Input: N = 3
 * Output: false
 * Explanation: Binary Representation of 3 is 11,
 * which is having consecutive set bits in it.
 * So, it is not a sparse number.
 *
 * Your Task: The task is to complete the function checkSparse() that takes n as a parameter and returns true if the
 * number is sparse else returns false.
 *
 *
 * Expected Time Complexity: O(log N).
 * Expected Auxiliary Space: O(1).
 *
 * Constraints:
 * 1 <= N <= 10^6
 */

public class NumberIsSparseOrNot {
    public static void main(String[] args) {
        System.out.println("Is 2 a sparse number ? " + isSparse(2));
        System.out.println("Is 3 a sparse number ? " + isSparse(3));
        System.out.println("Is 41 a sparse number ? " + isSparse(41));
        System.out.println("Is 24 a sparse number ? " + isSparse(24));
    }

    public static boolean isSparse(int n){
        boolean toggle = false;
        while(n > 0){
            if((n & 3) == 3)
                return false;
            n = n >> 1;
        }
        return true;
    }
}
