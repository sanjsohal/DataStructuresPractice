package chapter1;
import edu.princeton.cs.algs4.*;
public class Fibonacci {
    public static long F(int N) {
        if(N == 0 || N == 1) return N;
        return F(N-1)+F(N-2);
    }
    public static void main(String...args) {
        for(int N = 0; N < 100; N++) {
            StdOut.println(N + " "+F(N));
        }
    }
}