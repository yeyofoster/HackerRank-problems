package InterviewPreparationKits.OneWeekPreparationKit.Day1;

import java.util.Arrays;
import java.util.List;

public class MiniMaxSum {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 3, 5, 7, 9);
        miniMaxSum(input);
    }

    public static void miniMaxSum(List<Integer> arr) {
        long max = arr.get(0);
        long min = arr.get(0);
        long sum = 0;

        for (Integer num : arr) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        System.out.println(String.format("%d %d", sum - max, sum - min));
    }
}