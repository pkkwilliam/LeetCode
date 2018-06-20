/*
Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
But the following [1,2,2,null,3,null,3] is not:
    1
   / \
  2   2
   \   \
   3    3
Note:
Bonus points if you could solve it both recursively and iteratively.
 */
package problem101;

import java.util.LinkedList;

public class SymmetricTree {
    public static void main(String[]args){

    }
}
class Solution {
    public boolean isSymmetric(TreeNode root) {
        LinkedList<TreeNode> list = new LinkedList<>();
        LinkedList<Integer> numbers = new LinkedList<>();
        list.add(root);
        list.add(null);
        while(!list.isEmpty()){
            TreeNode current = list.poll();
            while(current != null){
                if(current.left != null)
                    list.add(current.left);
                if(current,right != null)
                    list.add(current.right);
            }
            level++;
        }
    return true;
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
