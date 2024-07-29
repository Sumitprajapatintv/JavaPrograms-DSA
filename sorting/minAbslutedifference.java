package sorting;

import java.util.*;

public class minAbslutedifference {
  public static void main(String[] args)
  {
    int[] arr={3,8,-10,23,19,-4,-14,27};
    System.out.println(minimumAbsDifference(arr));
  }
  static public List<List<Integer>> minimumAbsDifference(int[] arr) {
    Arrays.sort(arr);
    int minDiff=Integer.MAX_VALUE;
    List<List<Integer>> ans =new ArrayList<>();

    for(int i=0;i<arr.length-1;i++)
    {
      int diff=Math.abs(arr[i]-arr[i+1]);
      if(diff<minDiff)
      {
        minDiff=diff;
        ans.clear();
        ans.add((Arrays.asList(arr[i],arr[i+1])));
      }
      else if(minDiff==diff)
      {
        ans.add((Arrays.asList(arr[i],arr[i+1])));
      }
    }
    return ans;

  }
  
}
