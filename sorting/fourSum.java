package sorting;
import java.util.*;

public class fourSum {
  public static void main(String[] args)
  {
    int[] nums={1,0,-1,0,-2,2};
    System.out.println(fourSum(nums,0));
  }
  static public List<List<Integer>> fourSum(int[] arr,int target) {
   
    if (arr == null || arr.length < 4) return new ArrayList<>();

    // Sort the elements
    Arrays.sort(arr);
    Set<List<Integer>> result = new HashSet<>();

    // Now fix the first element and find the other two elements
    for (int i = 0; i < arr.length - 3; i++)
    {
      for(int j=i+1;j<arr.length-2;j++)
      {
        int left = j + 1;
        int right = arr.length - 1;
  
        while (left < right) {
          int sum = arr[i] + arr[j]+arr[left] + arr[right];
  
          if (sum == target) {
  
            // Add the set, and move to find other triplets
            result.add(Arrays.asList(arr[i], arr[j],arr[left], arr[right]));
            left++;
            right--;
          } else if (sum < target)
            left++;
          else
            right--;
        }
      }
  
    }
    return new ArrayList<>(result);
  }
  
}
