package sorting;

import java.util.*;

public class thirdMaximunNumber {
  public static void main(String[] args) {
    int[] nums = { 1, 2147483647, -2147483648 };
    System.out.println(thirdMax(nums));

  }

  static public int thirdMax(int[] nums) {
    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    for (int i : nums) {
      if (!pq.contains(i)) {
        pq.add(i);
      }
    }

    if (pq.size() < 3) {
      return pq.peek();
    }
    for (int i = 0; i < 2; i++) {
      pq.poll();
    }

    return pq.peek();
  }

}
