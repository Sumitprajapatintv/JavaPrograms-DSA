package sorting;

import java.util.*;

public class interSectionOfTwoArray {
  public static void main(String[] args) {
    int[] nums1 = { 1, 2, 2, 1 };
    int[] nums2 = { 2, 2 };
    System.out.println(Arrays.toString(intersection(nums1, nums2)));
  }

  static public int[] intersection(int[] nums1, int[] nums2) {
    ArrayList<Integer> arr = new ArrayList<>();
    // HashMap<Integer, Integer> mp = new HashMap<>();
    Set<Integer> set = new HashSet<>();
    for (int i : nums1) {
      set.add(i);
    }
    for (int i = 0; i < nums2.length; i++) {
      if (set.contains(nums2[i])) {
        arr.add(nums2[i]);
        set.remove(nums2[i]);
      }
    }
    int[] ans = new int[arr.size()];

    for (int i = 0; i < arr.size(); i++) {
      ans[i] = arr.get(i);
    }

    return ans;

  }

}
