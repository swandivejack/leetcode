package io.libsoft.leetcode;

import io.libsoft.leetcode.PalindromeLinkedList.ListNode;

public class ReverseSinglyLinkedList {

  // 1->2->3->4->5->NULL
  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    ListNode curr = head;
    Integer[] values = new Integer[]{1,2,3,4,5};
    for (int i = 1; i < values.length; i++) {
      curr.next = new ListNode(values[i]);
      curr = curr.next;
    }

    printList(head);
    head = new ReverseSinglyLinkedList().reverseList(head);
    printList(head);
  }

  static void printList(ListNode head){

    ListNode curr = head;
    while (curr != null){
      System.out.print(curr.val+" ");
      curr = curr.next;
    }
    System.out.println();
  }

  public ListNode reverseList(ListNode head) {
    if (head == null){
      return null;
    }
    ListNode prevNode = head;
    ListNode curr = head.next;
    prevNode.next = null;

    while(curr != null){
      ListNode next = curr.next;
      curr.next = prevNode;
      prevNode = curr;
      curr = next;
    }

    return prevNode;
  }
}
