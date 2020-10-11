package gfg.certification.examples;

/*
Tail Recursion Demo
If a function on being returned has something more to do then it is not a tail recursion
If a function on being returned has nothing more to do but just return to its parent, it is called tail recursion
 */
public class TailRecursion {
    public static void main(String[] args) {
        System.out.println("Checking non tail recursion");
        nonTailRecursion(20);
        System.out.println("Checking tail recursion");
        tailRecursion(20);
        System.out.println("Testing another non tail recursive function");
        nonTailFun(20);
        System.out.println("Testing the equivalent tail recursive version");
        tailFun(20,1);
    }
    //prints 1 to 20
    static void nonTailRecursion(int n){
        if(n == 0)
            return;
        nonTailRecursion(n-1);
        System.out.println(n);
    }

    //prints 20 to 1
    static void tailRecursion(int n){
        if(n == 0)
            return;
        System.out.println(n);
        tailRecursion(n-1);
    }

    //How to change a non tail recursive code to tail recursive code.
    //We will attempt to change nonTailRecursion method above to tailRecursion method

    //Another non-tail recursive function
    //prints 1 to 20 if n is 20
    static void nonTailFun(int n){
        if(n==0)
            return;
        nonTailFun(n-1);
        System.out.println(n);
    }
    //The equivalent tail recursive function
    static void tailFun(int n,int k){
        if(n == 0)
            return;
        System.out.println(k);
        tailFun(n-1,k+1);
    }
}
