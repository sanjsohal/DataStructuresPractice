package chapter1;
import edu.princeton.cs.algs4.*;
public class ExerciseOnePointOnePointFifteen {
    public static void main(String...args) {
        System.out.println("Enter the upper bound value of each array in the input");
        int M = StdIn.readInt();
        System.out.println("Enter length of input array:");
        int lengthOfInputArray = StdIn.readInt();
        int[] inputArray = new int[lengthOfInputArray];
        int i = 0; 
        while(i<lengthOfInputArray) {
            inputArray[i] = StdIn.readInt();
            if(inputArray[i]<0 || inputArray[i] > (M-1)) throw new IllegalArgumentException("Each element should be between 0 and "+(M-1));
            i++;
        }
        int[] histogramArray = histogram(inputArray, M);
        for(int h:histogramArray) {
            System.out.print(h+" ");
        }
    }
    static int[] histogram(int[] a, int M) {
        int[] outputArray = new int[M];
        for(int i=0; i<M; i++) {
            outputArray[i] = countOccurenceOfElement(a, i);
        }
        return outputArray;
    }
    static int countOccurenceOfElement(int[] arr, int element) {
        int count = 0;
        for(int i:arr) {
            if(i == element) count++;
        }
        return count;
    }
}