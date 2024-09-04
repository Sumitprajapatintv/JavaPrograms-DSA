package stringq;

public class goalParser {
  public static void main(String[] args)
  {
    String str = new String("(al)G(al)()()G");
    System.out.println(interpret(str));

  }
  static public String interpret(String command) {
    StringBuilder interpreted = new StringBuilder();
    for(int i=0;i<command.length();i++)
    {
      char currentChar=command.charAt(i);
        if(currentChar=='G')  
        {
          interpreted.append(currentChar);
        }
        else if(currentChar=='(')
        {
            if(command.charAt(i+1)==')')
            {
              interpreted.append('o');
              i++;
            }
        }
        else
        {
          interpreted.append("al");
          i+=2;
        }
    }
    return interpreted.toString();
}
  
  
}
