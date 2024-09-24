package stringq;

public class countNumberOfHomogenousString {
  int MOD = (int) 1e9 + 7;
  public static void main(String[] args)
  {
     String st="abbcccaa";
     System.out.println(countHomogenous(st));
  }
  static public int countHomogenous(String s) {
    int result=0;
    int length=0;
    for(int i=0;i<s.length();i++)
    { 
      if(i>0 && s.charAt(i)==s.charAt(i-1))
      {
        length=length+1;
      }else{
          length=1;
      }
      result=(result+length) % ((int) 1e9 + 7);

    }
    return result;
  }
}