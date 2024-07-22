package sorting;

import java.util.*;

public class interSectionOfTwoArraySecond {
  public static void main(String[] args) {
    int[] nums1 = { 4, 9, 5 };
    int[] nums2 = { 9, 4, 9, 8, 4 };
    System.out.println(Arrays.toString(intersection(nums1, nums2)));
  }

  static public int[] intersection(int[] nums1, int[] nums2) {
    List<Integer> list1 = new ArrayList<Integer>();
    HashMap<Integer, Integer> mp = new HashMap<>();
    for (int i = 0; i < nums1.length; i++) {
      if (mp.containsKey(nums1[i])) {
        mp.put(nums1[i], mp.get(nums1[i]) + 1);
      } else {
        mp.put(nums1[i], 1);
      }
    }
    for (int i : nums2) {
      if (mp.containsKey(i)) {
        int a = mp.get(i);
        if (a > 0) {
          list1.add(i);
        }
        a--;
        mp.put(i, a);
      }
    }
    int[] ans = new int[list1.size()];

    for (int i = 0; i < list1.size(); i++) {
      ans[i] = list1.get(i);
    }
    return ans;

  }
}
