package com.demos.design.composite;

/**
 * Created by fumenyaolang on 2016-01-07.
 */
public class Tree {
    private TreeNode root = null;

    public Tree(String s) {
        root = new TreeNode(s);
    }

    public static void main(String[] args) {
        Tree tree = new Tree("A");
        TreeNode nodeB = new TreeNode("B");
        TreeNode NodeC = new TreeNode("C");

        nodeB.setParent("A");
        nodeB.add(NodeC);
        tree.root.add(nodeB);

    }
}
