package gfg.certification.examples;

/**
 * Example Recursive Code
 */

public class ExampleRecursion {
    public static void main(String[] args) {
        System.out.println("Printing fun(3)");
        fun(3);
        System.out.println("Printing fun2(3)");
        fun2(3);
    }

    static void fun(int n){
        if(n == 0)
            return;
        System.out.println(n-1);
        fun(n-1);
        System.out.println(n-1);
    }

    static void fun2(int n){
        if(n==0)
            return;
        fun2(n-1);
        System.out.println(n);
        fun2(n-1);
    }
}
