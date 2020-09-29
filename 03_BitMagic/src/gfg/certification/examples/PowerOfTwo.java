package gfg.certification.examples;

/**
 * Calculate if a given number is a power of 2 or not
 * n >= 0
 * I/P: n = 4
 * O/P: Yes
 *
 * I/P: n = 6
 * O/P: No
 */
public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println("Is 4 a power of 2 ? " + isPowerOf2Naive(4));
        System.out.println("Is 6 a power of 2 ? " + isPowerOf2Naive(6));
        System.out.println("Is 16 a power of 2 ? " + isPowerOf2Naive(16));
        System.out.println("");
        System.out.println("Is 4 a power of 2 ? " + isPowerOf2Efficient(4));
        System.out.println("Is 4 a power of 2 ? " + isPowerOf2Efficient(6));
        System.out.println("Is 4 a power of 2 ? " + isPowerOf2Efficient(16));
    }
    //Method 1
    //Keep dividing by 2 until you get a remainder of 1
    //If we encounter any odd quotient apart from 1 from previous step of division by 2, then we return false
    static boolean isPowerOf2Naive(int n){
        if(n == 0)
            return false;
        while(n != 1){
            if(n % 2 != 0) //we got odd quotient from previous loop iteration
                return false;
            n = n/2;
        }
        return true;
    }

    //Method 2
    //We can use Brian Kerninghams algorithm demonstrated earlier for counting set bit count
    //Since a power of two has only one set bit, so as per the algorithm if we do
    //n & (n-1) it should return 0 if only 1 bit is set. And this is our check for the power of 2 validation
    static boolean isPowerOf2Efficient(int n){
        if(n == 0)
            return false;
        return ((n&(n-1)) == 0);
    }
}
