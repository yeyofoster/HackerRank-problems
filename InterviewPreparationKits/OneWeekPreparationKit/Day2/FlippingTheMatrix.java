package InterviewPreparationKits.OneWeekPreparationKit.Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlippingTheMatrix {
    public static void main(String[] args) {
        List<List<Integer>> input = new ArrayList<List<Integer>>();
        input.add(Arrays.asList(112, 42, 83, 119));
        input.add(Arrays.asList(56, 125, 56, 49));
        input.add(Arrays.asList(15, 78, 101, 43));
        input.add(Arrays.asList(62, 98, 114, 108));

        int maxSum = flippingMatrix(input);
        System.out.println(maxSum);
    }

    /*
     * Complete the 'flippingMatrix' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY matrix as parameter.
     */

    public static int flippingMatrix(List<List<Integer>> matrix) {
        int maxSum = 0;
        int matrixSize = matrix.size() - 1;
        int quarterSize = matrix.size() / 2;

        for (int row = 0; row < quarterSize; row++) {
            for (int column = 0; column < quarterSize; column++) {
                // Getting max from q1 and q2
                int maxFromQuadrant = Math.max(matrix.get(row).get(column), matrix.get(row).get(matrixSize - column));

                // Getting max from previous and q3
                maxFromQuadrant = Math.max(maxFromQuadrant, matrix.get(matrixSize - row).get(column));

                // Getting max from previous and q4
                maxFromQuadrant = Math.max(maxFromQuadrant, matrix.get(matrixSize - row).get(matrixSize - column));

                maxSum += maxFromQuadrant;
            }
        }

        return maxSum;
    }
}