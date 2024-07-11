public class minAbsuluteDiffece {
  public static void main(String[] args) {
    int[] num1 = { 1, 7, 5 };
    int[] num2 = { 2, 3, 5 };
    System.out.println(minAbsoluteSumDiff(num1, num2));
  }

  static public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {

    return -1;
  }

  static public int getMaxnumber(int[] num1) {
    int maxNum = Integer.MIN_VALUE;
    for (int i : num1) {
      maxNum = Math.max(maxNum, i);
    }
    return maxNum;
  }

  static public int getMinnumber(int[] num1) {
    int minNum = Integer.MAX_VALUE;
    for (int i : num1) {
      minNum = Math.min(minNum, i);
    }
    return minNum;
  }

}
