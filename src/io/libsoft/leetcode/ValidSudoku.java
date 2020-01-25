package io.libsoft.leetcode;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {


  private static char[][] convert(String[][] strings) {
    char[][] chars = new char[strings.length][strings[0].length];
    for (int i = 0; i < strings.length; i++) {
      for (int j = 0; j < strings[0].length; j++) {
        chars[i][j] = strings[i][j].charAt(0);
      }
    }
    return chars;
  }

  public static void main(String[] args) {

    char[][] chars = convert(new String[][]{
        {"5", "3", ".", ".", "7", ".", ".", ".", "."},
        {"6", ".", ".", "1", "9", "5", ".", ".", "."},
        {".", "9", "8", ".", ".", ".", ".", "6", "."},
        {"8", ".", ".", ".", "6", ".", ".", ".", "3"},
        {"4", ".", ".", "8", ".", "3", ".", ".", "1"},
        {"7", ".", ".", ".", "2", ".", ".", ".", "6"},
        {".", "6", ".", ".", ".", ".", "2", "8", "."},
        {".", ".", ".", "4", "1", "9", ".", ".", "5"},
        {".", ".", ".", ".", "8", ".", ".", "7", "9"}
    });
    for (char[] aChar : chars) {
      System.out.println(aChar);
    }

    System.out.println(new ValidSudoku().isValidSudoku(chars));

  }

  public boolean isValidSudoku(char[][] board) {

    Set<Character> characterSet = new HashSet<>();
    // checks rows
    for (int i = 0; i < board.length; i++) {
      characterSet.clear();
      // checks rows

      for (char c : board[i]) {
        if (c != '.' && characterSet.contains(c)) {
          return false;
        } else {
          characterSet.add(c);
        }
      }
    }
    // checks columns
    for (int i = 0; i < board.length; i++) {
      characterSet.clear();
      for (int j = 0; j < board[i].length; j++) {
        char c = board[j][i];
        if (c != '.' && characterSet.contains(c)) {
          return false;
        } else {
          characterSet.add(c);
        }
      }
    }

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        characterSet.clear();
        for (int k = 0; k < 3; k++) {
          for (int l = 0; l < 3; l++) {
            char c = board[k + i * 3][l + j * 3];
            if (c != '.' && characterSet.contains(c)) {
              return false;
            } else {
              characterSet.add(c);
            }
          }
        }

      }

    }

    return true;
  }

}
