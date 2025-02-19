package InterviewPreparationKits.OneWeekPreparationKit.Day6;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class SimpleTextEditor {

    static StringBuilder s = new StringBuilder("");
    static Deque<String> stringStack = new ArrayDeque<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int operations = Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < operations; i++) {
                String line = scanner.nextLine();
                String[] lineSplitted = line.split(" ", 2);
                int operation = Integer.parseInt(lineSplitted[0]);
                String params = (lineSplitted.length > 1) ? lineSplitted[1] : "";

                switch (operation) {
                    case 1:
                        append(params);
                        break;
                    case 2:
                        delete(Integer.parseInt(params));
                        break;
                    case 3:
                        print(Integer.parseInt(params));
                        break;
                    case 4:
                        undo();
                        break;
                    default:
                        System.out.println("Option not valid, try again...");
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void append(String word) {
        stringStack.push(s.toString());
        s.append(word);
    }

    public static void delete(int k) {
        k = Math.min(k, s.length());
        stringStack.push(s.toString());
        s.delete(s.length() - k, s.length());
    }

    public static void print(int k) {
        if (k > 0 && k <= s.length()) {
            System.out.println(s.charAt(k - 1));
        }
    }

    public static void undo() {
        if (!stringStack.isEmpty()) {
            s.setLength(0);
            s.append(stringStack.pop());
        } else {
            System.out.println("Nothing to undo.");
        }
    }
}