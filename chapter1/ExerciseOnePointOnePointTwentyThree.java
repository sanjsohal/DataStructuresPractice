package chapter1;
import edu.princeton.cs.algs4.*;
import java.util.Arrays;
public class ExerciseOnePointOnePointTwentyThree {
    public static void main(String...args) {
        int[] input = In.readInts(args[0]);
        Arrays.sort(input);
        while(!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if(rank(key, input, 0, input.length-1)<0) {
                StdOut.printf("+ %d", key);
                StdOut.println();
            } else {
                StdOut.printf("- %d", key);
                StdOut.println();
            }
        }
    }
    static int rank(int p, int[] arr, int lo, int hi) {
        if(lo>hi) return -1;
        int mid = (lo+hi)/2;
        if(arr[mid]<p) {
            return rank(p, arr, mid+1, hi);
        } else if(arr[mid]>p) {
            return rank(p, arr, lo, mid-1);
        } else {
            return mid;
        }
    }
}
