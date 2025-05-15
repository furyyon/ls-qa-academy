package ru.ls.qa.school.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PointTaskTest {

  @Test
  void distance() {
    Point p1 = new Point(3, 7);
    Point p2 = new Point(5, 3);

    assertEquals(4.47213595499958, p1.distance(p2));
  }
}