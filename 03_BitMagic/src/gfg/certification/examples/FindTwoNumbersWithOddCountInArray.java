package gfg.certification.examples;

/**
 * Consider an integer array where each element is > 0. We are provided a constraint that all numbers in the array
 * except 2 integers, has even count. We have to find those two integers with odd count.
 *
 * I/P: {3,4,3,4,5,4,4,6,7,7}
 * O/P: 5 6
 *
 * I/P: {20,15,20,16}
 * O/P: 15 16
 */
public class FindTwoNumbersWithOddCountInArray {
    public static void main(String[] args) {
        int[] arr1 = {3,4,3,4,5,4,4,6,7,7};
        int[] arr2 = {20,15,20,16};

        int[] arr3 = {3,4,3,4,8,4,4,32,7,7};

        find2IntegersWithOddCount(arr1,arr1.length);
        find2IntegersWithOddCount(arr2,arr2.length);
        System.out.println();

        find2IntegersWithOddCountEfficient(arr1,arr1.length);
        find2IntegersWithOddCountEfficient(arr2,arr2.length);
        find2IntegersWithOddCountEfficient(arr3,arr3.length);
    }

    //Method1: Naive solution
    static void find2IntegersWithOddCount(int[] arr,int n){
        for(int i = 0; i < n; i++){
            int count = 0;
            for(int j = 0; j < n; j++){
                if(arr[i] == arr[j])
                    count++;
            }
            if(count % 2 != 0)
                System.out.println(arr[i]);
        }
    }

    //Method2: Efficient solution
    /*
    The idea here is that we do an XOR of the entire array and the even numbers
    will cancel out each other, and our result will be the XOR of the 2 numbers with odd count
    In the first test case the result of XOR of the entire array would be
    res = 5 ^ 6; which is 011. Now again based on this result, we see the set bits in the result
    So in the result 011 we have 2 set bits, one at zero position and one at first position
    Now we split the original array into numbers with zero position set and numbers with first
    position set.
    Once we generate both the lists, if we do XOR of the first sublist, we get the first number
    with odd count, and if we do XOR of the second sublist, we get the second number with odd count
     */
    static void find2IntegersWithOddCountEfficient(int[] arr, int n){
        int XOR = 0, res1 = 0, res2 = 0;
        //XOR entire array first
        for(int i = 0; i < n; i++){
            XOR = XOR ^ arr[i];
        }
        //find rightmost set bit in XOR
        //We need to do this once as it will give us 2 groups, and each group has one of the
        //resultant numbers. So even if the XOR contains multiple bits set (say 5 or 6 or mor)
        //We still do this once as our purpose is to still the list into two.
        int sn = XOR & ~(XOR-1);
        //3         : 011
        //(3-1)     : 010 //resets the rightmost set bit
        //~(3-1)    : 101 //mask to turn on only the rightmost set bit
        //3 & ~(3-1): 001 //only a number with rightmost bit set
        //6         : 110
        //(6-1)     : 101 //resets the rightmost set bit
        //~(6-1)    : 010 //mask to turn on only the rightmost set bit
        //6 & ~(6-1): 010 //only a number with rightmost bit set

        //Lets consider 8 and 32
        //8             : 00001000
        //32            : 00100000
        //XOR           : 00101000
        //XOR-1         : 00100111
        //~(XOR-1)      : 11011000
        //XOR & ~(XOR-1): 00001000

        for(int i = 0; i < n; i++){
            if((arr[i] & sn) != 0)
                res1 = res1 ^ arr[i];
            else
                res2 = res2 ^ arr[i];
        }
        System.out.println(res1 + " " + res2);
    }
}
