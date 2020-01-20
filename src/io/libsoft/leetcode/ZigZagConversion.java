package io.libsoft.leetcode;

import java.util.LinkedList;
import java.util.List;

public class ZigZagConversion {

  public static void main(String[] args) {
    System.out.println(new ZigZagConversion().convert("PAYPALISHIRING", 3));
    System.out.println(new ZigZagConversion().convert2("PAYPALISHIRING", 3));
  }

  public String convert(String s, int numRows) {
    if (numRows <= 1) {
      return s;
    }
    String converted = "";
    List<List<Character>> zigs = new LinkedList<>();
    for (int i = 0; i < numRows; i++) {
      zigs.add(new LinkedList<>());
    }
    int col = -1;
    int row = 0;
    int count = 0, iter = 0;
    while (count < s.length()) {
      row = iter++ % numRows;
      if (row == 0) {
        col++;
      }
      if (col % (numRows - 1) == 0 || (col % (numRows - 1)) + row == numRows - 1) {
        zigs.get(row).add(s.charAt(count++));
      } else {
        zigs.get(row).add(' ');
      }
    }
    StringBuilder sb = new StringBuilder();

    for (List<Character> zig : zigs) {
      for (Character c : zig) {
        if (c != ' ') {
          sb.append(c);
        }
      }
      sb.append(' ');
    }
    return sb.toString();
  }

  private String convert2(String s, int numRows) {
    if (numRows < 2) {
      return s;
    }

    StringBuilder sb = new StringBuilder();

    for (int j = 0; j < 2 * numRows - 2; j++) {
      int i;
      for (i = 0; i < s.toCharArray().length; i += (2 * numRows - 2) + j) {
        sb.append(s.charAt(i));
      }
      for (int k = i+j; k < numRows - 2 + j; k++) {
        sb.append(s.charAt(k));
      }
    }

    return sb.toString();
  }


}
