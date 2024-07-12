package com.katas.binaryTree;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BinaryTree {

    Node root;

    public void add(int value) {
        root = addRecursive(root, value);
    }

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }
        if (value < current.value) {
            current.left = addRecursive(current.left, value);

        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        }
        return current;
    }

}
