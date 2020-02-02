package io.libsoft.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class NumArrayTest {


  @Test
  void sumRange() {
    NumArray numArray = new NumArray(new int[]{1, 3, 5});
    assertEquals(9, numArray.sumRange(0, 2));
    numArray.update(1, 2);
    assertEquals(8, numArray.sumRange(0, 2));
  }
}