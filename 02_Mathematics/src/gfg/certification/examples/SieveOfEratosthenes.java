package gfg.certification.examples;

import java.util.Arrays;

/*
Print all prime number <= a given n
I/P: n = 10
O/P: 2 3 5 7

I/P: n = 23
O/P: 2 3 5 7 9 11 13 17 19 23
 */
public class SieveOfEratosthenes {
    public static void main(String[] args) {
        System.out.println("Prime numbers upto 10:");
        printPrimesNaiveApproach(10);
        System.out.println("Prime numbers upto 23");
        printPrimesNaiveApproach(23);

        System.out.println("Prime numbers upto 10:");
        sieveOfEratosthenes(10);
        System.out.println("Prime numbers upto 23");
        sieveOfEratosthenes(23);
    }

    static void printPrimesNaiveApproach(int n){
        for(int i = 2; i <= n; i++){
            if(isPrimeEfficientApproach(i))
                System.out.println(i);
        }
    }

    //Approach using Sieve of Eratosthenes
    static void sieveOfEratosthenes(int n){
        if(n <= 1)
            return;
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime,true);
        for(int i = 2;i*i <= n; i++){
            if(isPrime[i]){
                //For further optimization we can initialize j = i*i;
                //as the numbers greater than i and less than i*i must have already been marked
                //in previous iterations, so no need of visiting them again
                for(int j = 2*i; j<=n;j+=i){
                    isPrime[j]=false;
                }
                /*
                Further optimization
                for(int j = i*i; j<=n;j+=i){
                    isPrime[j]=false;
                }
                 */
            }
        }
        for(int i = 2; i <= n; i++){
            if(isPrime[i])
                System.out.println(i + " ");
        }
    }

    static boolean isPrimeEfficientApproach(int n){
        if(n == 1)
            return false;
        for(int i = 2; i*i <= n; i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }
}
