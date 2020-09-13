package gfg.certification.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiplicationUnderModulo {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while(t-- > 0){
            String[] str = read.readLine().trim().split(" ");
            Long a = Long.parseLong(str[0]);
            Long b = Long.parseLong(str[1]);

            System.out.println(new MultiplicationUnderModulo().multiplicationUnderModulo(a,b));
        }
    }

    //( a + b ) % c = ( ( a % c ) + ( b % c ) ) % c
    //( a * b ) % c = ( ( a % c ) * ( b % c ) ) % c
    //( a – b ) % c = ( ( a % c ) – ( b % c ) ) % c

    static long multiplicationUnderModulo(long a, long b){
        int M = 1000000007;
        return ((a % M ) * (b % M)) % M;
    }
}
