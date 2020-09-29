package gfg.certification.examples;

/**
 * Count the number of set bits in a number greater than or equal to 0
 * I/P: n = 5
 * O/P: 2
 *
 * I/P: n = 7
 * O/P: 3
 *
 * I/P: n = 13
 * O/P: 3
 */
public class CountSetBits {
    public static void main(String[] args) {
        System.out.println(countSetBits(5));
        System.out.println(countSetBits(7));
        System.out.println(countSetBits(13));

        System.out.println(countSetBitsNaive(5));
        System.out.println(countSetBitsNaive(7));
        System.out.println(countSetBitsNaive(13));

        System.out.println(countSetBitsBKAlgo(5));
        System.out.println(countSetBitsBKAlgo(7));
        System.out.println(countSetBitsBKAlgo(13));

        initialize();
        System.out.println(countSetBits(5));
        System.out.println(countSetBits(7));
        System.out.println(countSetBits(13));
    }
    //method 1a
    static int countSetBits(int n){
        int count = 0;
        while(n > 0){
            if((n & 1) == 1)
                count++;
            n = n >> 1;
        }
        return count;
    }

    //method 1b
    static int countSetBitsNaive(int n){
        int count = 0;
        while(n > 0){
            if(n % 2 != 0)
                count++;
            n = n/2;
        }
        return count;
    }

    //method 2 using Brian Kerningham's Algorithm
    /*
    This works on the idea that if you subtract 1 from a number,
    the least significant 1 converts to 0 and bits right of it are inverted
    so if 12 = 1100 then 12 - 1 = 1011
    Now if we & these two numbers we will get the next set bit as 1000 which is 8
    so if 8 = 1000 then 8 - 1 = 0111
    Now if we & these two numbers we will get the next set bit as 0000 which is a 0
    So since this process runs twice, there are 2 set bits in the initial number
     */
    static int countSetBitsBKAlgo(int n){
        int count = 0;
        while(n > 0){
            n = (n & (n-1));
            count++;
        }
        return count;
    }

    //method 3 using lookup table method for 32 bit numbers
    /*
    in which we will prepopulate each number for 8 bits 0 to 255 and their set bit count in a map.
    Later when we analyze set bit count in 32 bit numbers, we will divide it into 4 chunks and
    consult this map to find the bit count of each chunk and add them together and return
    Here we will use an interesting technique in which we notice a pattern with factors
    if n is the number it can be even or odd, if even then lsb will be 0
    else it will be 1. So in essence we are doing a n % 2 first to find out the lsb
    then we do n/2. This n/2 value we will look up in the table and add it with the n % 2 value calculated before.
     */

    static int[] table = new int[256]; //range of unsigned 8 bit integer 0 to 2^8 - 1
    static void initialize(){
        table[0] = 0;
        for(int i = 1; i < 256; i++){
            table[i] = (i & 1) + table[i/2];
        }
    }

    int count(int n){ //Now we pass a 32 bit integer to this method and use the table above to calculate the number
                      //of set bits
        //0 - 8 bits
        int res = table[n & 0xff]; //gives the value of right most 8 bits
        n = n >> 8; //bringing the next set of 8 bits to the right most bits
        //16 - 8 bits
        res += table[n & 0xff]; //again gives the value of the right most 8 bits
        n = n >> 8; //again brining the next set of 8 bits to the right most bits
        //24 - 16 bits
        res += table[n & 0xff]; //gives the value of the right most 8 bits
        n = n >> 8;
        //32 - 24 bits
        res += table[n & 0xff];

        return res;
    }
}
