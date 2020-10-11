package gfg.certification.examples;

/**
 * Check if a string is palindrome or not recursively
 * i/p: abbcbba
 * o/p: yes
 *
 * i/p: abba
 * o/p: yes
 *
 * i/p: geeks
 * o/p: no
 */
public class CheckRecursivelyIfAStringIsAPalindromeOrNot {
    public static void main(String[] args) {
        System.out.println("Is abbcbba palindrome? " + isPalindrome("abbcbba","abbcbba".length() - 1,0));
        System.out.println("Is abba palindrome? " + isPalindrome("abba","abba".length()-1,0));
        System.out.println("Is geeks palindrome? " + isPalindrome("geeks","geeks".length()-1,0));
        System.out.println("Using efficient palindrome finder");
        System.out.println("Is abbcbba palindrome? " + isPalindromeEfficient("abbcbba",0,"abbcbba".length() - 1));
        System.out.println("Is abba palindrome? " + isPalindromeEfficient("abba",0,"abba".length()-1));
        System.out.println("Is geeks palindrome? " + isPalindromeEfficient("geeks",0,"geeks".length()-1));
    }
    //inefficient as it parses entire array
    static boolean isPalindrome(String str,int len, int k){
        if(len <= 1)
            return true;
        return str.charAt(len) == str.charAt(k) && isPalindrome(str,len - 1,++k);
    }
    //This is efficient as it visits half of the array at worst case
    static boolean isPalindromeEfficient(String str, int start, int end){
        if(start >= end)
            return true;
        return str.charAt(start) == str.charAt(end) && isPalindromeEfficient(str,++start,--end);
    }
}
