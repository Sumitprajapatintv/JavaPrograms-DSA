package sorting;
import java.util.*;

public class largestPerimeterTrigle {
  public static void main(String[] args)
  {
    int[] arr={1,2,1,10};
    System.out.println(largestPerimeter(arr));
  }
  static public int largestPerimeter(int[] nums) {
    Arrays.sort(nums);
    for(int i=nums.length-1;i>=2;i--)
    {
      if(nums[i-2]+nums[i-1]>nums[i])
      {
        return nums[i]+nums[i-1]+nums[i-2];
      } 
    }
   return 0;
  }
  
}
