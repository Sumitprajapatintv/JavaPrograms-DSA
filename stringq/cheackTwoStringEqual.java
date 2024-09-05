package stringq;

public class cheackTwoStringEqual {
  public static void main(String[] args)
  {
    String[] word1 = {"ab", "c"};
    String[] word2 = {"a", "bc"};
    System.out.println(arrayStringsAreEqual(word1,word2));
  }
  static public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
      String st1=String.join("", word1);
      String st2=String.join("", word2);
      return st1.equals(st2);
  }
}
