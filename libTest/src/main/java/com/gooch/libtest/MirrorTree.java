package com.gooch.libtest;

public class MirrorTree {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(3);
        treeNode.left = treeNode1;
        treeNode.right = treeNode2;
        mirrorNode(treeNode);
        printTree(treeNode);
    }

    private static void printTree(TreeNode treeNode) {
        TreeNode temp=treeNode;
        while (temp != null) {
            System.out.println(treeNode.val);
            if (temp.left != null) {
                System.out.println(temp.left.val);
            }
            if (temp.right != null) {
                System.out.println(temp.right.val);
            }
        }
    }

    private static void mirrorNode(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        TreeNode tempNode;
        tempNode = treeNode.left;
        treeNode.left = treeNode.right;
        treeNode.right = tempNode;

        mirrorNode(treeNode.left);
        mirrorNode(treeNode.right);
    }
}
