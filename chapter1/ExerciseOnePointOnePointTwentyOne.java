package chapter1;
import edu.princeton.cs.algs4.*;
public class ExerciseOnePointOnePointTwentyOne {
    public static void main(String...args) {
        String[] input = StdIn.readAllLines();
        for(String line:input) {
            String[] data = line.split(",");
            int numerator = Integer.parseInt(data[1]);
            int denominator = Integer.parseInt(data[2]);
            double result = numerator/denominator;
            StdOut.printf("%s %s %s %.3f", data[0], data[1], data[2], result);
            StdOut.println();
        }
    }
}
