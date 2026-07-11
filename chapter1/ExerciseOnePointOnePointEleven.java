package chapter1;
import edu.princeton.cs.algs4.StdIn;

public class ExerciseOnePointOnePointEleven {
    public static void main(String...args) {
        int firstDimension = StdIn.readInt();
        int secondDimension = StdIn.readInt();
        boolean[][] matrix = new boolean[firstDimension][secondDimension];
        String[][] output = new String[firstDimension][secondDimension];
        for(int i = 0; i<firstDimension; i++) {
            for(int j=0; j<secondDimension; j++) {
                matrix[i][j]=StdIn.readBoolean();
            }
        }
        for(int i=0; i<firstDimension; i++) {
            for(int j=0; j<secondDimension; j++) {
                if(matrix[i][j]) {
                    output[i][j] ="*";
                } else {
                    output[i][j] = " ";
                }
            }
        }
        for(int i=0; i<firstDimension; i++) {
            for(int j=0; j<secondDimension; j++) {
                System.out.print(output[i][j]);
            }
            System.out.println();
        }

    }
}