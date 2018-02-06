/*
501. Find Mode in Binary Search Tree
Given a binary search tree (BST) with duplicates, find all the mode(s) (the most frequently occurred element) in the given BST.

Assume a BST is defined as follows:

The left subtree of a node contains only nodes with keys less than or equal to the node's key.
The right subtree of a node contains only nodes with keys greater than or equal to the node's key.
Both the left and right subtrees must also be binary search trees.
For example:
Given BST [1,null,2,2],
   1
    \
     2
    /
   2
return [2].

Note: If a tree has more than one mode, you can return them in any order.

Follow up: Could you do that without using any extra space? (Assume that the implicit stack space incurred due to recursion does not count).

Use Travese will be much quicker
*/
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class FindModeinBinarySearchTree{
    public static void main(String[]args){
        Solution solution = new Solution();
        TreeNode t1 = new TreeNode(1);
        t1.right = new TreeNode(2);
        t1.right.left = new TreeNode(2);
        t1.right.left.right = new TreeNode(3);
        t1.right.left.right.right = new TreeNode(3);
        int[] result = solution.findMode(t1);
        for(int i : result)
            System.out.print(i+" ");
    }
}
class Solution {
    Map<Integer, Integer> map = new HashMap<Integer,Integer>();
    ArrayList<Integer> list = new ArrayList<Integer>();
    public int[] findMode(TreeNode root) {
        dfsNode(root);
        int mode = 0;
        for(int i : map.keySet())
            if(map.get(i) == mode)
                list.add(i);
            else if(map.get(i) > mode){
                mode = map.get(i);
                list.clear();
                list.add(i);
            }
        return list.stream().mapToInt(i->i).toArray();
    }
    private void dfsNode(TreeNode node){
        if(node == null)
            return;
        int value = node.val;
        if(map.get(value) == null)
            map.put(value, 1);
        else{
            map.put(value, map.get(value) + 1);
        }
        dfsNode(node.left);
        dfsNode(node.right);
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; };
}