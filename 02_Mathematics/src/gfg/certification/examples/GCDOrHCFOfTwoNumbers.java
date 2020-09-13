package gfg.certification.examples;

public class GCDOrHCFOfTwoNumbers {
    public static void main(String[] args) {
        System.out.println("GCD of 10 and 15 = " + gcdNaiveApproach(10,15));
        System.out.println("GCD of 10 and 15 = " + gcdNaiveApproach(9,10));

        System.out.println("GCD of 10 and 15 = " + gcdEfficientApproachEuclidean(10,15));
        System.out.println("GCD of 10 and 15 = " + gcdEfficientApproachEuclidean(9,10));

        System.out.println("GCD of 10 and 15 = " + gcdOptimizedEuclideanApproach(10,15));
        System.out.println("GCD of 10 and 15 = " + gcdOptimizedEuclideanApproach(15,10));
    }

    static int gcdNaiveApproach(int a,int b){
        int minNum = Math.min(a,b);
        while(minNum > 0){
            if(a%minNum == 0 && b%minNum == 0)
                break;
            minNum--;
        }
        return minNum;
    }
    /*
    This approach uses Euclidean algorithm which states
    let b be smaller than a then
    gcd(a,b) = gcd(a-b,b)
    because
    let g be gcd of a and b
    a = gx, b = gy and gcd(x,y) = 1 [there should be no factors between x and y except 1]
     */

    static int gcdEfficientApproachEuclidean(int a,int b){
        while(a != b){
            if(a > b)
                a = a - b;
            else
                b = b - a;
        }
        return a;
    }

    static int gcdOptimizedEuclideanApproach(int a,int b){ //if a < b, then a and b will be swapped automatically
                                                           //if a > b, then it proceeds normally
        if(b == 0)
            return a;
        else
            return gcdOptimizedEuclideanApproach(b,a%b);
    }
}
