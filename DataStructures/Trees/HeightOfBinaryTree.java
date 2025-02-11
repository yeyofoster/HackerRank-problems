package DataStructures.Trees;

public class HeightOfBinaryTree {

    /*
     *     3
     *  5     2 
     * 1 4   6 7
     */
    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(5);
        root.right = new Node(2);

        root.left.left = new Node(1);
        root.left.right = new Node(4);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(height(root));
    }

    public static int height(Node root) {
        if (root == null) {
            return -1;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }
}