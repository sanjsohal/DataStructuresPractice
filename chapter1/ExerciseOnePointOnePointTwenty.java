package chapter1;
import edu.princeton.cs.algs4.*;
public class ExerciseOnePointOnePointTwenty {
    public static void main(String...args) {
        System.out.println("Enter input");
        int N = StdIn.readInt();
        StdOut.println(ln(N));
    }
    static double ln(int N) {
        
        if(N <= 1) return 0.0;
        return Math.log(N)+ln(N-1);
    }
    
}