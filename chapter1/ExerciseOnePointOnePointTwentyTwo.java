package chapter1;

import edu.princeton.cs.algs4.StdOut;

public class ExerciseOnePointOnePointTwentyTwo {
    public static void main(String...args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int element = 90;
        int indexOfFoundElement = rank(element, arr, 0, arr.length-1, 0);
        StdOut.print(indexOfFoundElement);
    }
    static int rank(int p, int[] arr, int lo, int hi, int levelOfRecursion) {
        levelOfRecursion++;
        StdOut.printf("%d %d %d%n", lo, hi, levelOfRecursion);
        if(lo>hi) return -1;
        int mid = (lo+hi)/2;
        if(arr[mid]<p) {
            return rank(p, arr, mid+1, hi, levelOfRecursion);
        } else if(arr[mid]>p) {
            return rank(p, arr, lo, mid-1, levelOfRecursion);
        } else {
            return mid;
        }
    }
}
