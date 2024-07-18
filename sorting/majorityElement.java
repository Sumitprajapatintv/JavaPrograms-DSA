package sorting;

import java.util.*;

import java.util.HashMap;

public class majorityElement {
  public static void main(String[] args) {
    int[] num1 = { 2, 2, 1, 1, 1, 2, 2 };
    System.out.println(majorityElements(num1));

  }

  // static public int majorityElements(int[] nums) {
  // int maxCount = 0;
  // int index = -1;
  // for (int i = 0; i < nums.length; i++) {
  // int count = 0;
  // for (int j = 0; j < nums.length; j++) {
  // if (nums[i] == nums[j]) {
  // count++;
  // }
  // }
  // if (count > maxCount) {
  // maxCount = count;
  // index = i;
  // }
  // }
  // if (maxCount > nums.length / 2) {
  // return nums[index];
  // }
  // return -1;
  // } This takes O(n2) complexity Lets Slove this using hashMap
  static public int majorityElements(int[] nums) {
    HashMap<Integer, Integer> mp = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (mp.containsKey(nums[i])) {
        int elementCount = mp.get(nums[i]);
        // System.out.println(elementCount);
        mp.put(nums[i], elementCount + 1);
      } else {
        mp.put(nums[i], 1);
      }
      if (mp.get(nums[i]) > nums.length / 2) {
        return nums[i];
      }
    }
    // System.out.println(mp);
    return -1;
  }
}
