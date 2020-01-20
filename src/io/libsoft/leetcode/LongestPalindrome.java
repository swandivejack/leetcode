package io.libsoft.leetcode;

public class LongestPalindrome {

  public static void main(String[] args) {
    System.out.println(new LongestPalindrome().longestPalindrome("babad"));
    System.out.println(new LongestPalindrome().longestPalindrome("cbbd"));
    System.out.println(new LongestPalindrome().longestPalindrome("a"));
//    System.out.println(new LongestPalindrome().isPalindrome("babad"));
  }

  public String longestPalindrome(String s) {
    String longest = "";
    char[] word = s.toCharArray();
    for (int i = 0; i < word.length; i++) {
      int j = 0;
      String st;
      while (i - j >= 0 && j + i <= word.length - 1) {
        if ((i+j <= word.length - 2 && isPalindrome(st = s.substring(i - j, i + j + 2)))
            || isPalindrome(st = s.substring(i - j, i + j + 1))) {
          if (st.length() > longest.length()) {
            longest = st;
          }
          j++;
        }
        else {
          break;
        }
      }

    }

    return longest;
  }

  private boolean isPalindrome(String str) {
    char[] s = str.toCharArray();
    for (int i = 0; i < s.length / 2; i++) {
      if (s[i] != s[s.length - 1 - i]) {
        return false;
      }
    }
    return true;
  }
}
