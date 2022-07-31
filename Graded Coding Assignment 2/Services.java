package com.GreatLearning.GradedAssignment2;

public class Services {
    static public class Node{

        int key;
        public Node left;
        public Node right;

        public Node(int key) {
            this.key = key;
            left = null;
            right = null;
        }
    }

    public Node node;
    public Node headnode = null;
    public Node prevnode = null;

    public void BinaryTreeToSkewed(Node root) {

        if (root == null) {
            return;
        }
        BinaryTreeToSkewed(root.left);
        Node rightNode = root.right;

        if (headnode == null) {
            headnode = root;
            root.left = null;
            prevnode = root;
        }
        else {
            prevnode.right = root;
            root.left = null;
            prevnode = root;
        }

        BinaryTreeToSkewed(rightNode);

    }

    public void traverseSkewed(Node root) {

        if(root == null) {
            return;
        }

        System.out.print(root.key + " ");
        traverseSkewed(root.right);
    }
}
