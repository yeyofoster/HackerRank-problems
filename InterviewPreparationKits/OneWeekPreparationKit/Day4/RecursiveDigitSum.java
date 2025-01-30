package InterviewPreparationKits.OneWeekPreparationKit.Day4;

public class RecursiveDigitSum {

    public static void main(String[] args) {
        String n = "9875";
        int k = 4;
        int digit = superDigit(n, k);

        System.out.println(digit);
    }

    /*
     * Complete the 'superDigit' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     * 1. STRING n
     * 2. INTEGER k
     */

    public static int superDigit(String n, int k) {
        if (n.length() == 1) {
            return Integer.parseInt(n);
        } else {
            long currentSuperDigit = 0;

            for (int i = 0; i < n.length(); i++) {
                currentSuperDigit += n.charAt(i) - '0';
            }
            currentSuperDigit = currentSuperDigit * k;

            return superDigit(Long.toString(currentSuperDigit), 1);
        }
    }
}