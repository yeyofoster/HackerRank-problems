package InterviewPreparationKits.OneWeekPreparationKit.Day4;

import java.util.Arrays;
import java.util.List;

public class GridChallenge {
    public static void main(String[] args) {
        List<String> grid = Arrays.asList("abc", "ade", "efg");
        String result = gridChallenge(grid);

        System.out.println(result);
    }

    /*
     * Complete the 'gridChallenge' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING_ARRAY grid as parameter.
     */

    public static String gridChallenge(List<String> grid) {
        // Sorting each row alphabetically, ascending.
        for (int i = 0; i < grid.size(); i++) {
            char[] letters = grid.get(i).toCharArray();
            Arrays.sort(letters);
            grid.set(i, new String(letters));
        }

        // Validating if every column is sorted correctly.
        for (int row = 1; row < grid.size(); row++) {
            for (int col = 0; col < grid.get(0).length(); col++) {
                if (grid.get(row - 1).charAt(col) > grid.get(row).charAt(col)) {
                    return "NO";
                }
            }
        }

        return "YES";
    }
}
