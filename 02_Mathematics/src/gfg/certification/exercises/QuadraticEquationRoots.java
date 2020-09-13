package gfg.certification.exercises;

import java.util.Scanner;

/**
 * Given a quadratic equation in the form ax2 + bx + c. You need to print roots of it.
 * Example 1:
 *
 * Input:
 * a = 1
 * b = -2
 * c = 1
 * Output: 1 1
 * Explanation: Roots of equation x^2-2x+1
 * are 1 and 1.
 * Example 2:
 *
 * Input:
 * a = 1
 * b = -7
 * c = 12
 * Output: 4 3
 * Explanation: Roots of equation x^2 - 7x + 12
 * are 4 and 3.
 *
 * Expected Time Complexity: O(1)
 * Expected Auxiliary Space : O(1)
 *
 * Constraints:
 * -10^3 <= a <= 10^3
 * -10^3 <= b <= 10^3
 * -10^3 <= c <= 10^3
 */
public class QuadraticEquationRoots {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            QuadraticEquationRoots obj = new QuadraticEquationRoots();
            int a,b,c;
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            obj.quadraticRoots(a,b,c);
            System.out.println();
        }
    }
    public void quadraticRoots(int a,int b,int c)
    {
        if(a >= -1000 && a <= 1000 && b >= -1000 && b <= 1000 && c >= -1000 && c <= 1000){
            if(b*b - 4*a*c < 0) {
                System.out.print("Imaginary");
                return;
            }
            double d = 0.0d;
            if(b*b - 4*a*c > 0)
                d = Math.sqrt(b*b - 4*a*c);

            int root1 = (int)Math.floor((-b - d)/(2*a));
            int root2 = (int)Math.floor((-b + d)/(2*a));
            if(root1 >= root2){
                System.out.print(root1 + " " + root2);
            }else{
                System.out.print(root2 + " " + root1);
            }
        }
    }
}
