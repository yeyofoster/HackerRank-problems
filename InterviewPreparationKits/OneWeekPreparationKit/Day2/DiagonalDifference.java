package InterviewPreparationKits.OneWeekPreparationKit.Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {

    public static void main(String[] args) {
        List<List<Integer>> input = new ArrayList<List<Integer>>();
        input.add(Arrays.asList(1, 2, 3));
        input.add(Arrays.asList(4, 5, 6));
        input.add(Arrays.asList(9, 8, 9));

        int difference = diagonalDifference(input);
        System.out.println(difference);
    }

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        int leftDiagonal = 0;
        int rightDiagonal = 0;
        int size = arr.size() - 1;

        // Getting diagonals.
        for (int i = 0; i < arr.size(); i++) {
            leftDiagonal += arr.get(i).get(i);
            rightDiagonal += arr.get(i).get(size - i);
        }

        return Math.abs(leftDiagonal - rightDiagonal);
    }
}