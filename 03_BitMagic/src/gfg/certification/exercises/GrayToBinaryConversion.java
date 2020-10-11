package gfg.certification.exercises;

/**
 * Given N in Gray code equivalent. Find its binary equivalent.
 * Note: We need to find the binary equivalent of the given gray code and return the decimal equivalent of the binary
 * representation.
 *
 * Example 1:
 *
 * Input: N = 4
 * Output: 7
 * Explanation:
 * 4 is represented as gray 100 and its
 * binary equivalent is 111 whose decimal
 * equivalent is 7.
 * Example 2:
 *
 * Input: N = 15
 * Output: 10
 * Explanation:
 * 15 is represented as gray 1111 and its
 * binary equivalent is 1010 i.e. 10 in decimal.
 * Example 3:
 *
 * Input: N = 0
 * Output: 0
 * Explanation: Zero is zero in gray and in
 * binary and decimal.
 *
 * Your Task: Your task is to complete the function grayToBinary() which accepts an integer n as a parameter and returns
 * decimal of the binary equivalent of the given gray number.
 *
 * Expected Time Complexity: O(log N).
 * Expected Auxiliary Space: O(1).
 *
 * Constraints:
 * 0 <= N <= 108
 */
public class GrayToBinaryConversion {
    public static void main(String[] args) {
        System.out.println(grayToBinary(4));
        System.out.println(grayToBinary(15));
        System.out.println(grayToBinary(0));
    }

    public static int grayToBinary(int n){
        if(n == 0)
            return 0;
        int result = 0;
        int msb = 0;
        int temp = 0;
        while(temp < n){
            temp += (int)Math.pow(2,msb);
            msb++;
        }
        result = result | (1<<(msb-1)); //setting first bit
        msb--;
        while(msb > -1){
            if(((n >> msb) & 1) == 0){ // if current bit is 0, copy previous bit value
                if((result & (1<<(msb+1))) > 0) //if previous bit is 1
                    result = result | (1 << msb); //set next bit to 1
            }else{ //if current bit is 1 ,invert the previous bit and copy it to current bit
                if((result & (1<<(msb+1))) == 0)//get previous bit value
                    result = result | (1 << msb); //set next bit with inverse value of previous
            }
            msb--;
        }
        return result;
    }
}
