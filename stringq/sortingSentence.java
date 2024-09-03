package stringq;

public class sortingSentence {
   public static void main(String[] args)
   {
     String str="is2 sentence4 This1 a3";
     System.out.println(sortSentence(str));
   }
  static public String sortSentence(String s) {
      String[] ans=s.split(" ");
      String[] value=new String[ans.length];
      for(int i=0;i<ans.length;i++)
      {
        String st=ans[i];
        value[st.charAt(st.length()-1)-'1']=st.substring(0,st.length()-1);
      }
      return String.join(" ",value);
    
   }
}
