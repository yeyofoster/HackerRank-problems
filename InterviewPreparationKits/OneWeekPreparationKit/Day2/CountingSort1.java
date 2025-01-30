package InterviewPreparationKits.OneWeekPreparationKit.Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CountingSort1 {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 1, 3, 2, 1);
        List<Integer> countList = countingSort(input);
        System.out.println(countList.toString());
    }

    /*
     * Complete the 'countingSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> countingSort(List<Integer> arr) {
        List<Integer> countList = new ArrayList<Integer>(Collections.nCopies(100, 0));

        for (Integer num : arr) {
            countList.set(num, countList.get(num) + 1);
        }

        return countList;
    }
}