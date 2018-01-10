// Problem 515
// Find Largest Value in Each Tree Row
// Breadth First Search
import java.util.List;
import java.util.LinkedList;

public class FindLargestValueinEachTreeRow{
    public static void main(String[]args){
        Solution solution = new Solution();
        // 0
        TreeNode tree = new TreeNode(1);
        // 1
        tree.left = new TreeNode(9);
        tree.right = new TreeNode(3);
        // 2
        tree.left.right = new TreeNode(2);

        List result = solution.largestValues(tree);
        for(int i = 0; i < result.size(); i++)
            System.out.print(result.get(i)+" ");
    }
}
class Solution {
    public List<Integer> largestValues(TreeNode root) {
        LinkedList<Integer> result = new LinkedList<Integer>();
        LinkedList<TreeNode> list = new LinkedList<TreeNode>();
        list.add(root);
        if(root == null)
        	return result;
        do{
        	list.add(null);
            TreeNode currentNode = list.pollFirst();
            int localMaximum = Integer.MIN_VALUE;
            while(currentNode != null){
                if(currentNode.left != null)
                    list.add(currentNode.left);
                if(currentNode.right != null)
                    list.add(currentNode.right);
                if(currentNode.val > localMaximum)
                    localMaximum = currentNode.val;
                currentNode = list.pollFirst();
            }
            result.add(localMaximum);
        }while(!list.isEmpty());
        return result;
    }
}
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}
