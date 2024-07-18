package sorting;

import java.util.*;

public class mergeSortedArray {
  public static void main(String[] args) {
    int[] num1 = { 1, 2, 3, 0, 0, 0 };
    int m = 3;
    int n = 3;
    int[] num2 = { 2, 5, 6 };
    merge(num1, m, num2, n);

  }

  static public void merge(int[] nums1, int m, int[] nums2, int n) {
    int i = m;
    int j = 0;
    while (i < m + n) {
      nums1[i] = nums2[j];
      i++;
      j++;
    }
    Arrays.sort(nums1); // o()
    System.out.println(Arrays.toString(nums1));
  }

}
