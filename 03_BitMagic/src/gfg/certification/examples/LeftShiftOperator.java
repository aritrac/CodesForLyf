package gfg.certification.examples;

public class LeftShiftOperator {
    public static void main(String[] args) {
        int x = 3;
        System.out.println("3 << 1 " + (x<<1));
        System.out.println("3 << 2 " + (x<<2));

        int y = 4;
        int z = (x << y);
        System.out.println("3 << 4 " + z);
    }
}
