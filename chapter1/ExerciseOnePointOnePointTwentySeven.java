package chapter1;
import edu.princeton.cs.algs4.*;
public class ExerciseOnePointOnePointTwentySeven {
    public static void main(String...args) {
        double binomial = binomial(100, 50, 0.4);
        StdOut.printf("Value is %.3f%n", binomial);

    }
    static double binomial(int N, int k, double p) {
        double[][] cache = new double[N+1][k+1];
        for(int i=0; i<=N; i++)
            for(int j=0; j<=k; j++)
        cache[i][j] = -1;
        return binomialMemo(N, k, p, cache);
    }
    private static double binomialMemo(int N, int k, double p, double[][] memo) {
        if(k<0) return 0.0;
        if(N == 0) return k==0 ? 1.0 : 0.0;
        if(memo[N][k] != -1)
            return memo[N][k];
        memo[N][k] = (1.0-p) * binomialMemo(N-1,k,p, memo)+p*binomialMemo(N-1,k-1,p, memo);
        return memo[N][k];
    }
}
