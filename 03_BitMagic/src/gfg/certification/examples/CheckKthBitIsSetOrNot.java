package gfg.certification.examples;

/**
 * We are given a number, we have to check if the kth bit for the
 * right side in that number is set or not
 *
 * Cases:
 * I/P: n = 5, k = 1
 * O/P: Yes
 *
 * I/P: n = 8, k = 2
 * O/P: No
 *
 * I/P: n = 0, k = 3
 * O/P: No
 *
 */
public class CheckKthBitIsSetOrNot {
    public static void main(String[] args) {
        kthBitLeftShift(5,1);
        kthBitLeftShift(8,2);
        kthBitLeftShift(0,3);

        kthBitRightShift(5,1);
        kthBitRightShift(8,2);
        kthBitRightShift(0,3);
    }

    //Method1 (using left shift operator)
    static void kthBitLeftShift(int n, int k){
        if( (n & (1 << (k-1))) != 0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    //Method2 (using right shift operator)
    static void kthBitRightShift(int n,int k){
        if( ((n >> (k-1)) & 1) == 1)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
