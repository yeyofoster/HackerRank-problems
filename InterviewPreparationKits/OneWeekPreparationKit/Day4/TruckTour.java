package InterviewPreparationKits.OneWeekPreparationKit.Day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TruckTour {
    public static void main(String[] args) {
        List<List<Integer>> petrolPumps = new ArrayList<>();
        petrolPumps.add(Arrays.asList(1, 5));
        petrolPumps.add(Arrays.asList(10, 3));
        petrolPumps.add(Arrays.asList(3, 4));

        int result = truckTour(petrolPumps);

        System.out.println(result);
    }

    /*
     * Complete the 'truckTour' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY petrolPumps as parameter.
     */

    public static int truckTour(List<List<Integer>> petrolPumps) {
        for (int i = 0; i < petrolPumps.size(); i++) {
            if (petrolPumps.get(i).get(0) > petrolPumps.get(i).get(1)) {
                if (isTourCompleted(petrolPumps, i)) {
                    return i;
                }
            }
        }
        return 0;
    }

    public static boolean isTourCompleted(List<List<Integer>> petrolPumps, int startIndex) {
        int petrolAvailable = 0;
        int currentIndex = startIndex;
        int lastPumpIndex = petrolPumps.size() - 1;

        do {
            // Add the petrol from current pump.
            petrolAvailable += petrolPumps.get(currentIndex).get(0);

            // Remove the petrol we use to move to the next pump;
            petrolAvailable -= petrolPumps.get(currentIndex).get(1);

            // If we have negative petrol, we could not get to the next pump.
            if (petrolAvailable < 0) {
                return false;
            } else {
                // Continue the circular circuit until we reach the initial pump.
                if (currentIndex < lastPumpIndex) {
                    currentIndex++;
                } else {
                    currentIndex = 0;
                }
            }
        } while (currentIndex != startIndex);

        return true;
    }
}