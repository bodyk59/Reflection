package com.bogdan.kurchak;

import java.util.List;

/*
 * You are given 4 classes — Shape, Polygon, Square, Circle.
 * Classes Polygon and Circle both extend the class Shape, the class Square extends the class Polygon.
 * You need to implement a method that takes Shape array and adds every element to one of the provided Lists
 * based on their class.
 */

/**
 * @author Bogdan Kurchak
 */
public class Sort {
    public static void sortShapes(Shape2[] array,
                                  List<Shape2> shapes,
                                  List<Polygon> polygons,
                                  List<Square2> squares,
                                  List<Circle2> circles) {
        for (Shape2 shape : array) {
            if (shape.getClass() == Polygon.class) {
                polygons.add((Polygon) shape);
            } else if (shape.getClass() == Square2.class) {
                squares.add((Square2) shape);
            } else if (shape.getClass() == Circle2.class) {
                circles.add((Circle2) shape);
            } else {
                shapes.add(shape);
            }
        }
    }
}

class Shape2 { }
class Polygon extends Shape2 { }
class Square2 extends Polygon { }
class Circle2 extends Shape2 { }