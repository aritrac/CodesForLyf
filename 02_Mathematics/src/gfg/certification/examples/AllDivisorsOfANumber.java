package gfg.certification.examples;

/*
I/P: n = 15
O/P: 1 3 5 15

I/P: n = 100
O/P: 1 2 4 5 10 20 25 50 100

I/P: n = 7
O/P: 1 7
 */

public class AllDivisorsOfANumber {
    public static void main(String[] args) {
        System.out.println("Divisors of 15:");
        printDivisorsNaiveApproach(15);
        System.out.println("Divisors of 100");
        printDivisorsNaiveApproach(100);
        System.out.println("Divisors of 7");
        printDivisorsNaiveApproach(7);

        System.out.println("Divisors of 15:");
        printDivisorsEfficientApproach(15);
        System.out.println("Divisors of 100");
        printDivisorsEfficientApproach(100);
        System.out.println("Divisors of 7");
        printDivisorsEfficientApproach(7);

        System.out.println("Divisors of 15:");
        printDivisorsEfficientApproachSortedOrder(15);
        System.out.println("Divisors of 100");
        printDivisorsEfficientApproachSortedOrder(100);
        System.out.println("Divisors of 7");
        printDivisorsEfficientApproachSortedOrder(7);
    }
    //Naive approach
    static void printDivisorsNaiveApproach(int n){
        for(int i = 1; i <= n; i++){
            if(n%i == 0)
                System.out.println(i);
        }
    }

    //Efficient approach
    /*
    A number n can be written as multiplications of powers of prime factors such as
    12 = 2^2 * 3
    450 = 2^1 * 3^2 * 5^2
    also
    Divisors always appear in pairs
    30: (1,30) (2,15) (3,10) (5,6)
    Let (x,y) be a pair
    x * y = n
    if(x <= y)
        then x * x <= n
        then x <= Root of n
    We will get all the prime divisors of the number from 2 to root of n derived from the above
     */
    static void printDivisorsEfficientApproach(int n){
        for(int i = 1; i*i <= n; i++){
            if(n%i == 0) {
                //prints in pairs
                System.out.println(i); //This prints the first number in the pair
                if(i != n / i) //prints the second number only if it is different from i
                    System.out.println(n/i); //This prints the second number in the pair
            }
        }
    }

    //Efficient approach modified to print the numbers in sorted order
    static void printDivisorsEfficientApproachSortedOrder(int n){
        int i;
        //Prints all divisors from 1 to root of n (both inclusive)
        for(i = 1; i *i < n; i++){
            if(n % i == 0)
                System.out.println(i);
        }
        //Print all divisors from root of n to n (both inclusive)
        for(; i >= 1; i--){
            if(n % i == 0)
                System.out.println(n/i);
        }
    }
}
