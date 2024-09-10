package stringq;

import java.util.Arrays;

public class longestCommonPrefix {
  public static void main(String[] args)
  {
    String[] strs = {"flower","flow","flight"};
    System.out.println(longestCommonPrefix(strs));
  }

  static public String longestCommonPrefix(String[] strs) {

     StringBuilder result=new StringBuilder();
    Arrays.sort(strs);

    char[] first=strs[0].toCharArray();

    char[] last=strs[strs.length-1].toCharArray();

    for(int i=0;i<first.length;i++)
    { 
        if(first[i]!=last[i])
        {
          break;
        }
        result.append(first[i]);
        
    }
    return result.toString();
  }
  // static public String longestCommonPrefix(String[] strs) {

  //   String prefix=strs[0];

  //   for(int i=0;i<strs.length;i++)
  //   { 
  //     prefix=commonPrefix(prefix,strs[i]);
  //   }
  //   return prefix;
  // }

  // static public String commonPrefix(String str1,String str2) {
  //   String result = ""; 
  //   for(int i=0,j=0;i<str1.length() && j<str2.length();i++,j++)
  //   {
  //     if(str1.charAt(i)!=str2.charAt(j))
  //     {
  //         break;
  //     }
  //     result+=str1.charAt(i);
  //   }
  //   return result;
  // }
  
}
