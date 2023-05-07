package com.binarytree;



class Node1 {
    int value;
    Node1 left, right;

    Node1(int value) {
        this.value = value;
        left = null;
        right = null;
    }
}

class BinaryTreeSearch {
    Node1 root;

    BinaryTreeSearch() {
        root = null;
    }

    public void insert(int item) {
        root = insertNode(root, item);
    }

    public Node1 insertNode(Node1 root, int item) {
        if (root == null)
        {
            root = new Node1(item);
            return root;
        }
        if (item < root.value)
            root.left = insertNode(root.left, item);
        else if (item > root.value)
            root.right = insertNode(root.right, item);
        return root;
    }

    public void print(Node1 ptr) {
        if (ptr == null)
            return;
        print(ptr.left);
        System.out.print(ptr.value + " ");
        print(ptr.right);
    }

}

public class Treesearch {
    public static void main(String[] args) {

        BinaryTreeSearch obj = new BinaryTreeSearch();
        obj.insert(56);
        obj.insert(30);
        obj.insert(70);

        obj.print(obj.root);
    }
}

