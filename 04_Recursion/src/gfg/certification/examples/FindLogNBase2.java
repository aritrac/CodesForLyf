package gfg.certification.examples;

/**
 * We recursively try to find Log N (base 2) of N
 * So if N is 16 log N base 2 = 4
 * In other words 2 ^ 4 = 16
 */
public class FindLogNBase2 {
    public static void main(String[] args) {
        System.out.println("Log 16 base 2 = " + findLogNBase2(16));
    }

    static int findLogNBase2(int n){
        if(n == 1)
            return 0;
        return 1 + findLogNBase2(n/2);
    }
}
