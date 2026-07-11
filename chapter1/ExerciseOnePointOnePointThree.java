package chapter1;
import edu.princeton.cs.algs4.StdIn;
public class ExerciseOnePointOnePointThree {
    public static void main(String...args) {
        int first = StdIn.readInt();
        int second = StdIn.readInt();
        int three = StdIn.readInt();
        System.out.println(first == second && second == three ? "equal":"not equal");
    }
}