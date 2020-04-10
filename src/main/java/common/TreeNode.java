package common;

import java.util.*;

public class TreeNode {

    public Integer val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(Integer x){
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

    public static TreeNode getCompleteBinaryTree(int size) {
        size += 1;
        TreeNode root = new TreeNode(1);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        for (int i = 1; i < size; i += 2) {
            int left = i + 1, right = i + 2;
            TreeNode currentNode = queue.poll();
            if (left < size) {
                currentNode.left = new TreeNode(left);
                queue.add(currentNode.left);
            }
            if (right < size) {
                currentNode.right = new TreeNode(right);
                queue.add(currentNode.right);
            }
        }
        return root;
    }

    public static TreeNode constructTreeFromInteger(Integer...numbers) {
        if (numbers.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(numbers[0]);
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        for (int i = 1; i < numbers.length; i += 2) {
            TreeNode currentNode = queue.poll();
            if (i < numbers.length && numbers[i] != null) {
                currentNode.left = new TreeNode(numbers[i]);
                queue.add(currentNode.left);
            }
            if (i + 1 < numbers.length && numbers[i + 1] != null) {
                currentNode.right = new TreeNode(numbers[i + 1]);
                queue.add(currentNode.right);
            }
        }
        return root;
    }

    public static Integer[] convertTreeNodeToArray(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.poll();
            list.add(currentNode != null ? currentNode.val : null);
            if (currentNode != null) {
                queue.add(currentNode.left);
                queue.add(currentNode.right);
            }
        }
        return (Integer[])list.toArray();
    }

}
