package sorting;

import java.util.Arrays;

public class sortArrayByPriority {
  public static void main(String[] args) {
    int[] arr={4,2,5,7};
    System.out.println(Arrays.toString(sortArrayByParityII(arr)));

  }
  static public int[] sortArrayByParityII(int[] nums) {
        Arrays.sort(nums);
        int[] ans=new int[nums.length];
         int i=0;
         int j=1;
         int count=0;
         while(count<nums.length)
         {
            if(nums[count]%2==0)
            {
                ans[i]=nums[count];
                i=i+2;
            }
            else
            {
                ans[j]=nums[count];
                j=j+2;    
            }
            count++;
         }
        return ans;
    }

}
