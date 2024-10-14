package Bitwise;
import java.util.*;

public class BinaryGap {
    public static void main(String[] args)
    {
      System.out.println(binaryGap(22));
    }
    static public int binaryGap(int n) {
      int prev=-1;
      int count=0;
      int ans=Integer.MIN_VALUE;
      System.out.println(ans);
      while (n!=0) {
        int last=n&1;
        count++;
        if(last==1)
        {
          prev=last;
          ans=Math.max(ans,count-prev);
        }
        n=n>>1;
      }
      return ans;
    }
  
}
// 1  1  0  1  1  0


// 6  5  4  3  2  1


// 0 1 1 0 1 1 