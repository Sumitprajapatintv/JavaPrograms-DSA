package sorting;

public class missingNumber {
  public static void main(String[] args) {
    int[] nums = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
    System.out.println(missingNumbers(nums));
  }

  static public int missingNumbers(int[] nums) {
    int i = 0;
    while (i < nums.length) {
      int correct = nums[i];
      if (nums[i] < nums.length && nums[i] != nums[correct]) {
        swap(nums, i, correct);
      } else {
        i++;
      }
    }
    for (int k = 0; k < nums.length; k++) {
      if (k != nums[k]) {
        return k;
      }
    }
    return nums.length;

  }

  static public void swap(int[] nums, int a, int b) {
    int temp = nums[a];
    nums[a] = nums[b];
    nums[b] = temp;
  }

}
