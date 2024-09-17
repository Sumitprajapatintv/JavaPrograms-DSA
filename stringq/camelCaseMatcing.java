package stringq;
import java.util.*;

import java.util.ArrayList;
import java.util.List;

public class camelCaseMatcing {
  public static void main(String[] args)
  {
    String[] queries={"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"};
    String pattern="FoBa";
    System.out.println(camelMatch(queries, pattern));
  }
  static public List<Boolean> camelMatch(String[] queries, String pattern) {
    List<Boolean> ans=new ArrayList<>();

    for(String words:queries)
    { 
      // String[] str=words.split("(?=[A-Z])");
     ans.add(isMatchPattern(words, pattern));

    }
      return ans;
  } 
  static public Boolean isMatchPattern(String str,String pattern)
  {
    int j = 0;
    for (char c : str.toCharArray())
      if (j < pattern.length() && c == pattern.charAt(j))
        j++;
      else if (Character.isUpperCase(c))
        return false;
    return j == pattern.length();

  }

}
