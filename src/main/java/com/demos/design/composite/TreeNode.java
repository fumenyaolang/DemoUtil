package com.demos.design.composite;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by fumenyaolang on 2016-01-07.
 */
public class TreeNode {
    private String name;
    private String parent;
    private Vector<TreeNode> children = new Vector<TreeNode>();

    public TreeNode(String name){
        this.name = name;
    }
    //add
    public void add(TreeNode node) {
        children.add(node);
    }

    //remove
    public void remove(TreeNode node) {
        this.remove(node);
    }

    //get children
    public Enumeration<TreeNode> getChildren() {
        return children.elements();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }
}
