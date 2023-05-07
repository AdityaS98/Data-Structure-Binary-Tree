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
        if (root == null) {
            root = new Node1(item);
            return root;
        }
        if (item < root.value)
            root.left = insertNode(root.left, item);
        else if (item > root.value)
            root.right = insertNode(root.right, item);
        return root;
    }

    public Node1 searchNode(Node1 root, int value) {
        if (root == null)
            return null;
        if (root.value == value)
            return root;
        else if (value < root.value)
            return searchNode(root.left, value);
        else
            return searchNode(root.right, value);
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
        obj.insert(65);
        obj.insert(63);
        obj.insert(67);
        Node1 node = obj.searchNode(obj.root, 63);
        if (node != null) {
            System.out.println("Element is found in binary tree at " + node.value );
        } else {
            System.out.println("Element is not found in binary tree");
        }
    }
}

