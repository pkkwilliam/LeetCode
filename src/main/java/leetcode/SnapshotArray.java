package leetcode;

import java.util.LinkedList;

/**
 * Author: Ka Kei Pun
 * Date: 1/13/20
 * Version: 1.0.0
 */

public class SnapshotArray {

  private int length;
  private LinkedList<Integer>[] snapshotArray;
  private int[] indexLastValue;

  public SnapshotArray(int length) {
    this.length = length;
    indexLastValue = new int[length];
    snapshotArray = new LinkedList[length];
    for (int i = 0; i < length; i++) {
      snapshotArray[i] = new LinkedList<>();
    }
  }

  public void set(int index, int val) {
    indexLastValue[index] = val;
  }

  public int snap() {
    for (int i = 0; i < length; i++) {
      snapshotArray[i].add(indexLastValue[i]);
    }
    return snapshotArray[0].size() - 1;
  }

  public int get(int index, int snap_id) {
    return snapshotArray[index].get(snap_id);
  }
}

/**
 * Your SnapshotArray object will be instantiated and called as such:
 * SnapshotArray obj = new SnapshotArray(length);
 * obj.set(index,val);
 * int param_2 = obj.snap();
 * int param_3 = obj.get(index,snap_id);
 */