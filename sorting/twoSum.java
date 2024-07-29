package sorting;
import java.util.*;

public class twoSum {
  public static void main(String[] args)
  {
    int[] arr={3,3};

    int target=6;

    System.out.println(Arrays.toString(twoSum(arr,target)));
  }
  static public int[] twoSum(int[] nums, int target) {
      HashMap<Integer,Integer> mp=new HashMap<>();
      for(int i=0;i<nums.length;i++)
      {
        if(!mp.containsKey(target-nums[i]))
        {
          mp.put(nums[i],i);
        }
        else{
          return new int[] {mp.get(target-nums[i]),i};
        }
      }
      return new int[] {};
  }
  
}
