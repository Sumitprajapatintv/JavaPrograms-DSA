package sorting;

import java.util.Arrays;

public class largestNumber {
  public static void main(String[] args)
  {
    int[] arr={3,30,34,5,9};
    System.out.println(largestNumber(arr));
  }
  static public String largestNumber(int[] nums) {

    String[]  str=new String[nums.length]; 
   for(int i=0;i<nums.length;i++)
   {  
      str[i]=nums[i]+"";
   }
   Arrays.sort(str,(s1,s2)->(s1+s2).compareTo(s2+s1));
   
   StringBuilder s=new StringBuilder("");

   for(int i=str.length-1;i>=0;i--)
   {
      s.append(str[i]);
   }
   if(s.charAt(0)=='0')
   {
    return "0";
   }
   else
   return s.toString();
  
  }

}