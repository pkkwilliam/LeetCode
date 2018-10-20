package leetcode.common;

import java.util.Random;

public class TreeNode {

    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int x){
        val = x;
    }

    public static TreeNode getTree1(){
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.right = new TreeNode(4);
        return root;
    }

    public static TreeNode getRandomTree(int size, int numberLimit){
        Random random = new Random(numberLimit);
        TreeNode root = new TreeNode(random.nextInt());
        int count = 0;
        while(count < size - 1){

        }
        return root;
    }
}
