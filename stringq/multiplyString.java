package stringq;

public class multiplyString {
    public static void main(String[] args)
    {
      String start="RXXLRXRXL";
      String end="XRLXXRRLX";
    System.out.println(canTransform(start, end));
    }
    static public boolean canTransform(String start, String end) {
        
      int i=0;
      int j=0;
      while (i<start.length()) {
        // System.out.println(start.substring(i, i+2).equals("RX"));
        // System.out.println(start.substring(i, i+2));
        if(start.substring(i, i+2).equals("XL") || start.substring(i, i+2).equals("RX"))
        {
          if(start.substring(i, i+2).equals("XL")  && end.substring(i, i+2).equals("LX"))
          {
            i=i+2;
          }
          if(start.substring(i, i+2).equals("RX") && end.substring(i, i+2).equals("XR"))
          {
            i=i+2;
          }
          else{
            return false;
          }

        }

      }


      return true;
    }
}
