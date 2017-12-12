// Problem 2
// AddTwoNumbers

public class AddTwoNumbers{
    public static void main(String[]args){
    	Solution solution = new Solution();
    	// set 1 243 + 564
            ListNode h1 = new ListNode(2);
            h1.next = new ListNode(4);
            h1.next.next = new ListNode(3);

            ListNode h2 = new ListNode(5);
            h2.next = new ListNode(6);
            h2.next.next = new ListNode(4);

            print(solution.addTwoNumbers(h1,h2));

    	// set 2 5 + 5
            ListNode h3 = new ListNode(5);
            ListNode h4 = new ListNode(5);

            print(solution.addTwoNumbers(h3,h4));
    	// set 3 18 + 3
            ListNode h5 = new ListNode(1);
            h5.next = new ListNode(8);

            ListNode h6 = new ListNode(3);

            print(solution.addTwoNumbers(h5,h6));
            
    }
    static void print(ListNode list){
    	while (list != null){
    		System.out.print(list.val+" ");
    		list = list.next;
    	}
    	System.out.println("");
    }
}
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { 
      	val = x; }
}
class Solution{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	int carry = 0;
    	ListNode result = new ListNode(0);
        ListNode currentNode = result, currentLeft = l1, currentRight = l2;
        while(currentLeft != null || currentRight != null){
        	int leftVal = (currentLeft == null) ? 0 : currentLeft.val;
        	int rightVal = (currentRight == null) ? 0 : currentRight.val;
            int sum = leftVal + rightVal + carry;
            
            carry = sum / 10;
            currentNode.next = new ListNode(sum % 10);
            currentNode = currentNode.next;

            if(currentLeft != null)
            	currentLeft = currentLeft.next;
            if(currentRight != null)
            	currentRight = currentRight.next;
        }
        if(carry != 0){
        	currentNode.next = new ListNode(carry);
        }
        return result.next;
    }
}