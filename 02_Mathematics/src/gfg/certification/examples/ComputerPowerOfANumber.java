package gfg.certification.examples;
/*
Computing pow(x,n)
n >= 0
I/P: x=2, n=3
O/P: 8

I/P: x=3, n=4
O/P: 81

I/P: x=5, n=0
O/P: 1

I/P: x=5, n=1
O/P: 5
 */
public class ComputerPowerOfANumber {
    public static void main(String[] args) {
        System.out.println("2 to the power of 3 = " + powerFinderNaiveApproach(2,3));
        System.out.println("3 to the power of 4 = " + powerFinderNaiveApproach(3,4));
        System.out.println("5 to the power of 0 = " + powerFinderNaiveApproach(5,0));
        System.out.println("5 to the power of 1 = " + powerFinderNaiveApproach(5,1));

        System.out.println("\n2 to the power of 3 = " + powerFinderEfficientApproach(2,3));
        System.out.println("3 to the power of 4 = " + powerFinderEfficientApproach(3,4));
        System.out.println("5 to the power of 0 = " + powerFinderEfficientApproach(5,0));
        System.out.println("5 to the power of 1 = " + powerFinderEfficientApproach(5,1));

        System.out.println("\n2 to the power of 3 = " + powerFinderEfficientApproach2(2,3));
        System.out.println("3 to the power of 4 = " + powerFinderEfficientApproach2(3,4));
        System.out.println("5 to the power of 0 = " + powerFinderEfficientApproach2(5,0));
        System.out.println("5 to the power of 1 = " + powerFinderEfficientApproach2(5,1));
    }

    static int powerFinderNaiveApproach(int x, int n){
        int res = 1;
        for(int i = 0; i < n; i++)
            res = res * x;
        return res;
    }

    //Efficient approach
    //power(x,n) = { if(n%2 == 0)
    //                  we can break it down to power(x,n/2) * power(x,n/2)
    //               else
    //                  power(x,n-1) * x
    //Hence we have a recursive solution as shown here
    static int powerFinderEfficientApproach(int x,int n){
        if(n == 0)
            return 1;
        if(n % 2 == 0)
            return powerFinderNaiveApproach(x,n/2) * powerFinderNaiveApproach(x,n/2);
        else
            return x * powerFinderNaiveApproach(x,n-1);
    }

    static int powerFinderEfficientApproach2(int x,int n){
        if(n == 0)
            return 1;
        int temp = powerFinderEfficientApproach2(x,n/2);
        temp = temp * temp;
        if(n % 2 == 0)
            return temp;
        else
            return x * temp;
    }
}
