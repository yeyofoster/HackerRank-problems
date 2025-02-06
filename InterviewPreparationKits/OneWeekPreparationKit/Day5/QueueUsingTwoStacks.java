package InterviewPreparationKits.OneWeekPreparationKit.Day5;

import java.util.Scanner;

public class QueueUsingTwoStacks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int n = Integer.parseInt(scanner.nextLine());
            QueueStack<Integer> queueStack = new QueueStack<Integer>();

            for (int i = 0; i < n; i++) {
                String line = scanner.nextLine();
                String[] data = line.split(" ");
                if (data[0].equals("1")) {
                    queueStack.enqueue(Integer.parseInt(data[1]));
                } else if (data[0].equals("2")) {
                    queueStack.dequeue();
                } else if (data[0].equals("3")) {
                    System.out.println(queueStack.peek());
                } else {
                    System.out.println("Not valid");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}