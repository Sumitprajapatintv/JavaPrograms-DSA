package stringq;

public class stringAlike {
  public static void main(String[] args)
  {
    String str = "book";
    System.out.println(halvesAreAlike(str));
  }
  static public boolean halvesAreAlike(String s) {
    char[] cArray = s.toCharArray();
     int partACount=0;
     int partBCount=0;
     for(int i=0;i<cArray.length/2;i++)
     {
      char c = cArray[i];
      if(c=='a' || c=='e' || c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
      {
        partACount++;
      }
     }
      for(int i=(cArray.length/2);i<cArray.length;i++)
     {
      char c = cArray[i];
      if(c=='a' || c=='e' || c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
      {
        partBCount++;
      }
     }
      System.out.println(partBCount);
       System.out.println(partACount);
     if(partACount==partBCount) return true;
      else return false;
  } 
  
}
