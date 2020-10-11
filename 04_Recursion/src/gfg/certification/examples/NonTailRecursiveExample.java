package gfg.certification.examples;

/**
 * Here we will analyze whether the given method is tail recursive or not
 */
public class NonTailRecursiveExample {
    public static void main(String[] args) {
        //Lets calculate factorial of 5
        System.out.println(fact(5));
        //Lets again calculate factorial of 5
        System.out.println(factTail(5,1));
    }
    //non tail recursive method
    static int fact(int n){
        if(n<=1)
            return 1;
        return n * fact(n-1);
    }

    //tail recursive equivalent method
    static int factTail(int n,int k){
        if(n <= 1)
            return k;
        return factTail(n-1,k*n);
    }
}
