package sorting;

import java.util.*;
import java.util.ArrayList;
public class threeSumClosest {
  public static void main(String[] args){
    int[] arr={-1,2,1,-4};
    int target=1;
    System.out.println(threeSumClosests(arr,target));
  }
  
  static public int threeSumClosests(int[] arr, int target) {
        
    if (arr == null || arr.length < 3) return 0;
     int differnece=Integer.MAX_VALUE;
     int resultSum= arr[0] + arr[1] + arr[2];
    // Sort the elements
    Arrays.sort(arr);
    Set<List<Integer>> result = new HashSet<>();

    // Now fix the first element and find the other two elements
    for (int i = 0; i < arr.length - 2; i++)
    {
      // Find other two elements using Two Sum approach
      int left = i + 1;
      int right = arr.length - 1;

      while (left < right) {
        
        int sum = arr[i] + arr[left] + arr[right];
         
        if (sum == target) {
          return target;
        } else if (sum < 0)
          left++;
        else{
          right--;
        }
        int diff=Math.abs(target-sum);
        if(diff<differnece)
        {
          resultSum=sum;
          differnece=diff;
        }
      }
    }
    return resultSum;
  }
  }

