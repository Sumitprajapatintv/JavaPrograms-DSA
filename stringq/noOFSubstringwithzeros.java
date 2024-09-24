package stringq;

public class noOFSubstringwithzeros {
  public static void main(String[] args)
  {
      String s="0110111";
      System.out.println(numSub(s));
  }
  static public int numSub(String s) {
    
    int result=0;
    int length=0;
    for(int i=0;i<s.length();i++)
    { 
      if(s.charAt(i)=='1')
      {
        length=length+1;
      }else{
          length=0;
      }
      result=(result+length) % ((int) 1e9 + 7);
    }
    return result;
  }

  
}
