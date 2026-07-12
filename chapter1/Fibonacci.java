package chapter1;
import edu.princeton.cs.algs4.*;
import java.math.BigInteger;
public class Fibonacci {
    static BigInteger[] computedValues = new BigInteger[100];
    public static BigInteger F(int N) {
        if(N == 0) {
            computedValues[0] = new BigInteger("0");
            return new BigInteger("0");
        }
        if(N == 1) {
            computedValues[1] = new BigInteger("1");
            return new BigInteger("1");
        }
        if(computedValues[N] != null) return computedValues[N];
        BigInteger value = F(N-1).add(F(N-2));
        computedValues[N] = value;
        return value;
    }
    public static void main(String...args) {
        for(int N = 0; N < 100; N++) {
            StdOut.println(N + " "+F(N));
        }
    }
}