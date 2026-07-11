package chapter1;
import edu.princeton.cs.algs4.StdIn;
public class ExerciseOnePointOnePointThirteen {
    public static void main(String...args) {
        int N = StdIn.readInt();
        int M = StdIn.readInt();
        int[][] inputArr = new int[N][M];
        int[][] outputArr = new int[M][N];
        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                inputArr[i][j] = StdIn.readInt();
            }
        }
        for(int i=0; i<M; i++) {
            for(int j=0; j<N; j++) {
                outputArr[i][j] = inputArr[j][i];
            }
        }
        System.out.println("Input matrix:");
        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                System.out.print(inputArr[i][j]);
            }
            System.out.println();
        }
        System.out.println("Transposed matrix: ");
        for(int i=0; i<M; i++) {
            for(int j=0; j<N; j++) {
                System.out.print(outputArr[i][j]);
            }
            System.out.println();
        }

    }
}