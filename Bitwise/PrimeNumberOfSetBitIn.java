package Bitwise;

public class PrimeNumberOfSetBitIn {
  public static void main(String[] args)
  {
    System.out.println(countPrimeSetBits(6, 10));
  }
  static int countPrimeSetBits(int left, int right) {
      int ctr=0;
      for(int i=left;i<=right;i++)
    {
        int count=0;
        int num=i;
        System.out.println(num);
          while (num>0) {
            int last=num&1;
            if(last==1)
            {
              count++;
            }
            num=num>>1;
          }
          if(checkPrime(count))ctr++;;
      }


      return ctr;
  }
  static public boolean checkPrime(int n)
  {
    if(n<=1)return false;
    for(int i=2;i<=n/2;i++)
    {
      if(n%i==0)
      {
        return false;
      }
    }
    return true;
  }
}
