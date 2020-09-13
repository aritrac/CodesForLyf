package gfg.certification.examples;

public class PalindromeNumbers {
    static boolean isPalindrome(int num){
        return num == reverse(num);
    }
    static int reverse(int n){
        int rev = 0;
        while(n > 0){
            rev = rev * 10 + n % 10;
            n = n/10;
        }
        return rev;
    }

    public static void main(String[] args) {
        //Testing the palindrome method above
        System.out.println(isPalindrome(367));
        System.out.println(isPalindrome(363));
    }
}
