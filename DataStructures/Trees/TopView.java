package DataStructures.Trees;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

import DataStructures.Trees.Common.Node;
import DataStructures.Trees.Common.NodeUtils;

public class TopView {
    /*
    1
    \
     2
      \
       5
      /  \
     3    6
      \
       4
     */
    public static void main(String[] args) {
        Node root = new Node(1);
        // TC1
        // 1 2 5 3 6 4
        // NodeUtils.insert(root, 2);
        // NodeUtils.insert(root, 5);
        // NodeUtils.insert(root, 3);
        // NodeUtils.insert(root, 6);
        // NodeUtils.insert(root, 4);

        // TC2
        // 1 14 3 7 4 5 15 6 13 10 11 2 12 8 9
        // 2 1 14 15 12 (Expected output)
        NodeUtils.insert(root, 14);
        NodeUtils.insert(root, 3);
        NodeUtils.insert(root, 7);
        NodeUtils.insert(root, 4);
        NodeUtils.insert(root, 5);
        NodeUtils.insert(root, 15);
        NodeUtils.insert(root, 6);
        NodeUtils.insert(root, 13);
        NodeUtils.insert(root, 10);
        NodeUtils.insert(root, 11);
        NodeUtils.insert(root, 2);
        NodeUtils.insert(root, 12);
        NodeUtils.insert(root, 8);
        NodeUtils.insert(root, 9);

        topView(root);
    }

    public static void topView(Node root) {
        // Handling case for null node.
        if (root == null) {
            return;
        }

        // TreeMap to save and keep the distance in order.
        Map<Integer, Node> distances = new TreeMap<Integer, Node>();

        // Queue for BFS: stores pairs (horizontal distance, node).
        Queue<DistanceNode> processQueue = new LinkedList<DistanceNode>();
        processQueue.add(new DistanceNode(0, root));

        // Cycle to process all nodes in the processQueue.
        while (!processQueue.isEmpty()) {
            DistanceNode currentDistanceNode = processQueue.remove();
            Node currentNode = currentDistanceNode.node;
            int distance = currentDistanceNode.distance;

            // Save only the first node found at each horizontal distance.
            distances.putIfAbsent(distance, currentDistanceNode.node);

            // Adding children to the queue with their corresponding distance.
            if (currentNode.left != null) {
                processQueue.add(new DistanceNode(distance - 1, currentNode.left));
            }

            if (currentNode.right != null) {
                processQueue.add(new DistanceNode(distance + 1, currentNode.right));
            }
        }

        // Print the nodes in order of horizontal distance
        for (Map.Entry<Integer, Node> entry : distances.entrySet()) {
            System.out.print(entry.getValue().data + " ");
        }
    }

    public static class DistanceNode {
        int distance;
        Node node;

        public DistanceNode(int distance, Node node) {
            this.distance = distance;
            this.node = node;
        }
    }
}