package InterviewPreparationKits.OneWeekPreparationKit.Day2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class LonelyInteger {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 3, 2, 1);
        int lonely = lonelyInteger(input);
        System.out.println(lonely);
    }

    /*
     * Complete the 'lonelyInteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int lonelyInteger(List<Integer> a) {
        HashSet<Integer> uniqueNumbers = new HashSet<Integer>();

        for (Integer num : a) {
            if (uniqueNumbers.contains(num)) {
                uniqueNumbers.remove(num);
            } else {
                uniqueNumbers.add(num);
            }
        }

        return uniqueNumbers.iterator().next();
    }
}