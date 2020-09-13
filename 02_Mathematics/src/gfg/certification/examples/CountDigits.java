package gfg.certification.examples;

public class CountDigits {

    static int countDigitsNormal(int n){
        int result = 0;
        while(n > 0){
            n = n/10;
            result++;
        }
        return result;
    }

    public static void main(String[] args) {
        //Testing countDigitsNormal
        System.out.println(countDigitsNormal(2368));
        System.out.println(countDigitsNormal(236));
        System.out.println(countDigitsNormal(23));
        System.out.println(countDigitsNormal(2));
    }
}
