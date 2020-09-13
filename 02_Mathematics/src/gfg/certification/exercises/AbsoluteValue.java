package gfg.certification.exercises;

import java.util.Scanner;

/*
I/P: -32
O/P: 32

I/P: 45
O/P: 45

Expected Time Complexity: O(1)
Expected Auxiliary Space : O(1)

Constraints:
-10^6 <= I <= 10^6
 */
public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); //number of testcases
        while(T > 0){
            int I = sc.nextInt();
            AbsoluteValue obj = new AbsoluteValue();
            System.out.println(obj.absolute(I));
            T--;
        }
    }

    public int absolute(int I){
        if(I >= -1000000 && I <= 1000000)
            return Math.abs(I);
        else
            return -1;
    }
}
