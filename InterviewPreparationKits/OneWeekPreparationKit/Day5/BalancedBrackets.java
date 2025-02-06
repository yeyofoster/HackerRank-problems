package InterviewPreparationKits.OneWeekPreparationKit.Day5;

import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        String validString = "{[()]}";
        // String invalidString = "{[(])}";
        System.out.println(isBalanced(validString));
    }

    /*
     * Complete the 'isBalanced' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isBalanced(String s) {
        Stack<Character> openBrackets = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                openBrackets.push(c);
            } else {
                if (openBrackets.isEmpty()) {
                    return "NO";
                }

                char lastBracket = openBrackets.pop();
                if ((lastBracket == '(' && c != ')')
                        || (lastBracket == '[' && c != ']')
                        || (lastBracket == '{' && c != '}')) {
                    return "NO";
                }
            }
        }
        return openBrackets.isEmpty() ? "YES" : "NO";
    }
}