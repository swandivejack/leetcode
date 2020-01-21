package io.libsoft.leetcode;

public class PalindromeNumber {


  public static void main(String[] args) {
//    System.out.println(new PalindromeNumber().isPalindrome(313));
//    System.out.println(new PalindromeNumber().isPalindrome(123));
//    System.out.println(new PalindromeNumber().isPalindrome(4554));
    System.out.println(new PalindromeNumber().isPalindrome(2147483647));
  }

  public boolean isPalindrome(int x) {
    // you reverse the number then test equality
    boolean palindrome = false;
    int temp = x;
    if (x < 0) {
      return false;
    }
    int len = (int) Math.log10(temp) + 1;
    long reversed = 0;
    int count = 0;
    while (temp > 0) {
      reversed += (temp % 10) * Math.pow(10, len - count - 1);
      temp /= 10;
      count++;
    }

    return reversed == x;
  }


}
