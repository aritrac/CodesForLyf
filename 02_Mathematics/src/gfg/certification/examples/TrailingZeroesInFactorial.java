package gfg.certification.examples;

public class TrailingZeroesInFactorial {
    static int countTrailingZeroesNaive(int n){
        int fact = 1;
        for(int i = 2; i <= n; i++)
            fact = fact * i;
        int res = 0;
        while(fact % 10 == 0){
            res++;
            fact = fact/10;
        }
        return res;
    }
    /*
    in this approach, we are going to find the count of 5 as prime factors of all positive integers upto n
    1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * ... * n
    no. of trailing zeroes = floor(n/5) + floor(n/25) + floor(n/125) as 5 contributes 1 5's and 25 contributes 2 5's and 125 contributes 3 5's
    no of 2s will always be more than number of 5s, so the number of 5's is the determining factor in how many zeroes we will have
     */
    static int countTrailingZeroesEfficient(int n){
        int res = 0;
        for(int i = 5; i <= n; i = i*5){
            res += n / i;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(countTrailingZeroesNaive(10));
        System.out.println(countTrailingZeroesEfficient(10));//Same input as naive and same result
        //System.out.println(countTrailingZeroesNaive(251)); //This will not work for such huge inputs as it is not efficient
        System.out.println(countTrailingZeroesEfficient(251));
    }
}
