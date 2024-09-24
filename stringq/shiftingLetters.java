package stringq;

import java.util.Arrays;

public class shiftingLetters {
   public static void main(String[] args)
   {
      String str="bad";
      int[] shifts = {10,20,30};
      System.out.println(shifting(str,shifts));
   }  
   
   static public String shifting(String s, int[] shifts) {
    StringBuilder sb = new StringBuilder();
      for(int i=shifts.length-2;i>=0;i--)
      {
         shifts[i]=(shifts[i]+shifts[i+1]) %26;  
      }
      for(int i=0;i<s.length();i++)
      {
        sb.append((char)((s.charAt(i) - 'a'+shifts[i])%26+'a'));
      }
      return sb.toString();

   }
  }
