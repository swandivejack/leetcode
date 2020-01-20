package io.libsoft.leetcode;

import java.util.Arrays;
import java.util.stream.IntStream;

public class DecompressRunLengthEncodedList {

  public static void main(String[] args) {

    System.out
        .println(Arrays
            .toString(
                new DecompressRunLengthEncodedList().decompressRLElist(new int[]{1, 2, 3, 4})));
  }

  public int[] decompressRLElist(int[] nums) {

    int len = IntStream.range(0, nums.length).filter(i -> i % 2 == 0)
        .map(i -> nums[i]).sum();

    int[] decomp = new int[len];
    int count = 0;
    for (int i = 0; i < nums.length; i+=2) {
      for (int j = 0; j < nums[i]; j++) {
        decomp[count++] = nums[i+1];
      }
    }
    return decomp;
  }


}
