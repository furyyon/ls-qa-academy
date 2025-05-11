package ru.ls.qa.school.core;

public class OddTask {
  public static boolean isOdd(int number) {
    return number % 2 != 0;
  }

  public static void main(String[] args) {
    int[] tNumber = {1, 3, 5, 4};
    for (int number : tNumber) {
      System.out.println("Число " + number + " нечетное? " + isOdd(number));
    }
  }
}
