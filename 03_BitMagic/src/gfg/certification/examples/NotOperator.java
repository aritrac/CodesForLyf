package gfg.certification.examples;

/**
 *  java uses signed numbers hence
 *  any numbers complement will be found by the following formula
 *  2 ^(number of bits in data type) - x
 *
 *  So if we want to find the ~x and x = 1
 *  then we have to find the 2s compliment of x = 1
 *  0 0000000000000000000000000000001
 *  ~1 = ((2^32) - 1) - 1 because (2^32 - 1) is  the value when all 32 bits are set to 1
 *     = 2^32 - 2
 *     = -2
 *  ~5 = ((2^32) - 1) - 5
 *     = (2^32 - 6)
 *     = -6
 *
 * Find 2’s complement of binary number 10101110.
 *
 * Simply invert each bit of given binary number, which will be 01010001. Then add 1
 * to the LSB of this result, i.e., 01010001+1=01010010 which is answer.
 *
 */
public class NotOperator {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("~1 = " + (~x)); //output will be -2

        x = 5;
        System.out.println("~5 = " + (~x)); //output will be -6
    }
}
