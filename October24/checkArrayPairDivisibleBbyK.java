package October24;
import java.util.*;

public class checkArrayPairDivisibleBbyK {
  public static void main(String[] args)
  {
    int[] arr={1,2,3,4,5,10,6,7,8,9};
    System.out.println(canArrange(arr,5));
  }
  static public boolean canArrange(int[] arr, int k) {
    int i=0;
    int j=arr.length-1;
    while(i<j)
    {
       System.out.println((arr[i]+arr[j])%5);
       if((arr[i]+arr[j]%k!=0)) return false;
       else
       {
           i++;
           j--;
       }
    }
    return true;
}
  




}
