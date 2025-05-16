package ru.ls.qa.school.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

class OddTaskTest {

  @Test
  void isOdd() {
    assertTrue(OddTask.isOdd(1));
    assertFalse(OddTask.isOdd(2));
    assertFalse(OddTask.isOdd(0));
    assertTrue(OddTask.isOdd(-1));
  }

}