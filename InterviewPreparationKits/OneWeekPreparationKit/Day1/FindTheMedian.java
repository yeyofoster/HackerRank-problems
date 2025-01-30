package InterviewPreparationKits.OneWeekPreparationKit.Day1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindTheMedian {

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(0, 1, 2, 4, 6, 5, 3);
        int median = findMedian(input);
        System.out.println(median);
    }

    /*
     * Complete the 'findMedian' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int findMedian(List<Integer> arr) {
        int middle = arr.size() / 2;
        Collections.sort(arr);
        return arr.get(middle);
    }

}