package com.research.katas.binaryTree;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Node {

    int value;
    @Setter
    Node left;
    @Setter
    Node right;

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}
