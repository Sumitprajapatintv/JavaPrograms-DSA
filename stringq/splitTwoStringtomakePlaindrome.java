package stringq;

public class splitTwoStringtomakePlaindrome {
  public static void main(String[] args)
  {
    String a="aejbaalflrmkswrydwdkdwdyrwskmrlfqizjezd";
    String b="uvebspqckawkhbrtlqwblfwzfptanhiglaabjea";
    System.out.println(checkPalindromeFormation(a, b));

    //
  } 
  static public boolean checkPalindromeFormation(String a, String b) {
      return check(a, b) || check(b, a);
  }

  static public boolean check(String a,String b)
  {
    int ind=0;
    int jnd=b.length()-1;
    System.out.println(ind);
    System.out.println(jnd);
    while(ind < jnd && a.charAt(ind)==b.charAt(jnd))
    {
      ind++;
      jnd--;
    }
    // System.out.println(ind);
    // System.out.println(jnd);

    if(ind>jnd) return true;

    // System.out.println(a.substring(ind,jnd+1));

    // System.out.println(b.substring(ind,jnd+1));

    // System.out.println(isPlaindrom(a.substring(ind,jnd+1)));

    // System.out.println(isPlaindrom(b.substring(ind,jnd+1)));

    return isPlaindrom(a.substring(ind,jnd+1)) || isPlaindrom(b.substring(ind,jnd+1));
  }
  static public boolean isPlaindrom(String str)
  {
    int i=0;
    int j=str.length()-1;
    while(i<j)
    {
      if(str.charAt(i)==str.charAt(j))
      {
        i++;
        j--;
      }
      else{
        return false;
      }
    }
    return true;
  }

  
}
