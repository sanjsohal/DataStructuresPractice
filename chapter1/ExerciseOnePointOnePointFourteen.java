package chapter1;
import edu.princeton.cs.algs4.StdIn;
public class ExerciseOnePointOnePointFourteen {
    public static void main(String...args) {
        int N = StdIn.readInt();
        int exponent = lg(N);
        System.out.println(exponent);
    }
    public static int lg(int N) {
        int i = 0, multiplication = 1;
        while(multiplication*2<=N) {
            multiplication*=2;
            i++;
        }
        return i;
    }
}