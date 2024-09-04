package stringq;

public class decryptString {
  public static void main(String[] args)
  {
    String s="10#11#12";
    // jkab
    System.out.println(freqAlphabets(s));
  }
  static public String freqAlphabets(String s) {
    char[] cArray = s.toCharArray();
    StringBuilder interpreted = new StringBuilder();
    int index=0;
    int strLen=s.length();
    while (index<strLen) {
      if(index+2<strLen && s.charAt(index+2)=='#')
      {
        interpreted.append(decode(s.substring(index, index+2)));
        index+=3;
      }
      else{
        interpreted.append(decode(s.substring(index, index+1)));
        index+=1;
      }
     
      
    }
    return interpreted.toString();
  }
  static public char decode(String numericString) {
    // Subtract '1' because 'a' corresponds to '1', 'b' to '2', and so on.
    // Parse the numeric string to an integer, subtract 1, and then add it to the char 'a'
    return (char) ('a' + Integer.parseInt(numericString) - 1);
}
  
}
