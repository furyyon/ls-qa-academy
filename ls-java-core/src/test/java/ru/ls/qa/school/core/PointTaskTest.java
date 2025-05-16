package ru.ls.qa.school.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PointTaskTest {

  @Test
  void distance1() {
    Point p1 = new Point(3, 7);
    Point p2 = new Point(5, 3);

    assertEquals(4.47213595499958, p1.distance(p2));
  }

  @Test
  void distance2() {
    Point p1 = new Point(-3, -7);
    Point p2 = new Point(-5, -3);

    assertEquals(4.47213595499958, p1.distance(p2));
  }

  @Test
  void distance3() {
    Point p1 = new Point(0, 0);
    Point p2 = new Point(0, 0);

    assertEquals(0, p1.distance(p2));
  }

  @Test
  void distance4() {
    Point p1 = new Point(-3, -7);
    Point p2 = new Point(5, 3);

    assertEquals(12.806248474865697, p1.distance(p2));
  }

  @Test
  void distance5() {
    Point p1 = new Point(0, 0);
    Point p2 = new Point(5, 3);

    assertEquals(5.830951894845301, p1.distance(p2));
  }

  @Test
  void distance6() {
    Point p1 = new Point(5, 3);
    Point p2 = new Point(5, 3);

    assertEquals(0, p1.distance(p2));
  }

  @Test
  void distance7() {
    Point p1 = new Point(3, 7);

    assertEquals(0, p1.distance(p1));
  }

  @Test
  void distance() {
    Point p1 = new Point(-3, -7);
    Point p2 = new Point(5, 3);

    assertEquals(p2.distance(p1), p1.distance(p2));
  }
}