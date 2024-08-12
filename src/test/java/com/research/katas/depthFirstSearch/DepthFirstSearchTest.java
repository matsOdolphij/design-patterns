package com.research.katas.depthFirstSearch;

import org.junit.jupiter.api.Test;

import com.research.katas.binaryTree.BinaryTree;

public class DepthFirstSearchTest {

    DepthFirstSearch depthFirstSearch = new DepthFirstSearch();

    @Test
    void inOrder() {
        depthFirstSearch.traverseInOrder(getBinaryTree().getRoot());
    }
    @Test
    void postOrder() {
        depthFirstSearch.traversePostOrder(getBinaryTree().getRoot());
    }

    @Test
    void preOrder() {
        depthFirstSearch.traversePreOrder(getBinaryTree().getRoot());
    }

    private BinaryTree getBinaryTree() {
        BinaryTree root = new BinaryTree();
        root.add(3);
        root.add(4);
        root.add(7);
        root.add(1);
        root.add(2);
        root.add(5);
        root.add(6);
        root.add(8);
        root.add(9);
        root.add(10);
        return root;
    }
}
