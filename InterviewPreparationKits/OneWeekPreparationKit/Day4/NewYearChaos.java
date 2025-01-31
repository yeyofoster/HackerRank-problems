package InterviewPreparationKits.OneWeekPreparationKit.Day4;

import java.util.Arrays;
import java.util.List;

public class NewYearChaos {
    public static void main(String[] args) {
        List<Integer> q = Arrays.asList(2, 1, 5, 3, 4);
        minimumBribes(q);
    }

    /*
     * Complete the 'minimumBribes' function below.
     *
     * The function accepts INTEGER_ARRAY q as parameter.
     */

    public static void minimumBribes(List<Integer> q) {
        int totalBribes = 0;
        int p1 = 1;
        int p2 = 2;
        int p3 = 3;

        for (int i = 0; i < q.size(); i++) {
            if (q.get(i) == p1) {
                p1 = p2;
                p2 = p3;
                p3++;
            } else if (q.get(i) == p2) {
                totalBribes++;
                p2 = p3;
                p3++;
            } else if (q.get(i) == p3) {
                totalBribes += 2;
                p3++;
            } else {
                System.out.println("Too chaotic");
                return;
            }
        }

        System.out.println(totalBribes);
    }
}