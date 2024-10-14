package Bitwise;

public class BinaryNumbersWithAlternateBits {
    public static void main(String[] args)
    {
        int n=5;
        System.out.println(hasAlternatingBits(n));
    }
    static public Boolean hasAlternatingBits(int n) {
      int prev=-1;
        while (n!=0) {
          int last=n&1;
          if(prev==last)
          {
            return false;
          }
          prev=last;
          n=n>>1;
        }
      return true;
      }
}



