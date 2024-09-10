package stringq;

public class maximumRepetingSubstring {
     public static void main(String[] args)
     {
        String sequence = "aaabaaaabaaabaaaabaaaabaaaabaaaaba";
        String  word = "aaaba";
        System.out.println(maxRepeating(sequence, word));
     }
     static public int maxRepeating(String sequence, String word) {
      String tobeFound=word;
      int count=0;
      // System.out.print(sequence.substring(2, 4));
      int i=0;
      if(sequence.equals(word)) return 1;
      while(sequence.contains(tobeFound))
      {
        tobeFound+=word;
        count++;
      }

      return count;
     }
}
