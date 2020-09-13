package gfg.certification.examples;
/*
Print prime factors of a given number
Input: n = 12
Output: 2 2 3

Input: n = 13
Output: 13

Input: n = 315
Output: 3 3 5 7

If you multiply the numbers in the output, you will get the original number
 */
public class PrimeFactors {
    public static void main(String[] args) {
        System.out.println("Prime factors of 315:");
        printPrimeFactorsNaiveApproach(315);
        System.out.println("Prime factors of 13:");
        printPrimeFactorsNaiveApproach(13);
        System.out.println("Prime factors of 12:");
        printPrimeFactorsNaiveApproach(12);

        System.out.println("Prime factors of 315:");
        printPrimeFactorsEfficientApproach(315);
        System.out.println("Prime factors of 13:");
        printPrimeFactorsEfficientApproach(13);
        System.out.println("Prime factors of 12:");
        printPrimeFactorsEfficientApproach(12);

        System.out.println("Prime factors of 315:");
        printPrimeFactorsMoreEfficientApproach(315);
        System.out.println("Prime factors of 13:");
        printPrimeFactorsMoreEfficientApproach(13);
        System.out.println("Prime factors of 12:");
        printPrimeFactorsMoreEfficientApproach(12);
    }
    //Naive approach
    static void printPrimeFactorsNaiveApproach(int n){
        for(int i = 2; i <= n; i++){
            if(isPrimeMoreEfficientApproach(i)){
                int x = i;
                while(n % x == 0){
                    System.out.println(i);
                    x = x * i;
                }
            }
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
    static void printPrimeFactorsEfficientApproach(int n){
        if(n <= 1)
            return;
        for(int i = 2; i*i <= n; i++){
            while(n%i == 0){
                System.out.println(i);
                n = n/i;
            }
        }
        if(n > 1)
            System.out.println(n);
    }

    /*
    Here we will use the same logic that we used in CheckForPrimeNumbers in which we were incrementing
    i = i + 6. Please refer to that code for explanation
     */
    static void printPrimeFactorsMoreEfficientApproach(int n){
        if(n <= 1)
            return;
        while(n %2 == 0){
            System.out.println(2);
            n = n / 2;
        }
        while(n %3 == 0){
            System.out.println(3);
            n = n /3;
        }
        for(int i = 5; i*i <= n; i+=6){
            while(n % i == 0){
                System.out.println(i);
                n = n / i;
            }
            while(n % (i+2) == 0){
                System.out.println(i+2);
                n = n / (i+2);
            }
        }
        if(n > 3)
            System.out.println(n);
    }

    static boolean isPrimeMoreEfficientApproach(int n){
        if(n == 1)
            return false;
        if(n == 2|| n==3)
            return true;
        if(n %2 == 0 || n%3==0)
            return false;
        for(int i = 5; i*i < n; i=i+6){ //All other numbers for ex: 5 to 10, is covered by either 5,2,3 or 5+2(i+2)
            if(n % i == 0 || n %(i+2) == 0)
                return false;
        }
        return true;
    }
}
