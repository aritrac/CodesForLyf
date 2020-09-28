package gfg.certification.examples;

/**
 * If we assume that the leading y bits are zeroes, then the result of
 * (x << y) is equivalent to x * 2^y
 * like
 * 3 << 1 = 3 * 2^1 = 6
 * 3 << 2 = 3 * 2^2 = 12
 * 3 << 4 = 3 * 2^4 = 48
 *
 * These can be evident from the examples below
 */

public class LeftShiftOperator {
    public static void main(String[] args) {
        int x = 3;
        System.out.println("3 << 1 = " + (x<<1));
        System.out.println("3 << 2 = " + (x<<2));

        int y = 4;
        int z = (x << y);
        System.out.println("3 << 4 = " + z);

        y = 30;
        z = (x << y);
        System.out.println("3 << 30 = " + z); //as the signed bit got set

        x = -1;
        x = x << 1;
        System.out.println("-1 << 1 = " + x); //refer to NotOperator class for more details
                                              //on signed numbers
    }
}
