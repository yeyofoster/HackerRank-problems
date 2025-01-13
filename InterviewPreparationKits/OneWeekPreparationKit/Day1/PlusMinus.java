package InterviewPreparationKits.OneWeekPreparationKit.Day1;

import java.util.Arrays;
import java.util.List;

public class PlusMinus {
    public static void main(String[] args) {
        // List<Integer> input = Arrays.asList(1, 1, 0, -1, -1);
        List<Integer> input = Arrays.asList(-4, 3, -9, 0, 4, 1);
        plusMinus(input);
    }

    public static void plusMinus(List<Integer> arr) {
        float positivesCounter = 0;
        float negativesCounter = 0;
        float zerosCounter = 0;
        int n = arr.size();

        for (Integer num : arr) {
            if (num > 0) {
                positivesCounter++;
            } else if (num < 0) {
                negativesCounter++;
            } else {
                zerosCounter++;
            }
        }

        System.out.println(String.format("%.6f", positivesCounter / n));
        System.out.println(String.format("%.6f", negativesCounter / n));
        System.out.println(String.format("%.6f", zerosCounter / n));
    }
}