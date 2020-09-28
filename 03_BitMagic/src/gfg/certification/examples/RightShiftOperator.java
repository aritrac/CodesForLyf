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

        //Signed right shift operator usecases
        x = -1;
        y = 1;
        z = x >> y;
        System.out.println("-1 >> 1 = " + z); //as signed bit is preserved and the number becomes
                                              //all bits set to 1, which is 2^32 - 1
                                              //hence the output is -1
        //Refer to NotOperator class for details on 2s complement how it is represented.
        y = 2;
        z = x >> y;
        System.out.println("-1 >> 2 = " + z); //as signed bit is preserved and the number becomes
                                              //all bits set to 1, which is 2^32 - 1
                                              //hence the output is again -1

        //Unsigned right shift operator usecases
        x = -1;
        y = 1;
        z = x >>> y;
        System.out.println("-1 >>> 1 = " + z); //Here the signed bit gets set to 0 and we have
                                               //all 31 bits set to 1 with a value of
                                               //2^31 - 1 which is 2147483647
        y = 2;
        z = x >>> y;
        System.out.println("-1 >>> 2 = " + z); //Here the signed bit gets set to  0 and we have
                                               //all 30 bits set to 1 with a value of
                                               //2^30 - 1 which is 1073741823
    }
}
