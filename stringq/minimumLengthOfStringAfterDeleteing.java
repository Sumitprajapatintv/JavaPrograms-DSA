package stringq;

/*
 * Given a string s consisting only of characters 'a', 'b', and 'c'. You are asked to apply the following algorithm on the string any number of times:

Pick a non-empty prefix from the string s where all the characters in the prefix are equal.
Pick a non-empty suffix from the string s where all the characters in this suffix are equal.
The prefix and the suffix should not intersect at any index.
The characters from the prefix and suffix must be the same.
Delete both the prefix and the suffix.
Return the minimum length of s after performing the above operation any number of times (possibly zero times).


 */

public class minimumLengthOfStringAfterDeleteing {
   public static void main(String[] args)
    {
      String s="aabccabba";
      System.out.println(minimumLength(s));
   }
   static public int minimumLength(String s) {
    
    int i=0;
    int j=s.length()-1;

    while (i<=j && s.charAt(i) == s.charAt(j)) {
        char c = s.charAt(i);
      while(s.charAt(i)==c && i<=j)
       {
          i++; 
       }
       while(s.charAt(j)==c && i<=j)
       {
          j--;
       }
    }
    // if((j-i+1)<-1) return 0;
    return j-i+1;
   }
}
