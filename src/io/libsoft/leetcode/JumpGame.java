package io.libsoft.leetcode;

public class JumpGame {


  public static void main(String[] args) {
//    System.out.println(new JumpGame().canJump(new int[]{2, 3, 1, 1, 4}));
//    System.out.println(new JumpGame().canJump(new int[]{0}));
//    System.out.println(new JumpGame().canJump(new int[]{3, 2, 1, 0, 4}));
//    System.out.println(new JumpGame().canJump(new int[]{2, 5, 0, 0}));
//    System.out.println(new JumpGame().canJump(new int[]{3,0,8,2,0,0,1}));
//    System.out.println(new JumpGame().canJump(new int[]{5, 9, 3, 2, 1, 0, 2, 3, 3, 1, 0, 0}));



  }

  public boolean canJump(int[] nums) {
    return canJumpRec(nums, 0);
  }

  private boolean canJumpRec(int[] nums, int idx) {
    if (idx >= nums.length-1) {
      return true;
    }
    int maxHops = nums[idx];
    for (int i = maxHops; i > 0; i--) {
      if (canJumpRec(nums, idx + i)) {
        return true;
      }
    }
    return false;
  }

}
