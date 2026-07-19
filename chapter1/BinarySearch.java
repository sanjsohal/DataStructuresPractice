package chapter1;
import edu.princeton.cs.algs4.*;;
public class BinarySearch {
    public static void main(String...args) {
        int[] elements = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int indexOfElementToFind = rank(90, elements, 0, elements.length
            -1);
        StdOut.print(indexOfElementToFind);
        
    }
    static int rank(int element, int[] a, int lo, int hi) {
        while(lo<hi) {
            int mid = (lo+hi)/2;
            if(a[mid]<element) {
                lo = mid+1;
            } else if(a[mid]>element) {
                hi = mid-1;
            } else { 
                return mid; 
            };
        }
        return -1;
    }
}
