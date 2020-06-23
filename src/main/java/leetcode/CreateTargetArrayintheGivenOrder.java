package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/** Author: Ka Kei Pun Date: 6/19/20 Version: 1.0.0 */
public class CreateTargetArrayintheGivenOrder {

  public int[] createTargetArray(int[] nums, int[] index) {
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
      list.add(index[i], nums[i]);
    }
//    return list.stream().mapToInt(i -> i).toArray();
      return createTargetArrayWithLinkedList(nums, index);
  }

  public int[] createTargetArrayWithLinkedList(int[] nums, int[] index) {
    int[] result = new int[nums.length];
    LinkedList<Integer> linkedList = new LinkedList<>();
    for (int i = 0; i < nums.length; i++) {
      linkedList.add(index[i], nums[i]);
    }
    for (int i = 0; i < nums.length; i++) {
        result[i] = linkedList.poll();
    }
    return result;
  }
}
