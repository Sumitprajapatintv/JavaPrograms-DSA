package sorting;

import java.util.*;

public class relativeSortOfArray {

  public static void main(String[] args)
  {
    int[] arr1 = {2,21,43,38,0,42,33,7,24,13,12,27,12,24,5,23,29,48,30,31}; 
    int[] arr2 = {2,42,38,0,43,21};
    System.out.println(Arrays.toString(relativeSortArray(arr1, arr2)));
  }
  static public int[] relativeSortArray(int[] arr1, int[] arr2) {
   ArrayList<Integer> ans=new ArrayList<>();
   ArrayList<Integer> ans2=new ArrayList<>();
    HashMap<Integer,Integer> hp=new HashMap<>();
    for (int i = 0; i < arr1.length; i++) {
        if (hp.containsKey(arr1[i])) {
          hp.put(arr1[i], hp.get(arr1[i]) + 1);
        } else {
          hp.put(arr1[i], 1);
        }
      }
      for(int i=0;i<arr2.length;i++)
      {
        if(hp.containsKey(arr2[i]))
        {
          int a=hp.get(arr2[i]);
          while (a!=0) {
            ans.add(arr2[i]);
            a--;
          }  
        }
        
      }
    Arrays.sort(arr1);
    System.out.println(ans);
    System.out.println(Arrays.toString(arr1));
    for(int i=0;i<arr1.length;i++)
    {
      if(!ans.contains(arr1[i]))
      {

        ans2.add(arr1[i]);
      }
    }
    for(int i=0;i<ans2.size();i++)
    {

        ans.add(ans2.get(i));
    }
    int[] ansArr=new int[ans.size()];
    for(int i=0;i<ans.size();i++)
    {
      ansArr[i]=ans.get(i);
    }
  return ansArr;
        
  }
  
}
