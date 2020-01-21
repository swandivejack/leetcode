package io.libsoft.leetcode;

import java.util.LinkedList;
import java.util.List;

public class PalindromeLinkedList {


  public static void main(String[] args) {
    ListNode head = new ListNode(-129);
    head.next = new ListNode(-129);
    System.out.println(new PalindromeLinkedList().isPalindrome(head));


  }

  public boolean isPalindrome(ListNode head) {
    ListNode curr = head;
    List<Integer> ints = new LinkedList<>();

    while (curr != null) {
      ints.add(curr.val);
      curr = curr.next;
    }
    for (int i = 0; i < ints.size() / 2; i++) {
      if (!ints.get(i).equals(ints.get(ints.size() - i - 1))) {
        return false;
      }
    }
    return true;
  }

  public static class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }

    @Override
    public String toString() {
      return String.valueOf(this.val);
    }
  }
}
