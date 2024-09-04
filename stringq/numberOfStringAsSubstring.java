package stringq;

public class numberOfStringAsSubstring {
  public static void main(String[] args)
  {
    String[] patterns = {"a","abc","bc","d"};
    String str="abc";
    System.out.println(numOfStrings(patterns, str));

  }
  static public int numOfStrings(String[] patterns, String word) {
      int count=0;
      for(int i=0;i<patterns.length;i++)
      {
        if(word.contains(patterns[i]))
        {
          count++;
        }
      }
      



      return count;
  }
  
}
