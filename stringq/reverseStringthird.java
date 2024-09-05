package stringq;

public class reverseStringthird {
  public static void main(String[] args)
  {
      String s = "Let's take LeetCode contest";
      System.out.println(reverseWords(s));
  }
  static public String reverseWords(String s) {
    String[] str=s.split(" ");
    StringBuilder interpreted = new StringBuilder(); 
    for(int i=0;i<str.length;i++)
    {
      char[] ctr=str[i].toCharArray();
      char[] strs=reverseString(ctr);
      interpreted.append(strs);
      interpreted.append(" ");
    }
      return interpreted.toString().replaceAll("\\s+$", "");
  }
  static public char[] reverseString(char[] ctr){
    int i=0;
    int j=ctr.length-1;
    while (i<j) {
       char temp=ctr[i];
       ctr[i]=ctr[j];
       ctr[j]=temp;
       i++;
       j--; 
    }
    // System.out.println(ctr);
    return ctr;
  } 
  
}
