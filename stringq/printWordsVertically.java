package stringq;

import java.util.ArrayList;
import java.util.List;

public class printWordsVertically {
  public static void main(String[] args)
  {
    String s = "CONTEST IS COMING";
    System.out.println(printVertically(s));
  }
  static public List<String> printVertically(String s) {
    List<String> ans=new ArrayList<>();
      String[] str=s.split(" ");
      int maxLength=0;
      for(String word:str)
      {
        maxLength=Math.max(maxLength, word.length());
      }
      for(int i=0;i<maxLength;i++)
      {
          StringBuilder sc=new StringBuilder();
          for(String words:str)
          {
            if(i>=words.length()) sc.append(" ");
              else sc.append(words.charAt(i));
          }
          ans.add(trimRight(sc.toString()));

      }
     
    return ans;
  }
  static public String trimRight(String str)
  {
    int i=str.length()-1;
    while(i>-1)
    {
      if(str.charAt(i)!=' ')
      {
        return str.substring(0, i+1);
      }
      i++;
    }
    return null;
  }
  
}
