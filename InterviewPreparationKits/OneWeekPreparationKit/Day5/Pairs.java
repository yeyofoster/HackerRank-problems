package InterviewPreparationKits.OneWeekPreparationKit.Day5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Pairs {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        int k = 1;

        int result = pairs(k, numbers);

        System.out.println(result);
    }

    /*
     * Complete the 'pairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     * 1. INTEGER k
     * 2. INTEGER_ARRAY arr
     */
    public static int pairs(int k, List<Integer> arr) {
        int pairs = 0;
        HashSet<Integer> complements = new HashSet<Integer>();

        // First for to identify complements.
        for (Integer num : arr) {
            complements.add(num + k);
        }

        // Second for to identify pairs.
        for (Integer num : arr) {
            if (complements.contains(num)) {
                pairs++;
            }
        }

        return pairs;
    }
}