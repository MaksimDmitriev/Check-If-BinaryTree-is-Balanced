package com.app;

public class Solution {

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int d_left = getDepth(root.left);
        if (d_left == -1) {
            return false;
        }
        int d_right = getDepth(root.right);
        if (d_right == -1) {
            return false;
        }
        return Math.abs(d_left - d_right) <= 1;
    }

    private int getDepth(TreeNode root) {
        if (root != null) {
            int d_left = getDepth(root.left);
            if (d_left == -1) {
                return -1;
            }
            int d_right = getDepth(root.right);
            if (d_right == -1) {
                return -1;
            }
            return Math.abs(d_left - d_right) > 1 ? -1 : Math.max(d_left, d_right) + 1;
        }
        return 0;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            return Integer.toString(val);
        }
    }

}
