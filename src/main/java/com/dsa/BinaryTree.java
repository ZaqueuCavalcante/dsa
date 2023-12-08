package com.dsa;

public class BinaryTree {
    Node root;
    String traverse = "";
    String leafs = "";

    public void add(int value) {
        root = addRecursive(root, value);
    }

    public boolean contains(int value) {
        return containsRecursive(root, value);
    }

    public int maxDepth() {
        int x = maxDepth(root);
        return x == 0 ? x : x - 1;
    }

    public String traverseInOrder() {
        return traverseInOrder(root);
    }

    public String leafNodes() {
        return leafNodes(root);
    }

    private String leafNodes(Node node) {
        if (node != null) {
            leafNodes(node.left);

            if (node.left == null && node.right == null)
                leafs = leafs + " " + node.value;

            leafNodes(node.right);
        }

        return leafs.trim();
    }

    private String traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            traverse = traverse + " " + node.value;
            traverseInOrder(node.right);
        }

        return traverse.trim();
    }

    private int maxDepth(Node node)
    {
        if (node == null) {
            return 0;
        }
        else {
            int leftDepth = maxDepth(node.left);
            int rightDepth = maxDepth(node.right);
 
            if (leftDepth > rightDepth)
                return (leftDepth + 1);

            return (rightDepth + 1);
        }
    }

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }
    
        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        }
        else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        }
    
        return current;
    }

    private boolean containsRecursive(Node current, int value) {
        if (current == null) {
            return false;
        } 
        if (value == current.value) {
            return true;
        } 
        return value < current.value
          ? containsRecursive(current.left, value)
          : containsRecursive(current.right, value);
    }
}
