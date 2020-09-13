package gfg.certification.examples;

public class LCMOfTwoNumbers {
    public static void main(String[] args) {
        System.out.println("LCM of 8,22 = " + lcmNaiveApproach(8,22));
        System.out.println("LCM of 4,6 = " + lcmNaiveApproach(4,6));

        System.out.println("LCM of 8,22 = " + lcmEfficientApproach(8,22));
        System.out.println("LCM of 4,6 = " + lcmEfficientApproach(4,6));
    }
    static int lcmNaiveApproach(int a,int b){
        int res = Math.max(a,b);
        while(true){
            if(res % a == 0 && res % b == 0)
                break;
            res++;
        }
        return res;
    }

    static int gcd(int a, int b){
        if(b == 0)
            return a;
        return gcd(b,a%b);
    }
    //This is derived from the formula
    //a * b = gcd(a,b) * lcm(a,b)
    //then lcm(a,b) = (a*b)/gcd(a,b)
    //We will use euclidean approach to find the gcd of the numbers
    static int lcmEfficientApproach(int a,int b){
        return (a*b)/gcd(a,b);
    }
}
