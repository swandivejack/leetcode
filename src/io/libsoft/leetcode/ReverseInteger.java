package io.libsoft.leetcode;

public class ReverseInteger {


  public static void main(String[] args) {
//    System.out.println(new ReverseInteger().reverse(123));
//    System.out.println(new ReverseInteger().reverse(9));
    System.out.println(new ReverseInteger().reverse(123));
    System.out.println(new ReverseInteger().reverse(-123));
    System.out.println(new ReverseInteger().reverse(-2147483648));
  }

  public int reverse(int x) {
    if (x == Integer.MIN_VALUE){
      return 0;
    }
    long reversed = 0;
    int sign = (int) Math.signum(x);
    x = Math.abs(x);
    int len = (int) Math.log10(x) + 1;
    int digit;
    for (int i = 0; i < len; i++) {
      digit = (int) (x % 10 * Math.pow(10, len - i-1));
      if (reversed + digit > Integer.MAX_VALUE){
        return 0;
      }
      reversed += digit;
      x /= 10;
    }
    return (int) (reversed * sign);
  }
}
