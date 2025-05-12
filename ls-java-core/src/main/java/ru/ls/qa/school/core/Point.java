package ru.ls.qa.school.core;

public class Point {
    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point point) {
        double xcor = this.x - point.x; //  координаты х
        double ycor = this.y - point.y; // координаты y

        return Math.sqrt((xcor * xcor) + (ycor * ycor));

    }
}
