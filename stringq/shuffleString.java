package stringq;
import java.util.*;

public class shuffleString {
    public static void main(String[] args){
      String str = new String("codeleet");
      int[] indices={4,5,6,7,0,2,1,3};
      System.out.println(restoreString(str,indices));
    }
    static public String restoreString(String s, int[] indices) {
        char[] ans=new char[indices.length];
        for(int i=0;i<indices.length;i++)
        {
           ans[indices[i]]=s.charAt(i);        
        }
        return new String(ans);
    }
  
}
