package io.libsoft.leetcode;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class OrderlyQueueTest {

  @Test
  void orderlyQueue() {
    OrderlyQueue orderlyQueue = new OrderlyQueue();

    assertEquals("acb", orderlyQueue.orderlyQueue("cba", 1));


  }
}