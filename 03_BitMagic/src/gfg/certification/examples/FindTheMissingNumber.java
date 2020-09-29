package gfg.certification.examples;

/**
 * VARIATION OF THE PROBLEM FindOnlyNumberWithOddCountInArray
 * Given an array of n numbers that has values in the range [1 ... n+1]. Every no appears exactly once.
 * Hence one number is missing. Find the missing number
 * I/P: {1,4,3}
 * O/P: 2
 *
 * I/P: {1,5,3,2}
 * O/P: 4
 */

public class FindTheMissingNumber {
    public static void main(String[] args) {
        int[] arr1 = {1,4,3};
        int[] arr2 = {1,5,3,2};
        System.out.println("The missing number in arr1 = " + findMissingNumber(arr1,3));
        System.out.println("The missing number in arr2 = " + findMissingNumber(arr2,4));
    }

    /**
     * The approach would be to XOR all the numbers in the array first, so all the numbers set bits are recorded
     * in the result
     * Then we will again XOR the result with all the integers in the range 1 to n+1. So that the already present
     * numbers cancel each other as x ^ x = 0 and we are left with the only odd count number which was missing
     * in the first run. That is our missing number
     */

    static int findMissingNumber(int[] arr, int n){
        int res = 0;
        //first pass
        for(int i = 0; i < n; i++){
            res = res ^ arr[i];
        }

        //second pass
        for(int i = 1; i <= n+1; i++){
            res = res ^ i;
        }
        return res;
    }
}
