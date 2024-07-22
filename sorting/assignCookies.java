package sorting;

import java.util.Arrays;

public class assignCookies {
  public static void main(String[] args) {
    int[] g = { 1, 2, 3 };
    int[] s = { 1, 2, 3 };
    System.out.println(findContentChildren(g, s));

  }

  static public int findContentChildren(int[] g, int[] s) {
    Arrays.sort(g);
    Arrays.sort(s);
    int i = 0;
    int j = 0;
    while (i < g.length && j < s.length) {
      if (s[j] >= g[i]) {
        i++;
      }
      j++;
    }
    return i;
  }

}
