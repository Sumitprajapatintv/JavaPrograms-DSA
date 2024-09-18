package stringq;
import java.util.*;

public class minimumTimeDiffernce {
  public static void main(String[] args)
  {
     List<String> timePoints=Arrays.asList("00:00","23:59","00:00");
      // String[] timePoints = {"23:59","00:00"};
      System.out.println(findMinDifference(timePoints));
  }
  static public int findMinDifference(List<String> timePoints) {
    // if(timePoints.size()>24*60)
    // {
    //   return 0;
    // }
    List<Integer> timesMinute=new ArrayList<>();
    for(String timeStamp:timePoints)
    { 
      int toalMinute=Integer.parseInt(timeStamp.split(":")[0])*60+Integer.parseInt(timeStamp.split(":")[1]);
      timesMinute.add(toalMinute);
    }
    Collections.sort(timesMinute);
    timesMinute.add(timesMinute.get(0)+24*60);
    // System.out.println(timesMinute.toString());
    int minDiff=24*60;
    for(int i=1;i<timesMinute.size();i++)
    {
      minDiff = Math.min(minDiff, timesMinute.get(i) - timesMinute.get(i - 1));
    }
    return minDiff;
  }
  
}
