package gfg.certification.examples;

/**
 * Print N to 1 using recursion
 */
public class PrintNTo1UsingRecursion {
    public static void main(String[] args) {
        System.out.println("Printing 15 to 1");
        printReverse(1,15);
        System.out.println("Printing 20 to 1");
        printReverseAlternate(20);
    }

    static void printReverse(int curr,int n){
        if(curr == n + 1)
            return;
        printReverse(curr + 1, n);
        System.out.print(curr + " ");
    }

    static void printReverseAlternate(int n){
        if(n == 0)
            return;
        System.out.print(n + " ");
        printReverseAlternate(n-1);
    }
}
