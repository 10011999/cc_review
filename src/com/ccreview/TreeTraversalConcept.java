package com.ccreview;

import java.lang.NullPointerException;

public class TreeTraversalConcept {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.node = new Node(25);
        // left side
        binaryTree.node.left = new Node(20);
        binaryTree.node.left.right = new Node(22);
        binaryTree.node.left.left = new Node(10);
        binaryTree.node.left.left.right = new Node(12);
        binaryTree.node.left.left.left = new Node(5);

        // right side
        binaryTree.node.right = new Node(36);
        binaryTree.node.right.left = new Node(30);
        binaryTree.node.right.left.left = new Node(28);
        binaryTree.node.right.right = new Node(40);
        binaryTree.node.right.right.left = new Node(38);
        binaryTree.node.right.right.right = new Node(48);
        binaryTree.node.right.right.right.right = new Node(50);

        System.out.println("=== pre order ====");
        preOrderPrint(binaryTree.node);

        System.out.println("\n=== inorder ====");
        inOrderPrint(binaryTree.node);
        System.out.println("\n=== postorder ====");
        postOrderPrint(binaryTree.node);

        System.out.println("\n=== size ====");
        int i = sizeOfTree(binaryTree.node);
        System.out.println(i);

    }

    private static void preOrderPrint(Node root) {
        if (root == null) return;
        System.out.print(root.value + " "); // 25 , 20, 10, 5, 12 , 22, 36, 30, 28, 40, 38, 48
        preOrderPrint(root.left); // preOrderPrint(20) -> preOrderPrint(10) -> preOrderPrint(5) -> preOrderPrint(null) -> preOrderPrint(36) -> preOrderPrint(30) -> preOrderPrint(28) -> preOrderPrint(null) -> preOrderPrint(40), preOrderPrint(38) -> preOrderPrint(null) -> preOrderPrint(48) -> preOrderPrint(null)
        preOrderPrint(root.right); // preOrderPrint(10) -> preOrderPrint(20) -> preOrderPrint(25) -> preOrderPrint(30) -> preOrderPrint(36) -> preOrderPrint(40) -> preOrderPrint(48) -> preOrderPrint(null)
    }

    private static void inOrderPrint(Node root) {
        if (root == null) return;
        inOrderPrint(root.left); // inOrderPrint(25) -> inOrderPrint(20) -> inOrderPrint(10) -> inOrderPrint(5) -> inOrderPrint(null) -> inOrderPrint(36) -> inOrderPrint(30) -> inOrderPrint(28) -> inOrderPrint(null) -> inOrderPrint(40) -> inOrderPrint(38) -> inOrderPrint(null) -> inOrderPrint(48) -> inOrderPrint(null)
        System.out.print(root.value + " "); // 5, 10, 12, 20, 22, 25, 28, 30, 36, 38, 40, 48
        inOrderPrint(root.right); // inOrderPrint(null) -> inOrderPrint(10) -> inOrderPrint(20) - inOrderPrint(25) -> inOrderPrint(28) -> inOrderPrint(null) -> inOrderPrint(30) -> inOrderPrint(null) -> inOrderPrint(36) -> inOrderPrint(38) -> inOrderPrint(null) -> inOrderPrint(40) -> inOrderPrint(48) -> inOrderPrint(null)
    }

    private static int sizeOfTree(Node root) {
        if (root == null) return 0;
        int leftCount = sizeOfTree(root.left); // 20 -> 10 -> 5 -> null [0] -> 36 -> 30 -> 28
        int rightCount = sizeOfTree(root.right); // 2
        return leftCount + rightCount + 1; // 0 + 1+ 1+ 1 = 5 + 2 + 3 = 10 + 1 + 1 = 12
    }

    private static void postOrderPrint(Node root) {
        if (root == null) return;
        postOrderPrint(root.left); // inOrderPrint(25) -> inOrderPrint(20) -> inOrderPrint(10) -> inOrderPrint(5) -> inOrderPrint(null) -> inOrderPrint(36) -> inOrderPrint(30) -> inOrderPrint(28) -> inOrderPrint(null) -> inOrderPrint(40) -> inOrderPrint(38) -> inOrderPrint(null) -> inOrderPrint(48) -> inOrderPrint(null)
        postOrderPrint(root.right); // inOrderPrint(null) -> inOrderPrint(10) -> inOrderPrint(20) - inOrderPrint(25) -> inOrderPrint(28) -> inOrderPrint(null) -> inOrderPrint(30) -> inOrderPrint(null) -> inOrderPrint(36) -> inOrderPrint(38) -> inOrderPrint(null) -> inOrderPrint(40) -> inOrderPrint(48) -> inOrderPrint(null)
        System.out.print(root.value + " "); // 5, 10, 12, 20, 22, 25, 28, 30, 36, 38, 40, 48
    }
}

class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
    }
}

class BinaryTree {
    Node node;
}


