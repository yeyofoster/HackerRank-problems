package InterviewPreparationKits.OneWeekPreparationKit.Day3;

public class CaesarCipher {

    public static void main(String[] args) {
        String s = "middle-Outz";
        int k = 2;

        String caesarString = caesarCipher(s, k);

        System.out.println(s);
        System.out.println(caesarString);
    }

    /*
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     * 1. STRING s
     * 2. INTEGER k
     */

    public static String caesarCipher(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (char character : s.toCharArray()) {
            if (Character.isLowerCase(character)) {
                sb.append((char) ('a' + (character - 'a' + k) % 26));
            } else if (Character.isUpperCase(character)) {
                sb.append((char) ('A' + (character - 'A' + k) % 26));
            } else {
                sb.append(character);
            }
        }
        return sb.toString();
    }
}