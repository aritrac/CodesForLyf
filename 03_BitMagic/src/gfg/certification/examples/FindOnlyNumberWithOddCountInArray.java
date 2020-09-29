package gfg.certification.examples;

/**
 * You will be given an array of repeating positive integers.
 * Your task is to find out the only integer with odd count
 * You can assume that only one of the integers will have an odd count
 *
 * I/P: {4,3,4,4,4,5,5}
 * O/P: 3
 *
 * I/P: {8,7,7,8,8}
 * O/P: 8
 */

public class FindOnlyNumberWithOddCountInArray {
    public static void main(String[] args) {
        int[] ip1 = {4,3,4,4,4,5,5};
        int[] ip2 = {8,7,7,8,8};

        System.out.println("Find element with odd count in ip1 array = " + findOddCountNumber(ip1));
        System.out.println("Find element with odd count in ip2 array = " + findOddCountNumber(ip2));
        System.out.println();
        System.out.println("Find element with odd count in ip1 array = " + findOddCountNumberEfficient(ip1));
        System.out.println("Find element with odd count in ip2 array = " + findOddCountNumberEfficient(ip2));
    }

    //Method 1: (Naive approach)
    //We run a loop for each element
    //Within that we run another loop to find the count of that number
    //Once out of the inner loop we check of the count of that element is odd, we return the number
    //Or else continue with the next number
    static int findOddCountNumber(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int count = 0;
            for(int j = i; j < arr.length; j++){
                if(arr[j] == arr[i]){
                    count++;
                }
            }
            if(count % 2 != 0)
                return arr[i];
        }
        return -1;
    }

    //Method2: (Efficient)
    //We will use the XOR operator. It has an interesting property in which if we do x ^ x it becomes 0
    //If we do (x ^ y) ^ x , it would equal y with x cancelling out.
    //so following the above property, if we do xor of all the elements in the array
    //we will be left with only the odd occurring element value as even occurring pairs will cancel out
    static int findOddCountNumberEfficient(int[] arr){
        int res = 0;
        for(int i = 0; i < arr.length; i++){
            res = res ^ arr[i];
        }
        return res;
    }
}
