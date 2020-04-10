package leetcode;

/**
 * Author: Ka Kei Pun
 * Date: 2/28/20
 * Version: 1.0.0
 */

public class CanPlaceFlowers {

  public boolean canPlaceFlowers(int[] flowerbed, int n) {
    int count = 0;
    for (int i = 0; i < flowerbed.length; i++) {
      if (flowerbed[i] == 1) {
        i++;
      } else if (checkLeftAndRightIsEmpty(flowerbed, i)){
          count += 1;
          i++;
      }
    }
    return count >= n;
  }

  protected boolean checkLeftAndRightIsEmpty(int[] flowerbed, int index) {
    if (index == 0) {
      return  flowerbed.length == 1 || checkRight(flowerbed, index);
    } else if (index == flowerbed.length - 1) {
      return checkLeft(flowerbed, index);
    } else {
      return checkLeft(flowerbed, index) && checkRight(flowerbed, index);
    }
  }

  protected boolean checkLeft(int[] flowerbed, int index) {
    return index - 1 > 0 && flowerbed[index - 1] == 0;
  }

  protected boolean checkRight(int[] flowerbed, int index) {
    return index + 1 < flowerbed.length && flowerbed[index + 1] == 0;
  }

}
