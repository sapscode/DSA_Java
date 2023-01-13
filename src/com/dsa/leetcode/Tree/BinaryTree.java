package com.dsa.leetcode.Tree;

import java.util.Arrays;

import static com.dsa.leetcode.Tree.BalanceBT.*;
import static com.dsa.leetcode.Tree.MaxDepth.*;
import static com.dsa.leetcode.Tree.DiameterBT.*;
import static com.dsa.leetcode.Tree.MaxPathSum.*;
import static com.dsa.leetcode.Tree.ZigZagLevelOrder.*;
import static com.dsa.leetcode.Tree.VerticalOrder.*;

public class BinaryTree {
    private static TreeNode root;

    public static class TreeNode {
        TreeNode left;
        TreeNode right;
        int val; //this should be generic type

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public static void create() {
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        TreeNode sixth = new TreeNode(6);
        TreeNode seventh = new TreeNode(7);

        root = first; // root ---> first
        first.left = second;
        first.right = third;// second <--- first ---> third

        second.left = fourth;
        second.right = sixth; // fourth <--- second ---> sixth

        third.left = fifth; //
        third.right = seventh; // fifth <--- third ---> seventh
    }

    public static void main(String[] args) {
        create();
    }
}