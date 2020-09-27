package gfg.certification.examples;

/**
 *  (x >> y) is equivalent to floor(x/2^y)
 *  as is evident from the example below
 *  33 >> 1 = floor(33 / 2^1) = 16
 *  33 >> 2 = floor(33 / 2^2) = 8
 *  33 >> 4 = floor(33 / 2^4) = 2
 */
public class RightShiftOperator {
    public static void main(String[] args) {
        int x = 33;
        System.out.println("33 >> 1 = " + (x >> 1));
        System.out.println("33 >> 2 = " + (x >> 2));

        int y = 4;
        int z = (x >> y);
        System.out.println("33 >> 4 = " + z);
    }
}
