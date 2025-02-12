package DataStructures.Trees;

import DataStructures.Trees.Common.Node;

public class InorderTraversal {
    public static void main(String[] args) {
        Node root = new Node(1);

        root.right = new Node(2);

        root.right.right = new Node(5);

        root.right.right.left = new Node(3);
        root.right.right.left.right = new Node(4);

        root.right.right.right = new Node(6);

        inOrder(root);
    }

    public static void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }
}