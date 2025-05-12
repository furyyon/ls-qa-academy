package ru.ls.qa.school.core;

public class PointTask {
    public static void main(String[] args) {
        Point p1 = new Point(3.0, 7.0);
        Point p2 = new Point(5.0, 3.0);
        double distance = p1.distance(p2);

        System.out.println("Расстояние между точками = " + distance);
    }
}
