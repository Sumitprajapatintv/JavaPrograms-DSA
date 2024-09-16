package stringq;
import java.util.*;

public class reversePrefixOfWord {
  public static void main(String[] args)
  {
      String abcdefd="abcdefd";
      char ch='d';
      System.out.println(reversePrefix(abcdefd, ch));
  }
  static public String reversePrefix(String word, char ch) {
    StringBuilder s=new StringBuilder();
    int index=word.indexOf(ch);
    String string1=word.substring(0, index+1);
    String string2=word.substring(index+1);
    s.append(string1);
    s.reverse();
    s.append(string2);
    return s.toString();
  }   
  
}
