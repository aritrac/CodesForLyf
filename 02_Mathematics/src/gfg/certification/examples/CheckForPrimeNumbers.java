package gfg.certification.examples;

public class CheckForPrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Is 65 prime? " + isPrimeNaiveApproach(65));
        System.out.println("Is 7 prime? " + isPrimeNaiveApproach(7));

        System.out.println("Is 65 prime? " + isPrimeEfficientApproach(65));
        System.out.println("Is 7 prime? " + isPrimeEfficientApproach(7));

        System.out.println("Is 65 prime? " + isPrimeMoreEfficientApproach(65));
        System.out.println("Is 7 prime? " + isPrimeMoreEfficientApproach(7));
    }
    static boolean isPrimeNaiveApproach(int n){
        if(n == 1)
            return false;
        for(int i = 2; i < n; i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }
    /*
    Going upto root of n, instead of n
     */
    static boolean isPrimeEfficientApproach(int n){
        if(n == 1)
            return false;
        for(int i = 2; i*i < n; i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }

    /*
    For numbers whose roots are also large,
    we can avoid many iterations by checking n%2 == 0 and n%3 == 0,
    we can save many iterations for large n
     */
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
