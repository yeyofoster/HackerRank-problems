package InterviewPreparationKits.OneWeekPreparationKit.Day3;

public class TowerBreakers {
    public static void main(String[] args) {
        int n = 2;
        int m = 6;
        int winner = towerBreakers(n, m);
        System.out.println(winner);
    }

    /*
     * Complete the 'towerBreakers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     * 1. INTEGER n
     * 2. INTEGER m
     */

    public static int towerBreakers(int n, int m) {
        if (m == 1) {
            return 2;
        }

        return (n % 2 == 0) ? 2 : 1;
    }
}