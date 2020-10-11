package gfg.certification.examples;

/**
 * Print 1 to N using recursion
 */
public class Print1ToNUsingRecursion {
    public static void main(String[] args) {
        System.out.println("Printing 1 to 20");
        print1ToN(20);
    }

    static void print1ToN(int n){
        if(n == 0)
            return;
        print1ToN(n-1);
        System.out.print(n + " ");
    }
}
