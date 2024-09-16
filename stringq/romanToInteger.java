package stringq;
import java.util.*;

public class romanToInteger {
    public static void main(String[] args)
    {
      String str="MCMXCIV";
      System.out.println(romanToInt(str));
    }
    static public int romanToInt(String s) {
       int sum=0;
       Map<Character,Integer> mp=new HashMap<>();    
       mp.put('M',1000);
       mp.put('D',500);
       mp.put('C',100);
       mp.put('L',50);
       mp.put('X',10);
       mp.put('V',5);
       mp.put('I',1);

      int i=0;
      while(i<s.length())
      {
        if(i+1<s.length() && mp.get(s.charAt(i))<mp.get(s.charAt(i+1)))
        {
          System.out.println(mp.get(s.charAt(i)));
          sum-=mp.get(s.charAt(i));
        }
        else{
          System.out.println(mp.get(s.charAt(i)));
          sum+=mp.get(s.charAt(i));
        }
        i++;
      }  
       return sum;
    }
  
}
