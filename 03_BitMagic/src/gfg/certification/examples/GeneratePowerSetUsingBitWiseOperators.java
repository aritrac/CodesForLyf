package gfg.certification.examples;

/**
 * We have to generate powerset using bitwise operators
 * I/P: s = "abc"
 * O/P: "","a","b","c","ab","ac","bc","abc"
 *
 * I/P: s = "ab"
 * O/P: "","a","b","ab"
 *
 * Counter      Counter Binary          Subset
 * 0            000                     ""
 * 1            001                     "a"
 * 2            010                     "b"
 * 3            011                     "ab"
 * 4            100                     "c"
 * 5            101                     "ac"
 * 6            110                     "bc"
 * 7            111                     "abc"
 */
public class GeneratePowerSetUsingBitWiseOperators {
    public static void main(String[] args) {
        generatePowerSet("abc");
    }

    static void generatePowerSet(String str){
        int n = str.length();
        int powerSize = (int)Math.pow(2,n);
        for(int count = 0; count < powerSize; count++){
            for(int j = 0; j < n; j++){
                if((count & (1 << j)) != 0)
                    System.out.print(str.charAt(j));
            }
            System.out.println();
        }
    }
}
