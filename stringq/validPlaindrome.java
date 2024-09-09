package stringq;
import java.util.*;

public class validPlaindrome {
  public static void main(String[] args)
  {
    String str="A man, a plan, a canal: Panama";
    System.out.println(isPalindrome(str));
  }
  static public boolean isPalindrome(String s) {

    StringBuilder st=new StringBuilder();
    String str2=s.toLowerCase();
    System.out.println(str2);
  for(int i=0;i<str2.length();i++)
    {
       if((str2.charAt(i)>=97 && str2.charAt(i)<=122) ||  (str2.charAt(i)>=48 && str2.charAt(i)<58))
       {
          st.append(str2.charAt(i));
       }
    }
    int i=0;
    int j=st.length()-1;
    System.out.println(st.toString());
    while (i<j) {
      if(st.charAt(i)==st.charAt(j))
      {
        i++;
        j--;
      }
      else{
        return false;
      }
    }
  
    return true;
  }
  
}
