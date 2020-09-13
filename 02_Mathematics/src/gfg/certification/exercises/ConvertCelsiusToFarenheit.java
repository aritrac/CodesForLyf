package gfg.certification.exercises;

/*
Given a temperature in celsius C. You need to convert the given temperature to Fahrenheit.

Example 1:

Input:
C = 32
Output: 89
Explanation: Using the conversion
formula of celsius to fahrenheit , it
can be calculated that, for 32 degree
C, the temperature in Fahrenheit = 89.

Example 2:

Input:
50
Output: 122
Explanation: Using the conversion
formula of celsius to fahrenheit, it
can be calculated that, for 50 degree
C, the temperature in Fahrenheit = 122.


Expected Time Complexity: O(1)
Expected Auxiliary Space : O(1)

Constraints:
1 <= C <= 104
 */

import java.util.Scanner;

public class ConvertCelsiusToFarenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            ConvertCelsiusToFarenheit obj = new ConvertCelsiusToFarenheit();
            int C;
            C = sc.nextInt();

            System.out.println((int)(obj.cToF(C)));
        }
    }
    public double cToF(int C)
    {
        //Your code here
        if(C >= 1 && C <= 10000){
            return 32 + (9*C)/5;
        }
        return 32;
    }
}
