package gfg.certification.examples;

/**
 * Print binary representation of N
 */
public class BinaryRepresentationOfN {
    public static void main(String[] args) {
        System.out.println("Binary of 16 = ");
        printBinary(16);
        System.out.println("\nBinary of 15 = ");
        printBinary(15);
    }

    static void printBinary(int n){
        if(n == 0)
            return;
        printBinary(n/2);
        System.out.print(n % 2);
    }
}
