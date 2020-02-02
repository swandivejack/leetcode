package io.libsoft.leetcode;

class NumArray {

  private int[] arr;

  public NumArray(int[] nums) {
    this.arr = nums;
  }

  public void update(int i, int val) {
    arr[i] = val;
  }

  public int sumRange(int i, int j) {
    int sum = 0;
    for (int k = i; k < j + 1; k++) {
      sum += arr[k];
    }
    return sum;
  }
}
